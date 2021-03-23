package com.kolektor.dc.wsrestdcintegracion.model.psrm;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import java.math.BigDecimal;

public class StageDetallePagoPSRMDTO {
    private Long idTransaccion;
    @NotEmpty(message = "{tipomovimiento.notempty}")
    private String tipoMovimiento;
    @Positive(message = "{montopagado.positive}")
    @NotNull(message = "{montopagado.notnull}")
    private BigDecimal montoPagado;

    public Long getIdTransaccion() {
        return idTransaccion;
    }

    public void setIdTransaccion(Long idTransaccion) {
        this.idTransaccion = idTransaccion;
    }

    public String getTipoMovimiento() {
        return tipoMovimiento;
    }

    public void setTipoMovimiento(String tipoMovimiento) {
        this.tipoMovimiento = tipoMovimiento;
    }



    public BigDecimal getMontoPagado() {
        return montoPagado;
    }

    public void setMontoPagado(BigDecimal montoPagado) {
        this.montoPagado = montoPagado;
    }


    @Override
    public String toString() {
        return "StageDetallePagoPSRMDTO{" +
                "idTransaccion=" + idTransaccion +
                ", tipoMovimiento='" + tipoMovimiento + '\'' +
                ", montoPagado=" + montoPagado +
                '}';
    }
}
