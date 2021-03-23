package com.kolektor.dc.wsrestdcintegracion.model.gant;

import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class StagePagoGantDTO {
    @NotEmpty(message = "{idobligacion.notempty}")
    private String idObligacion;
    @NotNull(message = "{identeencomendante.notnull}")
    private String idEncomendante;
    private String idPago;
    private String codBarra;
    @NotEmpty(message = "{idtipoobligacion.notempty}")
    private String idTipoObligacion;
    private String descripcionTipoObligacion;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @NotNull(message = "{fechavenvimiento.notnull}")
    private LocalDate fechaVencimientoObligacion;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate fechaInicioObligacion;
    @Size(max = 13, message = "{idexterno.maxlength}")
    private String idExterno;
    @Positive(message = "{montopagado.positive}")
    @NotNull(message = "{montopagado.notnull}")
    private BigDecimal montoPagado;
    private String nroLiquidacionJudicial;
    @NotEmpty(message = "{instanciagestion.notempty}")
    private String instanciaGestion;
    @Valid
    @NotEmpty(message = "{detallespago.required}")
    private List<StageDetallePagoGantDTO> listDetallesPago;

    public String getIdObligacion() {
        return idObligacion;
    }

    public void setIdObligacion(String idObligacion) {
        this.idObligacion = idObligacion;
    }

    public String getIdEncomendante() {
        return idEncomendante;
    }

    public void setIdEncomendante(String idEncomendante) {
        this.idEncomendante = idEncomendante;
    }

    public String getIdPago() {
        return idPago;
    }

    public void setIdPago(String idPago) {
        this.idPago = idPago;
    }

    public String getCodBarra() {
        return codBarra;
    }

    public void setCodBarra(String codBarra) {
        this.codBarra = codBarra;
    }

    public String getIdTipoObligacion() {
        return idTipoObligacion;
    }

    public void setIdTipoObligacion(String idTipoObligacion) {
        this.idTipoObligacion = idTipoObligacion;
    }

    public String getDescripcionTipoObligacion() {
        return descripcionTipoObligacion;
    }

    public void setDescripcionTipoObligacion(String descripcionTipoObligacion) {
        this.descripcionTipoObligacion = descripcionTipoObligacion;
    }

    public LocalDate getFechaVencimientoObligacion() {
        return fechaVencimientoObligacion;
    }

    public void setFechaVencimientoObligacion(LocalDate fechaVencimientoObligacion) {
        this.fechaVencimientoObligacion = fechaVencimientoObligacion;
    }

    public LocalDate getFechaInicioObligacion() {
        return fechaInicioObligacion;
    }

    public void setFechaInicioObligacion(LocalDate fechaInicioObligacion) {
        this.fechaInicioObligacion = fechaInicioObligacion;
    }

    public String getIdExterno() {
        return idExterno;
    }

    public void setIdExterno(String idExterno) {
        this.idExterno = idExterno;
    }

    public BigDecimal getMontoPagado() {
        return montoPagado;
    }

    public void setMontoPagado(BigDecimal montoPagado) {
        this.montoPagado = montoPagado;
    }

    public String getNroLiquidacionJudicial() {
        return nroLiquidacionJudicial;
    }

    public void setNroLiquidacionJudicial(String nroLiquidacionJudicial) {
        this.nroLiquidacionJudicial = nroLiquidacionJudicial;
    }

    public String getInstanciaGestion() {
        return instanciaGestion;
    }

    public void setInstanciaGestion(String instanciaGestion) {
        this.instanciaGestion = instanciaGestion;
    }

    public List<StageDetallePagoGantDTO> getListDetallesPago() {
        return listDetallesPago;
    }

    public void setListDetallesPago(List<StageDetallePagoGantDTO> listDetallesPago) {
        this.listDetallesPago = listDetallesPago;
    }
}
