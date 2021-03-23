package com.kolektor.dc.wsrestdcintegracion.data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "STAGE_PAGOS_RECIBIDOS")
public class StagePagoEntity {

    private Long idStagePagoRecibido;
    private Long idStageBoletaRecibida;
    private String idEventoPago;
    private String idObligacion;
    private String idBoleta;
    private String idEncomendante;
    private Long idRecaudador;
    private Long idInteresado;
    private String idPago;
    private String idTransaccionFinanciera;
    private String idPersona;
    private String tipoDocumento;
    private String nroDocumento;
    private String apellidoNombre;
    private String descripcionObligacion;
    private String codBarra;
    private String idTipoObligacion;
    private String descripcionTipoObligacion;
    private LocalDate fechaVencimientoObligacion;
    private LocalDate fechaInicioObligacion;
    private LocalDate fechaFinObligacion;
    private LocalDate fechaPago;
    private String idExterno;
    private BigDecimal montoOriginal;
    private BigDecimal montoActualizado;
    private BigDecimal montoIntereses;
    private BigDecimal montoCapital;
    private BigDecimal montoPagado;
    private String moneda;
    private String reglaImputa;
    private String tipoPago;
    private String medioPago;
    private String tipoBenef;
    private String descripcionBeneficio;
    private Double montoBeneficio;
    private String estadoObligacion;
    private String estadoGestion;
    private String estado;
    private String observaciones;
    private String usuarioAlta;
    private Date fechaAlta;
    private String usuarioModificacion;
    private Date fechaModifacion;
    private Date fechaBaja;
    private String usuarioBaja;
    private String nroLiquidacion;
    private String instanciaGestion;

    public void setIdStagePagoRecibido(Long idStagePagoRecibido) {
        this.idStagePagoRecibido = idStagePagoRecibido;
    }

    @Id
    @Column(name = "SPR_ID", nullable = false, precision = 0)
    @GeneratedValue(generator = "SEQ_STAGE_PAGOS_RECIBIDOS")
    @SequenceGenerator(name = "SEQ_STAGE_PAGOS_RECIBIDOS", sequenceName = "SEQ_STAGE_PAGOS_RECIBIDOS_ID", allocationSize = 1)
    public Long getIdStagePagoRecibido() {
        return idStagePagoRecibido;
    }

    @Basic
    @Column(name = "SPR_SBR_ID", nullable = true, precision = 0)
    public Long getIdStageBoletaRecibida() {
        return idStageBoletaRecibida;
    }

    public void setIdStageBoletaRecibida(Long idStageBoletaRecibida) {
        this.idStageBoletaRecibida = idStageBoletaRecibida;
    }

    @Basic
    @Column(name = "SPR_PAY_EVENT_ID", nullable = true, length = 12)
    public String getIdEventoPago() {
        return idEventoPago;
    }

    public void setIdEventoPago(String idEventoPago) {
        this.idEventoPago = idEventoPago;
    }

    @Basic
    @Column(name = "SPR_ID_OBLIG", nullable = false, length = 40)
    public String getIdObligacion() {
        return idObligacion;
    }

    public void setIdObligacion(String idObligacion) {
        this.idObligacion = idObligacion;
    }

    @Basic
    @Column(name = "SPR_ID_BOLETA", nullable = false, length = 40)
    public String getIdBoleta() {
        return idBoleta;
    }

    public void setIdBoleta(String idBoleta) {
        this.idBoleta = idBoleta;
    }

    @Basic
    @Column(name = "SPR_ID_ENCOME", nullable = false, precision = 0)
    public String getIdEncomendante() {
        return idEncomendante;
    }

    public void setIdEncomendante(String idEncomendante) {
        this.idEncomendante = idEncomendante;
    }

    @Basic
    @Column(name = "SPR_ID_RECAUDA", nullable = true, precision = 0)
    public Long getIdRecaudador() {
        return idRecaudador;
    }

    public void setIdRecaudador(Long idRecaudador) {
        this.idRecaudador = idRecaudador;
    }

    @Basic
    @Column(name = "SPR_ID_INTERESADO", nullable = true, precision = 0)
    public Long getIdInteresado() {
        return idInteresado;
    }

    public void setIdInteresado(Long idInteresado) {
        this.idInteresado = idInteresado;
    }

    @Basic
    @Column(name = "SPR_PAY_ID", nullable = true, length = 12)
    public String getIdPago() {
        return idPago;
    }

    public void setIdPago(String idPago) {
        this.idPago = idPago;
    }

    @Basic
    @Column(name = "SPR_FT_ID", nullable = true, length = 12)
    public String getIdTransaccionFinanciera() {
        return idTransaccionFinanciera;
    }

    public void setIdTransaccionFinanciera(String idTransaccionFinanciera) {
        this.idTransaccionFinanciera = idTransaccionFinanciera;
    }

    @Basic
    @Column(name = "SPR_ID_PERSONA", nullable = true, length = 10)
    public String getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(String idPersona) {
        this.idPersona = idPersona;
    }

    @Basic
    @Column(name = "SPR_TIPO_CUIT", nullable = true, length = 13)
    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    @Basic
    @Column(name = "SPR_CUIT", nullable = true, length = 13)
    public String getNroDocumento() {
        return nroDocumento;
    }

    public void setNroDocumento(String nroDocumento) {
        this.nroDocumento = nroDocumento;
    }

    @Basic
    @Column(name = "SPR_APENOM", nullable = true, length = 250)
    public String getApellidoNombre() {
        return apellidoNombre;
    }

    public void setApellidoNombre(String apellidoNombre) {
        this.apellidoNombre = apellidoNombre;
    }

    @Basic
    @Column(name = "SPR_DESC_OBLIG", nullable = true, length = 100)
    public String getDescripcionObligacion() {
        return descripcionObligacion;
    }

    public void setDescripcionObligacion(String descripcionObligacion) {
        this.descripcionObligacion = descripcionObligacion;
    }

    @Basic
    @Column(name = "SPR_COD_BARRA", nullable = true, length = 84)
    public String getCodBarra() {
        return codBarra;
    }

    public void setCodBarra(String codBarra) {
        this.codBarra = codBarra;
    }

    @Basic
    @Column(name = "SPR_ID_TIPO_OBLIG", nullable = true, length = 8)
    public String getIdTipoObligacion() {
        return idTipoObligacion;
    }

    public void setIdTipoObligacion(String idTipoObligacion) {
        this.idTipoObligacion = idTipoObligacion;
    }

    @Basic
    @Column(name = "SPR_DESC_TIPO_OBLIG", nullable = true, length = 100)
    public String getDescripcionTipoObligacion() {
        return descripcionTipoObligacion;
    }

    public void setDescripcionTipoObligacion(String descripcionTipoObligacion) {
        this.descripcionTipoObligacion = descripcionTipoObligacion;
    }

    @Basic
    @Column(name = "SPR_FECHA_VENC_OBLIG", nullable = true)
    public LocalDate getFechaVencimientoObligacion() {
        return fechaVencimientoObligacion;
    }

    public void setFechaVencimientoObligacion(LocalDate fechaVencimientoObligacion) {
        this.fechaVencimientoObligacion = fechaVencimientoObligacion;
    }

    @Basic
    @Column(name = "SPR_FECHA_INICIO_OBLIG", nullable = true)
    public LocalDate getFechaInicioObligacion() {
        return fechaInicioObligacion;
    }

    public void setFechaInicioObligacion(LocalDate fechaInicioObligacion) {
        this.fechaInicioObligacion = fechaInicioObligacion;
    }

    @Basic
    @Column(name = "SPR_FECHA_FIN_OBLIG", nullable = true)
    public LocalDate getFechaFinObligacion() {
        return fechaFinObligacion;
    }

    public void setFechaFinObligacion(LocalDate fechaFinObligacion) {
        this.fechaFinObligacion = fechaFinObligacion;
    }

    @Basic
    @Column(name = "SPR_FECHA_PAGO", nullable = false)
    public LocalDate getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(LocalDate fechaPago) {
        this.fechaPago = fechaPago;
    }

    @Basic
    @Column(name = "SPR_ID_EXTERNO", nullable = true, length = 13)
    public String getIdExterno() {
        return idExterno;
    }

    public void setIdExterno(String idExterno) {
        this.idExterno = idExterno;
    }

    @Basic
    @Column(name = "SPR_MONTO_ORIGINAL", nullable = false, precision = 2)
    public BigDecimal getMontoOriginal() {
        return montoOriginal;
    }

    public void setMontoOriginal(BigDecimal montoOriginal) {
        this.montoOriginal = montoOriginal;
    }

    @Basic
    @Column(name = "SPR_MONTO_ACTUALIZADO", nullable = false, precision = 2)
    public BigDecimal getMontoActualizado() {
        return montoActualizado;
    }

    public void setMontoActualizado(BigDecimal montoActualizado) {
        this.montoActualizado = montoActualizado;
    }

    @Basic
    @Column(name = "SPR_MONTO_INTERESES", nullable = false, precision = 2)
    public BigDecimal getMontoIntereses() {
        return montoIntereses;
    }

    public void setMontoIntereses(BigDecimal montoIntereses) {
        this.montoIntereses = montoIntereses;
    }

    @Basic
    @Column(name = "SPR_MONTO_CAPITAL", nullable = false, precision = 2)
    public BigDecimal getMontoCapital() {
        return montoCapital;
    }

    public void setMontoCapital(BigDecimal montoCapital) {
        this.montoCapital = montoCapital;
    }

    @Basic
    @Column(name = "SPR_MONTO_PAGADO", nullable = false, precision = 2)
    public BigDecimal getMontoPagado() {
        return montoPagado;
    }

    public void setMontoPagado(BigDecimal montoPagado) {
        this.montoPagado = montoPagado;
    }

    @Basic
    @Column(name = "SPR_MONEDA", nullable = true, length = 10)
    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    @Basic
    @Column(name = "SPR_REGLA_IMPUTA", nullable = true, length = 100)
    public String getReglaImputa() {
        return reglaImputa;
    }

    public void setReglaImputa(String reglaImputa) {
        this.reglaImputa = reglaImputa;
    }

    @Basic
    @Column(name = "SPR_TIPO_PAGO", nullable = true, length = 100)
    public String getTipoPago() {
        return tipoPago;
    }

    public void setTipoPago(String tipoPago) {
        this.tipoPago = tipoPago;
    }

    @Basic
    @Column(name = "PRE_MEDIO_PAGO", nullable = true, length = 100)
    public String getMedioPago() {
        return medioPago;
    }

    public void setMedioPago(String medioPago) {
        this.medioPago = medioPago;
    }

    @Basic
    @Column(name = "SPR_TIPO_BENEF", nullable = true, length = 100)
    public String getTipoBenef() {
        return tipoBenef;
    }

    public void setTipoBenef(String tipoBenef) {
        this.tipoBenef = tipoBenef;
    }

    @Basic
    @Column(name = "SPR_DESC_BENEF", nullable = true, length = 100)
    public String getDescripcionBeneficio() {
        return descripcionBeneficio;
    }

    public void setDescripcionBeneficio(String descripcionBeneficio) {
        this.descripcionBeneficio = descripcionBeneficio;
    }

    @Basic
    @Column(name = "SPR_MONTO_BENEF", nullable = true, precision = 2)
    public Double getMontoBeneficio() {
        return montoBeneficio;
    }

    public void setMontoBeneficio(Double montoBeneficio) {
        this.montoBeneficio = montoBeneficio;
    }

    @Basic
    @Column(name = "SPR_ESTADO_OBLIG", nullable = false, length = 100)
    public String getEstadoObligacion() {
        return estadoObligacion;
    }

    public void setEstadoObligacion(String estadoObligacion) {
        this.estadoObligacion = estadoObligacion;
    }

    @Basic
    @Column(name = "SPR_ESTADO_GES", nullable = true, length = 100)
    public String getEstadoGestion() {
        return estadoGestion;
    }

    public void setEstadoGestion(String estadoGestion) {
        this.estadoGestion = estadoGestion;
    }

    @Basic
    @Column(name = "SPR_ESTADO", nullable = false, length = 1)
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Basic
    @Column(name = "PRE_OBS", nullable = true, length = 250)
    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    @Basic
    @Column(name = "SPR_USU_ALTA", nullable = false, length = 50)
    public String getUsuarioAlta() {
        return usuarioAlta;
    }

    public void setUsuarioAlta(String usuarioAlta) {
        this.usuarioAlta = usuarioAlta;
    }

    @Basic
    @Column(name = "SPR_FECHA_ALTA", nullable = false)
    public Date getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(Date fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    @Basic
    @Column(name = "SPR_USU_MODIF", nullable = true, length = 50)
    public String getUsuarioModificacion() {
        return usuarioModificacion;
    }

    public void setUsuarioModificacion(String usuarioModificacion) {
        this.usuarioModificacion = usuarioModificacion;
    }

    @Basic
    @Column(name = "SPR_FECHA_MODIF", nullable = true)
    public Date getFechaModifacion() {
        return fechaModifacion;
    }

    public void setFechaModifacion(Date fechaModifacion) {
        this.fechaModifacion = fechaModifacion;
    }

    @Basic
    @Column(name = "SPR_FECHA_BAJA", nullable = true)
    public Date getFechaBaja() {
        return fechaBaja;
    }

    public void setFechaBaja(Date fechaBaja) {
        this.fechaBaja = fechaBaja;
    }

    @Basic
    @Column(name = "SPR_USU_BAJA", nullable = true, length = 50)
    public String getUsuarioBaja() {
        return usuarioBaja;
    }

    public void setUsuarioBaja(String usuarioBaja) {
        this.usuarioBaja = usuarioBaja;
    }

    @Basic
    @Column(name = "SPR_NRO_LIQUIDACION_JUDICIAL", nullable = false, length = 50)
    public String getNroLiquidacion() {
        return nroLiquidacion;
    }

    public void setNroLiquidacion(String nroLiquidacion) {
        this.nroLiquidacion = nroLiquidacion;
    }

    @Basic
    @Column(name = "SPR_INSTANCIA_GESTION", nullable = false, length = 50)
    public String getInstanciaGestion() {
        return instanciaGestion;
    }

    public void setInstanciaGestion(String instanciaGestion) {
        this.instanciaGestion = instanciaGestion;
    }
}
