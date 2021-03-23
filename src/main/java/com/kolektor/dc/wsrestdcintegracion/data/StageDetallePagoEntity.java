package com.kolektor.dc.wsrestdcintegracion.data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "STAGE_DETALLE_PAGOS_RECIBIDOS")
public class StageDetallePagoEntity {

    private Long idStagePagoRecibido;
    private String idEventoPago;
    private String idObligacion;
    private String idPago;
    private Long idMovimiento;
    private Long idCredito;
    private String tipoMovimiento;
    private String descripcionMovimiento;
    private String idConcepto;
    private Long idTransaccion;
    private String tipoTransaccion;
    private String codigoDistribucion;
    private String tipoCaja;
    private String transaccionVirtual;
    private BigDecimal montoPagado;
    private BigDecimal montoComision;
    private BigDecimal montoIva;
    private BigDecimal montoOriginal;
    private BigDecimal montoBalance;
    private BigDecimal montoRedondeo;
    private LocalDate fechaEfectiva;
    private LocalDate fechaCongela;
    private LocalDate fechaVencimientoPago;
    private LocalDate fechaAjusteDesde;
    private LocalDate fechaAjusteHasta;
    private LocalDate fechaVencimientoDeclaracionJurada;
    private String categoriaDeuda;
    private String estado;
    private String observaciones;
    private String usuarioAlta;
    private Date fechaAlta;
    private String usuarioModificacion;
    private Date fechaModificacion;
    private String moneda;
    private String usuarioBaja;
    private Date fechaBaja;
    private BigDecimal montoAcumuladoDescuento;
    private Long idStageDetallePagoRecibido;

    @Id
    @Column(name = "SPD_ID", nullable = false, precision = 0)
    @GeneratedValue(generator = "SEQ_STAGE_DETALLE_PAGOS_REC")
    @SequenceGenerator(name = "SEQ_STAGE_DETALLE_PAGOS_REC", sequenceName = "SEQ_STAGE_DETALLE_PAGOS_REC_ID", allocationSize = 1)
    public Long getIdStageDetallePagoRecibido() {
        return idStageDetallePagoRecibido;
    }

    public void setIdStageDetallePagoRecibido(Long idStageDetallePagoRecibido) {
        this.idStageDetallePagoRecibido = idStageDetallePagoRecibido;
    }

    @Basic
    @Column(name = "SPD_SPR_ID", nullable = false, precision = 0)
    public Long getIdStagePagoRecibido() {
        return idStagePagoRecibido;
    }

    public void setIdStagePagoRecibido(Long idStagePagoRecibido) {
        this.idStagePagoRecibido = idStagePagoRecibido;
    }

    @Basic
    @Column(name = "SPD_PAY_EVENT_ID", nullable = true, length = 12)
    public String getIdEventoPago() {
        return idEventoPago;
    }

    public void setIdEventoPago(String idEventoPago) {
        this.idEventoPago = idEventoPago;
    }

    @Basic
    @Column(name = "SPD_ID_OBLIG", nullable = false, length = 10)
    public String getIdObligacion() {
        return idObligacion;
    }

    public void setIdObligacion(String idObligacion) {
        this.idObligacion = idObligacion;
    }

    @Basic
    @Column(name = "SPD_PAY_ID", nullable = true, length = 12)
    public String getIdPago() {
        return idPago;
    }

    public void setIdPago(String idPago) {
        this.idPago = idPago;
    }

    @Basic
    @Column(name = "SPD_ID_MOV", nullable = true, precision = 0)
    public Long getIdMovimiento() {
        return idMovimiento;
    }

    public void setIdMovimiento(Long idMovimiento) {
        this.idMovimiento = idMovimiento;
    }

    @Basic
    @Column(name = "SPD_ID_CREDITO", nullable = true, precision = 0)
    public Long getIdCredito() {
        return idCredito;
    }

    public void setIdCredito(Long idCredito) {
        this.idCredito = idCredito;
    }

    @Basic
    @Column(name = "SPD_TIPO_MOV", nullable = false, length = 100)
    public String getTipoMovimiento() {
        return tipoMovimiento;
    }

    public void setTipoMovimiento(String tipoMovimiento) {
        this.tipoMovimiento = tipoMovimiento;
    }

    @Basic
    @Column(name = "SPD_DESC_MOV", nullable = false, length = 100)
    public String getDescripcionMovimiento() {
        return descripcionMovimiento;
    }

    public void setDescripcionMovimiento(String descripcionMovimiento) {
        this.descripcionMovimiento = descripcionMovimiento;
    }

    @Basic
    @Column(name = "SPD_ID_CONCEPTO", nullable = true, length = 100)
    public String getIdConcepto() {
        return idConcepto;
    }

    public void setIdConcepto(String idConcepto) {
        this.idConcepto = idConcepto;
    }

    @Basic
    @Column(name = "SPD_ID_TRAN", nullable = true, precision = 0)
    public Long getIdTransaccion() {
        return idTransaccion;
    }

    public void setIdTransaccion(Long idTransaccion) {
        this.idTransaccion = idTransaccion;
    }

    @Basic
    @Column(name = "SPD_TIPO_TRAN", nullable = true, length = 100)
    public String getTipoTransaccion() {
        return tipoTransaccion;
    }

    public void setTipoTransaccion(String tipoTransaccion) {
        this.tipoTransaccion = tipoTransaccion;
    }

    @Basic
    @Column(name = "SPD_DIST_CODE", nullable = true, length = 100)
    public String getCodigoDistribucion() {
        return codigoDistribucion;
    }

    public void setCodigoDistribucion(String codigoDistribucion) {
        this.codigoDistribucion = codigoDistribucion;
    }

    @Basic
    @Column(name = "SPD_TIPO_CAAJ", nullable = true, length = 100)
    public String getTipoCaja() {
        return tipoCaja;
    }

    public void setTipoCaja(String tipoCaja) {
        this.tipoCaja = tipoCaja;
    }

    @Basic
    @Column(name = "SPD_TRANS_VIRTUAL", nullable = false, length = 100)
    public String getTransaccionVirtual() {
        return transaccionVirtual;
    }

    public void setTransaccionVirtual(String transaccionVirtual) {
        this.transaccionVirtual = transaccionVirtual;
    }

    @Basic
    @Column(name = "SPD_MONTO_PAGADO", nullable = false, precision = 2)
    public BigDecimal getMontoPagado() {
        return montoPagado;
    }

    public void setMontoPagado(BigDecimal montoPagado) {
        this.montoPagado = montoPagado;
    }

    @Basic
    @Column(name = "SPD_MONTO_COMISION", nullable = false, precision = 2)
    public BigDecimal getMontoComision() {
        return montoComision;
    }

    public void setMontoComision(BigDecimal montoComision) {
        this.montoComision = montoComision;
    }

    @Basic
    @Column(name = "SPD_MONTO_IVA", nullable = false, precision = 2)
    public BigDecimal getMontoIva() {
        return montoIva;
    }

    public void setMontoIva(BigDecimal montoIva) {
        this.montoIva = montoIva;
    }

    @Basic
    @Column(name = "SPD_MONTO_ORIGINAL", nullable = false, precision = 2)
    public BigDecimal getMontoOriginal() {
        return montoOriginal;
    }

    public void setMontoOriginal(BigDecimal montoOriginal) {
        this.montoOriginal = montoOriginal;
    }

    @Basic
    @Column(name = "SPD_MONTO_BALANCE", nullable = false, precision = 2)
    public BigDecimal getMontoBalance() {
        return montoBalance;
    }

    public void setMontoBalance(BigDecimal montoBalance) {
        this.montoBalance = montoBalance;
    }

    @Basic
    @Column(name = "SPD_MONTO_REDONDEO", nullable = false, precision = 2)
    public BigDecimal getMontoRedondeo() {
        return montoRedondeo;
    }

    public void setMontoRedondeo(BigDecimal montoRedondeo) {
        this.montoRedondeo = montoRedondeo;
    }

    @Basic
    @Column(name = "SPD_FECHA_EFECTIVA", nullable = true)
    public LocalDate getFechaEfectiva() {
        return fechaEfectiva;
    }

    public void setFechaEfectiva(LocalDate fechaEfectiva) {
        this.fechaEfectiva = fechaEfectiva;
    }

    @Basic
    @Column(name = "SPD_FECHA_CONGELA", nullable = true)
    public LocalDate getFechaCongela() {
        return fechaCongela;
    }

    public void setFechaCongela(LocalDate fechaCongela) {
        this.fechaCongela = fechaCongela;
    }

    @Basic
    @Column(name = "SPD_FECHA_VENC_PAGO", nullable = true)
    public LocalDate getFechaVencimientoPago() {
        return fechaVencimientoPago;
    }

    public void setFechaVencimientoPago(LocalDate fechaVencimientoPago) {
        this.fechaVencimientoPago = fechaVencimientoPago;
    }

    @Basic
    @Column(name = "SPD_FECHA_AJUSTE_DESDE", nullable = true)
    public LocalDate getFechaAjusteDesde() {
        return fechaAjusteDesde;
    }

    public void setFechaAjusteDesde(LocalDate fechaAjusteDesde) {
        this.fechaAjusteDesde = fechaAjusteDesde;
    }

    @Basic
    @Column(name = "SPD_FECHA_AJUSTE_HASTA", nullable = true)
    public LocalDate getFechaAjusteHasta() {
        return fechaAjusteHasta;
    }

    public void setFechaAjusteHasta(LocalDate fechaAjusteHasta) {
        this.fechaAjusteHasta = fechaAjusteHasta;
    }

    @Basic
    @Column(name = "SPD_FEC_VTO_DEC_JUR", nullable = true)
    public LocalDate getFechaVencimientoDeclaracionJurada() {
        return fechaVencimientoDeclaracionJurada;
    }

    public void setFechaVencimientoDeclaracionJurada(LocalDate fechaVencimientoDeclaracionJurada) {
        this.fechaVencimientoDeclaracionJurada = fechaVencimientoDeclaracionJurada;
    }

    @Basic
    @Column(name = "SPD_CAT_DEUDA", nullable = false, length = 100)
    public String getCategoriaDeuda() {
        return categoriaDeuda;
    }

    public void setCategoriaDeuda(String categoriaDeuda) {
        this.categoriaDeuda = categoriaDeuda;
    }

    @Basic
    @Column(name = "SPD_ESTADO", nullable = false, length = 1)
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Basic
    @Column(name = "SPD_OBS", nullable = true, length = 250)
    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    @Basic
    @Column(name = "SPD_USU_ALTA", nullable = false, length = 50)
    public String getUsuarioAlta() {
        return usuarioAlta;
    }

    public void setUsuarioAlta(String usuarioAlta) {
        this.usuarioAlta = usuarioAlta;
    }

    @Basic
    @Column(name = "SPD_FECHA_ALTA", nullable = false)
    public Date getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(Date fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    @Basic
    @Column(name = "SPD_USU_MODIF", nullable = true, length = 50)
    public String getUsuarioModificacion() {
        return usuarioModificacion;
    }

    public void setUsuarioModificacion(String usuarioModificacion) {
        this.usuarioModificacion = usuarioModificacion;
    }

    @Basic
    @Column(name = "SPD_FECHA_MODIF", nullable = true)
    public Date getFechaModificacion() {
        return fechaModificacion;
    }

    public void setFechaModificacion(Date fechaModificacion) {
        this.fechaModificacion = fechaModificacion;
    }

    @Basic
    @Column(name = "SPD_MONEDA", nullable = true, length = 10)
    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    @Basic
    @Column(name = "SPD_USU_BAJA", nullable = true, length = 50)
    public String getUsuarioBaja() {
        return usuarioBaja;
    }

    public void setUsuarioBaja(String usuarioBaja) {
        this.usuarioBaja = usuarioBaja;
    }

    @Basic
    @Column(name = "SPD_FECHA_BAJA", nullable = true)
    public Date getFechaBaja() {
        return fechaBaja;
    }

    public void setFechaBaja(Date fechaBaja) {
        this.fechaBaja = fechaBaja;
    }

    @Basic
    @Column(name = "SPD_ACUMULADO_DESCUENTO", nullable = true, precision = 3)
    public BigDecimal getMontoAcumuladoDescuento() {
        return montoAcumuladoDescuento;
    }

    public void setMontoAcumuladoDescuento(BigDecimal montoAcumuladoDescuento) {
        this.montoAcumuladoDescuento = montoAcumuladoDescuento;
    }

}
