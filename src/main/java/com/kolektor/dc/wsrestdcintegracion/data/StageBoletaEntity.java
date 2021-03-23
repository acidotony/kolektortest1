package com.kolektor.dc.wsrestdcintegracion.data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name = "STAGE_BOLETAS_RECIBIDAS")
public class StageBoletaEntity {

    @Id
    @Column(name = "SBR_ID", nullable = false, precision = 0)
    @GeneratedValue(generator = "SEQ_STAGE_BOLETAS_RECIBIDAS")
    @SequenceGenerator(name = "SEQ_STAGE_BOLETAS_RECIBIDAS", sequenceName = "SEQ_STAGE_BOLETAS_RECIBIDAS_ID", allocationSize = 1)
    private Long idStageBoletaRecibida;
    @Basic
    @Column(name = "SBR_ORIGEN", nullable = false, length = 12)
    private String origen;
    @Basic
    @Column(name = "SBR_PAY_EVENT_ID", nullable = true, length = 12)
    private String idEventoPago;
    @Basic
    @Column(name = "SBR_ID_BOLETA", nullable = false, length = 40)
    private String idBoleta;
    @Basic
    @Column(name = "SBR_ID_PERSONA", nullable = false, length = 10)
    private String idPersona;
    @Basic
    @Column(name = "SBR_TIPO_CUIT", nullable = false, length = 10)
    private String tipoDocumento;
    @Basic
    @Column(name = "SBR_CUIT", nullable = false, length = 13)
    private String nroDocumento;
    @Basic
    @Column(name = "SBR_APENOM", nullable = false, length = 250)
    private String apellidoNombre;
    @Basic
    @Column(name = "SBR_COD_BARRA", nullable = false, length = 84)
    private String codBarra;
    @Basic
    @Column(name = "SBR_MONTO_ORIGINAL", nullable = false, precision = 2)
    private BigDecimal montoOriginal;
    @Basic
    @Column(name = "SBR_MONTO_ACTUALIZADO", nullable = false, precision = 2)
    private BigDecimal montoActualizado;
    @Basic
    @Column(name = "SBR_MONTO_PAGADO", nullable = true, precision = 2)
    private BigDecimal montoPagado;
    @Basic
    @Column(name = "SBR_ENTE", nullable = true, length = 50)
    private String ente;
    @Basic
    @Column(name = "SBR_TIPO_PAGO", nullable = true, length = 50)
    private String tipoPago;
    @Basic
    @Column(name = "SBR_MEDIO_PAGO", nullable = true, length = 50)
    private String medioPago;
    @Basic
    @Column(name = "SBR_CANT_CUOTAS", nullable = true, precision = 0)
    private Long cantCuotas;
    @Basic
    @Column(name = "SBR_ESTADO", nullable = false, length = 1)
    private String estado;
    @Basic
    @Column(name = "SBR_OBS", nullable = true, length = 250)
    private String observaciones;
    @Basic
    @Column(name = "SBR_FECHA_VENCIMIENTO", nullable = false)
    private LocalDate fechaVencimiento;
    @Basic
    @Column(name = "SBR_FECHA_EMISION", nullable = false)
    private LocalDate fechaEmision;
    @Basic
    @Column(name = "SBR_MONEDA", nullable = false, length = 10)
    private String moneda;
    @Basic
    @Column(name = "SBR_FECHA_PAGO", nullable = false)
    private LocalDate fechaPago;
    @Basic
    @Column(name = "SBR_FECHA_CREACION", nullable = false)
    private LocalDate fechaCreacion;
    @Basic
    @Column(name = "SBR_FECHA_EFFDT", nullable = true)
    private LocalDate fechaEfectiva;
    @Basic
    @Column(name = "SBR_TENDER_ID", nullable = true, length = 12)
    private String idMedioPago;
    @Basic
    @Column(name = "SBR_CTL_ID", nullable = true, precision = 0)
    private Long idControlCaja;
    @Basic
    @Column(name = "SBR_ACCT_ID", nullable = true, length = 10)
    private String idCuentaContribuyente;
    @Basic
    @Column(name = "SBR_REFERENCE_ID", nullable = true, length = 50)
    private String idReferencia;
    @Basic
    @Column(name = "SBR_USU_ALTA", nullable = false, length = 50)
    private String usuarioAlta;
    @Basic
    @Column(name = "SBR_FECHA_ALTA", nullable = false)
    private Date fechaAlta;
    @Basic
    @Column(name = "SBR_USU_MODIF", nullable = true, length = 50)
    private String usuarioModificacion;
    @Basic
    @Column(name = "SBR_FECHA_MODIF", nullable = true)
    private Date fechaModificacion;
    @Basic
    @Column(name = "SBR_USU_BAJA", nullable = true, length = 50)
    private String usuarioBaja;
    @Basic
    @Column(name = "SBR_FECHA_BAJA", nullable = true)
    private Date fechaBaja;
    @Basic
    @Column(name = "SBR_NIFI_STATUS", nullable = true, length = 1)
    private String estadoNifi;


    public Long getIdStageBoletaRecibida() {
        return idStageBoletaRecibida;
    }

    public void setIdStageBoletaRecibida(Long idStageBoletaRecibida) {
        this.idStageBoletaRecibida = idStageBoletaRecibida;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getIdEventoPago() {
        return idEventoPago;
    }

    public void setIdEventoPago(String idEventoPago) {
        this.idEventoPago = idEventoPago;
    }

    public String getIdBoleta() {
        return idBoleta;
    }

    public void setIdBoleta(String idBoleta) {
        this.idBoleta = idBoleta;
    }

    public String getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(String idPersona) {
        this.idPersona = idPersona;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getNroDocumento() {
        return nroDocumento;
    }

    public void setNroDocumento(String nroDocumento) {
        this.nroDocumento = nroDocumento;
    }

    public String getApellidoNombre() {
        return apellidoNombre;
    }

    public void setApellidoNombre(String apellidoNombre) {
        this.apellidoNombre = apellidoNombre;
    }

    public String getCodBarra() {
        return codBarra;
    }

    public void setCodBarra(String codBarra) {
        this.codBarra = codBarra;
    }

    public BigDecimal getMontoOriginal() {
        return montoOriginal;
    }

    public void setMontoOriginal(BigDecimal montoOriginal) {
        this.montoOriginal = montoOriginal;
    }

    public BigDecimal getMontoActualizado() {
        return montoActualizado;
    }

    public void setMontoActualizado(BigDecimal montoActualizado) {
        this.montoActualizado = montoActualizado;
    }

    public BigDecimal getMontoPagado() {
        return montoPagado;
    }

    public void setMontoPagado(BigDecimal montoPagado) {
        this.montoPagado = montoPagado;
    }

    public String getEnte() {
        return ente;
    }

    public void setEnte(String ente) {
        this.ente = ente;
    }

    public String getTipoPago() {
        return tipoPago;
    }

    public void setTipoPago(String tipoPago) {
        this.tipoPago = tipoPago;
    }

    public String getMedioPago() {
        return medioPago;
    }

    public void setMedioPago(String medioPago) {
        this.medioPago = medioPago;
    }

    public Long getCantCuotas() {
        return cantCuotas;
    }

    public void setCantCuotas(Long cantCuotas) {
        this.cantCuotas = cantCuotas;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(LocalDate fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public LocalDate getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(LocalDate fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    public LocalDate getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(LocalDate fechaPago) {
        this.fechaPago = fechaPago;
    }

    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDate fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public LocalDate getFechaEfectiva() {
        return fechaEfectiva;
    }

    public void setFechaEfectiva(LocalDate fechaEfectiva) {
        this.fechaEfectiva = fechaEfectiva;
    }

    public String getIdMedioPago() {
        return idMedioPago;
    }

    public void setIdMedioPago(String idMedioPago) {
        this.idMedioPago = idMedioPago;
    }

    public Long getIdControlCaja() {
        return idControlCaja;
    }

    public void setIdControlCaja(Long idControlCaja) {
        this.idControlCaja = idControlCaja;
    }

    public String getIdCuentaContribuyente() {
        return idCuentaContribuyente;
    }

    public void setIdCuentaContribuyente(String idCuentaContribuyente) {
        this.idCuentaContribuyente = idCuentaContribuyente;
    }

    public String getIdReferencia() {
        return idReferencia;
    }

    public void setIdReferencia(String idReferencia) {
        this.idReferencia = idReferencia;
    }

    public String getUsuarioAlta() {
        return usuarioAlta;
    }

    public void setUsuarioAlta(String usuarioAlta) {
        this.usuarioAlta = usuarioAlta;
    }

    public Date getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(Date fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public String getUsuarioModificacion() {
        return usuarioModificacion;
    }

    public void setUsuarioModificacion(String usuarioModificacion) {
        this.usuarioModificacion = usuarioModificacion;
    }

    public Date getFechaModificacion() {
        return fechaModificacion;
    }

    public void setFechaModificacion(Date fechaModificacion) {
        this.fechaModificacion = fechaModificacion;
    }

    public String getUsuarioBaja() {
        return usuarioBaja;
    }

    public void setUsuarioBaja(String usuarioBaja) {
        this.usuarioBaja = usuarioBaja;
    }

    public Date getFechaBaja() {
        return fechaBaja;
    }

    public void setFechaBaja(Date fechaBaja) {
        this.fechaBaja = fechaBaja;
    }

    public String getEstadoNifi() {
        return estadoNifi;
    }

    public void setEstadoNifi(String estadoNifi) {
        this.estadoNifi = estadoNifi;
    }

}
