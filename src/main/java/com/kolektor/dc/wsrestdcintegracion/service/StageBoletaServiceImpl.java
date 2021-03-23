package com.kolektor.dc.wsrestdcintegracion.service;

import com.kolektor.dc.wsrestdcintegracion.data.*;
import com.kolektor.dc.wsrestdcintegracion.model.gant.StageBoletaGantDTO;
import com.kolektor.dc.wsrestdcintegracion.model.gant.StageDetallePagoGantDTO;
import com.kolektor.dc.wsrestdcintegracion.model.gant.StagePagoGantDTO;
import com.kolektor.dc.wsrestdcintegracion.model.psrm.StageBoletaPSRMDTO;
import com.kolektor.dc.wsrestdcintegracion.model.psrm.StageDetallePagoPSRMDTO;
import com.kolektor.dc.wsrestdcintegracion.model.psrm.StagePagoPSRMDTO;
import com.kolektor.dc.wsrestdcintegracion.repository.*;
import com.kolektor.dc.wsrestdcintegracion.utiles.conversores.Mensajes;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;


@Service
public class StageBoletaServiceImpl implements IStageBoletaService {

    @Autowired
    private IStageBoletaRepository stageBoletasRepository;
    @Autowired
    private IStagePagoRepository stagePagoRepository;
    @Autowired
    private IStageDetallePagoRepository stageDetallePagoRepository;
    @Autowired
    private IConceptoRepository conceptoRepository;
    @Autowired
    private ILogErrorRepository logErrorRepository;
    @Autowired
    Mensajes mensajes;
    private final Logger log = LoggerFactory.getLogger(StageBoletaServiceImpl.class);

    @Override
    @Transactional
    public void savePSRM(StageBoletaPSRMDTO dto, String origen) throws Exception {
        log.debug("Inicio metodo savePSRM(StageBoletaPSRMDTO dto)");

        // Validacion
        if(dto.getTipoPago().equals("CONTADO") && dto.getCantCuotas() != 0) {
            log.error(mensajes.get("pagocontado.muchascuotas"));
            throw new Exception(mensajes.get("pagocontado.muchascuotas"));
        } else if(dto.getTipoPago().equals("CUOTA") && dto.getCantCuotas() == 0) {
            log.error(mensajes.get("pagocuotas.unicacuota"));
            throw new Exception(mensajes.get("pagocuotas.unicacuota"));
        }

        String username;
        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        if (principal instanceof UserDetails) {
            username = ((UserDetails)principal).getUsername().toUpperCase().split("#")[0];
        } else {
            username = principal.toString().toUpperCase().split("#")[0];
        }

        StageBoletaEntity boletaEntity = new StageBoletaEntity();
        //
        boletaEntity.setOrigen(origen);
        boletaEntity.setIdEventoPago(dto.getIdEventoPago());
        boletaEntity.setIdBoleta(dto.getIdBoleta());
        boletaEntity.setIdPersona(dto.getIdPersona());
        boletaEntity.setTipoDocumento(dto.getTipoDocumento());
        boletaEntity.setNroDocumento(dto.getNroDocumento());
        boletaEntity.setApellidoNombre(dto.getApellidoNombre());
        boletaEntity.setCodBarra(dto.getCodBarra());
        boletaEntity.setMontoPagado(dto.getMontoPagado());
        boletaEntity.setEnte(dto.getIdRecaudador());
        boletaEntity.setTipoPago(dto.getTipoPago());
        boletaEntity.setMedioPago(dto.getMedioPago());
        boletaEntity.setCantCuotas(dto.getCantCuotas());
        boletaEntity.setEstado("A");
        boletaEntity.setFechaVencimiento(dto.getFechaVencimiento());
        boletaEntity.setMoneda(dto.getMoneda());
        boletaEntity.setFechaPago(dto.getFechaPago());
        boletaEntity.setIdCuentaContribuyente(dto.getIdCuentaContribuyente());
        boletaEntity.setIdReferencia(dto.getIdReferencia());
        boletaEntity.setUsuarioAlta(username);
        boletaEntity.setUsuarioModificacion(username);

        boletaEntity = stageBoletasRepository.save(boletaEntity);

        for(StagePagoPSRMDTO pagoDTO : dto.getListPagos()) {
            StagePagoEntity pagoEntity = new StagePagoEntity();
            pagoEntity.setIdStageBoletaRecibida(boletaEntity.getIdStageBoletaRecibida());
            pagoEntity.setIdEventoPago(dto.getIdEventoPago());
            pagoEntity.setIdObligacion(pagoDTO.getIdObligacion());
            pagoEntity.setIdBoleta(dto.getIdBoleta());
            pagoEntity.setIdEncomendante(pagoDTO.getIdEncomendante());
            pagoEntity.setIdPago(pagoDTO.getIdPago());
            pagoEntity.setIdPersona(pagoDTO.getIdPersona());
            pagoEntity.setTipoDocumento(pagoDTO.getTipoDocumento());
            pagoEntity.setNroDocumento(pagoDTO.getNroDocumento());
            pagoEntity.setApellidoNombre(pagoDTO.getApellidoNombre());
            pagoEntity.setCodBarra(pagoDTO.getCodBarra());
            pagoEntity.setIdTipoObligacion(pagoDTO.getIdTipoObligacion());
            pagoEntity.setDescripcionTipoObligacion(pagoDTO.getDescripcionTipoObligacion());
            pagoEntity.setFechaVencimientoObligacion(pagoDTO.getFechaVencimientoObligacion());
            pagoEntity.setFechaInicioObligacion(pagoDTO.getFechaInicioObligacion());
            pagoEntity.setFechaPago(dto.getFechaPago());
            pagoEntity.setIdExterno(pagoDTO.getIdExterno());
            pagoEntity.setMontoPagado(pagoDTO.getMontoPagado());
            pagoEntity.setMoneda(dto.getMoneda());
            pagoEntity.setTipoPago(dto.getTipoPago());
            pagoEntity.setMedioPago(dto.getMedioPago());
            pagoEntity.setEstado("A");
            pagoEntity.setUsuarioAlta(boletaEntity.getUsuarioAlta());
            pagoEntity.setUsuarioModificacion(boletaEntity.getUsuarioAlta());

            pagoEntity = stagePagoRepository.save(pagoEntity);

            if(pagoDTO.getListDetallesPago() != null && !pagoDTO.getListDetallesPago().isEmpty()) {
                for(StageDetallePagoPSRMDTO detalleDTO : pagoDTO.getListDetallesPago()) {
                    StageDetallePagoEntity detalleEntity = new StageDetallePagoEntity();
                    detalleEntity.setIdStagePagoRecibido(pagoEntity.getIdStagePagoRecibido());
                    detalleEntity.setIdEventoPago(dto.getIdEventoPago());
                    detalleEntity.setIdObligacion(pagoDTO.getIdObligacion());
                    detalleEntity.setIdPago(pagoDTO.getIdPago());
                    detalleEntity.setIdMovimiento(detalleDTO.getIdTransaccion());
                    detalleEntity.setTipoMovimiento(detalleDTO.getTipoMovimiento());
                    detalleEntity.setTransaccionVirtual("false");
                    detalleEntity.setMontoPagado(detalleDTO.getMontoPagado());
                    detalleEntity.setEstado("A");
                    detalleEntity.setMoneda(dto.getMoneda());
                    detalleEntity.setUsuarioAlta(boletaEntity.getUsuarioAlta());
                    detalleEntity.setUsuarioModificacion(boletaEntity.getUsuarioAlta());
                    detalleEntity.setMontoAcumuladoDescuento(BigDecimal.ZERO);

                    stageDetallePagoRepository.save(detalleEntity);
                }
            }

        }

        log.debug("Fin metodo savePSRM(StageBoletaPSRMDTO dto)");
    }

    @Override
    public void saveGANT(StageBoletaGantDTO dto, String origen) throws Exception {
        log.debug("Inicio metodo saveGANT(StageBoletaPSRMDTO dto)");

        // Validacion
        if(dto.getTipoPago().equals("CONTADO") && dto.getCantCuotas() != 0) {
            log.error(mensajes.get("pagocontado.muchascuotas"));
            throw new Exception(mensajes.get("pagocontado.muchascuotas"));
        } else if(dto.getTipoPago().equals("CUOTA") && dto.getCantCuotas() == 1) {
            log.error(mensajes.get("pagocuotas.unicacuota"));
            throw new Exception(mensajes.get("pagocuotas.unicacuota"));
        }

        String username;
        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        if (principal instanceof UserDetails) {
            username = ((UserDetails)principal).getUsername().toUpperCase().split("#")[0];
        } else {
            username = principal.toString().toUpperCase().split("#")[0];
        }

        StageBoletaEntity boletaEntity = new StageBoletaEntity();
        //
        boletaEntity.setOrigen(origen);
        boletaEntity.setIdEventoPago(dto.getIdEventoPago());
        boletaEntity.setIdBoleta(dto.getIdBoleta());
        boletaEntity.setIdPersona(dto.getIdPersona());
        boletaEntity.setTipoDocumento(dto.getTipoDocumento());
        boletaEntity.setNroDocumento(dto.getNroDocumento());
        boletaEntity.setApellidoNombre(dto.getApellidoNombre());
        boletaEntity.setCodBarra(dto.getCodBarra());
        boletaEntity.setMontoPagado(dto.getMontoPagado());
        boletaEntity.setEnte(dto.getIdRecaudador());
        boletaEntity.setTipoPago(dto.getTipoPago());
        boletaEntity.setMedioPago(dto.getMedioPago());
        boletaEntity.setCantCuotas(dto.getCantCuotas());
        boletaEntity.setEstado("A");
        boletaEntity.setFechaVencimiento(dto.getFechaVencimiento());
        boletaEntity.setMoneda(dto.getMoneda());
        boletaEntity.setFechaPago(dto.getFechaPago());
        boletaEntity.setIdCuentaContribuyente(dto.getIdCuentaContribuyente());
        boletaEntity.setIdReferencia(dto.getIdReferencia());
        boletaEntity.setUsuarioAlta(username);
        boletaEntity.setUsuarioModificacion(username);

        boletaEntity = stageBoletasRepository.save(boletaEntity);

        for(StagePagoGantDTO pagoDTO : dto.getListPagos()) {
            StagePagoEntity pagoEntity = new StagePagoEntity();
            pagoEntity.setIdStageBoletaRecibida(boletaEntity.getIdStageBoletaRecibida());
            pagoEntity.setIdEventoPago(dto.getIdEventoPago());
            pagoEntity.setIdObligacion(pagoDTO.getIdObligacion());
            pagoEntity.setIdBoleta(dto.getIdBoleta());
            pagoEntity.setIdEncomendante(pagoDTO.getIdEncomendante());
            pagoEntity.setIdPago(pagoDTO.getIdPago());
            pagoEntity.setCodBarra(pagoDTO.getCodBarra());
            pagoEntity.setIdTipoObligacion(pagoDTO.getIdTipoObligacion());
            pagoEntity.setDescripcionTipoObligacion(pagoDTO.getDescripcionTipoObligacion());
            pagoEntity.setFechaVencimientoObligacion(pagoDTO.getFechaVencimientoObligacion());
            pagoEntity.setFechaInicioObligacion(pagoDTO.getFechaInicioObligacion());
            pagoEntity.setFechaPago(dto.getFechaPago());
            pagoEntity.setIdExterno(pagoDTO.getIdExterno());
            pagoEntity.setMontoPagado(pagoDTO.getMontoPagado());
            pagoEntity.setMoneda(dto.getMoneda());
            pagoEntity.setTipoPago(dto.getTipoPago());
            pagoEntity.setMedioPago(dto.getMedioPago());
            pagoEntity.setEstado("A");
            pagoEntity.setUsuarioAlta(boletaEntity.getUsuarioAlta());
            pagoEntity.setUsuarioModificacion(boletaEntity.getUsuarioAlta());
            pagoEntity.setNroLiquidacion(pagoDTO.getNroLiquidacionJudicial());
            pagoEntity.setInstanciaGestion(pagoDTO.getInstanciaGestion());

            pagoEntity = stagePagoRepository.save(pagoEntity);

            if(pagoDTO.getListDetallesPago() != null && !pagoDTO.getListDetallesPago().isEmpty()) {
                for(StageDetallePagoGantDTO detalleDTO : pagoDTO.getListDetallesPago()) {
                    StageDetallePagoEntity detalleEntity = new StageDetallePagoEntity();
                    detalleEntity.setIdStagePagoRecibido(pagoEntity.getIdStagePagoRecibido());
                    detalleEntity.setIdEventoPago(dto.getIdEventoPago());
                    detalleEntity.setIdObligacion(pagoDTO.getIdObligacion());
                    detalleEntity.setIdPago(pagoDTO.getIdPago());
                    detalleEntity.setTipoMovimiento(detalleDTO.getTipoMovimiento());
                    detalleEntity.setTransaccionVirtual("false");
                    detalleEntity.setMontoPagado(detalleDTO.getMontoPagado());
                    detalleEntity.setEstado("A");
                    detalleEntity.setMoneda(dto.getMoneda());
                    detalleEntity.setUsuarioAlta(boletaEntity.getUsuarioAlta());
                    detalleEntity.setUsuarioModificacion(boletaEntity.getUsuarioAlta());
                    detalleEntity.setMontoAcumuladoDescuento(BigDecimal.ZERO);

                    stageDetallePagoRepository.save(detalleEntity);
                }
            }

        }

        log.debug("Fin metodo savePSRM(StageBoletaGANTDTO dto)");
    }
}
