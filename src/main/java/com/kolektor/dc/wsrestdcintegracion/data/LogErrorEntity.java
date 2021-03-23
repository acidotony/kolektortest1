package com.kolektor.dc.wsrestdcintegracion.data;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

@Entity
//@NamedStoredProcedureQuery(name = "logProceso.insert", procedureName = "PCK_LOG_PROCESOS.PR_INS_PROCESOS", parameters = {
//        @StoredProcedureParameter( name = "P_LOP_PAQUETE", mode = ParameterMode.IN, type = String.class),
//        @StoredProcedureParameter( name = "P_LOP_PROCED_FUNCION", mode = ParameterMode.IN, type = String.class),
//        @StoredProcedureParameter( name = "P_LOP_STATUS_CODE", mode = ParameterMode.IN, type = String.class),
//        @StoredProcedureParameter( name = "P_LOP_STATUS_MESSAGE", mode = ParameterMode.IN, type = String.class),
//        @StoredProcedureParameter( name = "P_ID_PROCESO", mode = ParameterMode.OUT,type = Long.class) })
//@NamedStoredProcedureQuery(name = "logError.insert", procedureName = "PCK_LOG_PROCESOS.PR_INS_ERRORES", parameters = {
//        @StoredProcedureParameter( name = "P_ID_LOG_PROCESOS", mode = ParameterMode.IN, type = Long.class),
//        @StoredProcedureParameter( name = "P_PAQUETE", mode = ParameterMode.IN, type = String.class),
//        @StoredProcedureParameter( name = "P_PROCED_FUNCION", mode = ParameterMode.IN, type = String.class),
//        @StoredProcedureParameter( name = "P_ERROR_CODE", mode = ParameterMode.IN, type = String.class),
//        @StoredProcedureParameter( name = "P_ERROR_MESSAGE", mode = ParameterMode.IN, type = String.class),
//        @StoredProcedureParameter( name = "P_TIPO_OBJETO", mode = ParameterMode.IN, type = String.class),
//        @StoredProcedureParameter( name = "P_ID_OBJETO", mode = ParameterMode.IN, type = Long.class) })
@Table(name = "LOG_ERRORES", schema = "DC_NEW", catalog = "")
public class LogErrorEntity {
    private Long idLogError;
    private Long lopId;
    private Date fechaHora;
    private String paquete;
    private String procedFuncion;
    private String errorCode;
    private String errorMessage;
    private String usuario;
    private String tpoObjeto;
    private Long idObjeto;
    private String usuarioAlta;
    private Date fechaAlta;
    private String usuarioModificacion;
    private Date fechaModificacion;
    private Date fechaBaja;
    private String usuarioBaja;
    private Date fechaFin;

    @Id
    @Column(name = "LOE_ID", nullable = false, precision = 0)
    public Long getIdLogError() {
        return idLogError;
    }

    public void setIdLogError(Long idLogError) {
        this.idLogError = idLogError;
    }

    @Basic
    @Column(name = "LOE_LOP_ID", nullable = false, precision = 0)
    public Long getLopId() {
        return lopId;
    }

    public void setLopId(Long lopId) {
        this.lopId = lopId;
    }

    @Basic
    @Column(name = "LOE_FECHA_HORA", nullable = false)
    public Date getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(Date fechaHora) {
        this.fechaHora = fechaHora;
    }

    @Basic
    @Column(name = "LOE_PAQUETE", nullable = true, length = 100)
    public String getPaquete() {
        return paquete;
    }

    public void setPaquete(String paquete) {
        this.paquete = paquete;
    }

    @Basic
    @Column(name = "LOE_PROCED_FUNCION", nullable = true, length = 100)
    public String getProcedFuncion() {
        return procedFuncion;
    }

    public void setProcedFuncion(String procedFuncion) {
        this.procedFuncion = procedFuncion;
    }

    @Basic
    @Column(name = "LOE_ERROR_CODE", nullable = true, length = 50)
    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    @Basic
    @Column(name = "LOE_ERROR_MESSAGE", nullable = true, length = 4000)
    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    @Basic
    @Column(name = "LOE_USUARIO", nullable = true, length = 50)
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    @Basic
    @Column(name = "LOE_TIPO_OBJETO", nullable = true, length = 50)
    public String getTpoObjeto() {
        return tpoObjeto;
    }

    public void setTpoObjeto(String tpoObjeto) {
        this.tpoObjeto = tpoObjeto;
    }

    @Basic
    @Column(name = "LOE_ID_OBJETO", nullable = true, precision = 0)
    public Long getIdObjeto() {
        return idObjeto;
    }

    public void setIdObjeto(Long idObjeto) {
        this.idObjeto = idObjeto;
    }

    @Basic
    @Column(name = "LOE_USU_ALTA", nullable = false, length = 50)
    public String getUsuarioAlta() {
        return usuarioAlta;
    }

    public void setUsuarioAlta(String usuarioAlta) {
        this.usuarioAlta = usuarioAlta;
    }

    @Basic
    @Column(name = "LOE_FECHA_ALTA", nullable = false)
    public Date getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(Date fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    @Basic
    @Column(name = "LOE_USU_MODIF", nullable = false, length = 50)
    public String getUsuarioModificacion() {
        return usuarioModificacion;
    }

    public void setUsuarioModificacion(String usuarioModificacion) {
        this.usuarioModificacion = usuarioModificacion;
    }

    @Basic
    @Column(name = "LOE_FECHA_MODIF", nullable = false)
    public Date getFechaModificacion() {
        return fechaModificacion;
    }

    public void setFechaModificacion(Date fechaModificacion) {
        this.fechaModificacion = fechaModificacion;
    }

    @Basic
    @Column(name = "LOE_FECHA_BAJA", nullable = true)
    public Date getFechaBaja() {
        return fechaBaja;
    }

    public void setFechaBaja(Date fechaBaja) {
        this.fechaBaja = fechaBaja;
    }

    @Basic
    @Column(name = "LOE_USU_BAJA", nullable = true, length = 50)
    public String getUsuarioBaja() {
        return usuarioBaja;
    }

    public void setUsuarioBaja(String usuarioBaja) {
        this.usuarioBaja = usuarioBaja;
    }

    @Basic
    @Column(name = "LOE_FECHA_FIN", nullable = true)
    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LogErrorEntity that = (LogErrorEntity) o;
        return Objects.equals(idLogError, that.idLogError) && Objects.equals(lopId, that.lopId) && Objects.equals(fechaHora, that.fechaHora) && Objects.equals(paquete, that.paquete) && Objects.equals(procedFuncion, that.procedFuncion) && Objects.equals(errorCode, that.errorCode) && Objects.equals(errorMessage, that.errorMessage) && Objects.equals(usuario, that.usuario) && Objects.equals(tpoObjeto, that.tpoObjeto) && Objects.equals(idObjeto, that.idObjeto) && Objects.equals(usuarioAlta, that.usuarioAlta) && Objects.equals(fechaAlta, that.fechaAlta) && Objects.equals(usuarioModificacion, that.usuarioModificacion) && Objects.equals(fechaModificacion, that.fechaModificacion) && Objects.equals(fechaBaja, that.fechaBaja) && Objects.equals(usuarioBaja, that.usuarioBaja) && Objects.equals(fechaFin, that.fechaFin);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idLogError, lopId, fechaHora, paquete, procedFuncion, errorCode, errorMessage, usuario, tpoObjeto, idObjeto, usuarioAlta, fechaAlta, usuarioModificacion, fechaModificacion, fechaBaja, usuarioBaja, fechaFin);
    }
}
