package com.kolektor.dc.wsrestdcintegracion.model.gant;

import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class StageBoletaGantDTO {
    private String idEventoPago;
    @NotEmpty(message = "{idboleta.notempty}")
    private String idBoleta;
    @NotEmpty(message = "{idpersona.notempty}")
    private String idPersona;
    @NotEmpty(message = "{tipodocumento.notempty}")
    private String tipoDocumento;
    @NotEmpty(message = "{nrodoc.notempty}")
    private String nroDocumento;
    @NotEmpty(message = "{apenom.notempty}")
    private String apellidoNombre;
    private String codBarra;
    @Positive(message = "{montopagado.positive}")
    @NotNull(message = "{montopagado.notnull}")
    private BigDecimal montoPagado;
    @NotEmpty(message = "{idRecaudador.notempty}")
    private String idRecaudador;
    @Pattern(message = "{tipopago.notvalid}", regexp = "CONTADO|CUOTA")
    @NotNull(message = "{tipopago.notnull}")
    private String tipoPago;
    private String medioPago;
    @NotNull(message = "{cantcuotas.notnull}")
    @Min(value = 0, message = "{cantcuotas.min}")
    @Max(value = 150, message = "{cantcuotas.max}")
    private Long cantCuotas;
    @NotNull(message = "{fechavencimiento.notnull}")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate fechaVencimiento;
    @NotEmpty(message = "{moneda.notempty}")
    @Pattern(message = "{moneda.notvalid}", regexp = "ARS")
    private String moneda;
    @NotNull(message = "{fechapago.notnull}")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate fechaPago;
    private String idCuentaContribuyente;
    @Size(max = 13, message = "{idreferencia.maxlength}")
    private String idReferencia;
    @Valid
    @NotEmpty(message = "{pagos.required}")
    private List<StagePagoGantDTO> listPagos;

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

    public BigDecimal getMontoPagado() {
        return montoPagado;
    }

    public void setMontoPagado(BigDecimal montoPagado) {
        this.montoPagado = montoPagado;
    }

    public String getIdRecaudador() {
        return idRecaudador;
    }

    public void setIdRecaudador(String idRecaudador) {
        this.idRecaudador = idRecaudador;
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

    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(LocalDate fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
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

    public List<StagePagoGantDTO> getListPagos() {
        return listPagos;
    }

    public void setListPagos(List<StagePagoGantDTO> listPagos) {
        this.listPagos = listPagos;
    }
}
