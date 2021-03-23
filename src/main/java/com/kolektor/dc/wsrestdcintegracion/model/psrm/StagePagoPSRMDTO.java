package com.kolektor.dc.wsrestdcintegracion.model.psrm;

import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class StagePagoPSRMDTO {
    @NotEmpty(message = "{idobligacion.notempty}")
    private String idObligacion;
    @NotNull(message = "{identeencomendante.notnull}")
    private String idEncomendante;
    private String idPago;
    private String codBarra;
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
    @NotEmpty(message = "{idpersona.notempty}")
    private String idPersona;
    @NotEmpty(message = "{tipodocumento.notempty}")
    private String tipoDocumento;
    @NotEmpty(message = "{nrodoc.notempty}")
    private String nroDocumento;
    @NotEmpty(message = "{apenom.notempty}")
    private String apellidoNombre;
    @Valid
    @NotEmpty(message = "{detallespago.required}")
    private List<StageDetallePagoPSRMDTO> listDetallesPago;

    public StagePagoPSRMDTO() {
        listDetallesPago = new ArrayList<StageDetallePagoPSRMDTO>();
    }

    public List<StageDetallePagoPSRMDTO> getListDetallesPago() {
        return listDetallesPago;
    }

    public void setListDetallesPago(List<StageDetallePagoPSRMDTO> listDetallesPago) {
        this.listDetallesPago = listDetallesPago;
    }

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

    public String getIdPersona() {
        return idPersona;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public String getNroDocumento() {
        return nroDocumento;
    }

    public String getApellidoNombre() {
        return apellidoNombre;
    }

    @Override
    public String toString() {
        return "StagePagoPSRMDTO{" +
                "idObligacion='" + idObligacion + '\'' +
                ", idEncomendante=" + idEncomendante +
                ", idPago='" + idPago + '\'' +
                ", codBarra='" + codBarra + '\'' +
                ", idTipoObligacion='" + idTipoObligacion + '\'' +
                ", descripcionTipoObligacion='" + descripcionTipoObligacion + '\'' +
                ", fechaVencimientoObligacion=" + fechaVencimientoObligacion +
                ", fechaInicioObligacion=" + fechaInicioObligacion +
                ", idExterno='" + idExterno + '\'' +
                ", montoPagado=" + montoPagado +
                ", listDetallesPago=" + listDetallesPago +
                '}';
    }
}
