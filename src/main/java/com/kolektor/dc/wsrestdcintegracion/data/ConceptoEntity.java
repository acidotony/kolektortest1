package com.kolektor.dc.wsrestdcintegracion.data;

import javax.persistence.*;
import java.sql.Time;
import java.util.Objects;

@Entity
@Table(name = "CONCEPTOS", schema = "DC_NEW", catalog = "")
public class ConceptoEntity {
    private String id;
    private String codigo;
    private String deno;
    private String tipo;
    private String grupo;
    private String Obs;
    private String estado;
    private String aplDist;
    private Short version;
    private String usuAlta;
    private Time fechaAlta;
    private String usuModif;
    private Time fechaModif;
    private String usuBaja;
    private Time fechaBaja;
    private String sistemaOrigen;
    private Integer prioridadDistribucion;

    @Id
    @Column(name = "CON_ID", nullable = false, length = 100)
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "CON_CODIGO", nullable = false, length = 100)
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Basic
    @Column(name = "CON_DENO", nullable = false, length = 100)
    public String getDeno() {
        return deno;
    }

    public void setDeno(String deno) {
        this.deno = deno;
    }

    @Basic
    @Column(name = "CON_TIPO", nullable = false, length = 100)
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Basic
    @Column(name = "CON_GRUPO", nullable = false, length = 100)
    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    @Basic
    @Column(name = "CON_OBS", nullable = true, length = 250)
    public String getObs() {
        return Obs;
    }

    public void setObs(String obs) {
        Obs = obs;
    }

    @Basic
    @Column(name = "CON_ESTADO", nullable = false, length = 100)
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Basic
    @Column(name = "CON_APL_DIST", nullable = true, length = 20)
    public String getAplDist() {
        return aplDist;
    }

    public void setAplDist(String aplDist) {
        this.aplDist = aplDist;
    }

    @Basic
    @Column(name = "CON_VERSION", nullable = true, precision = 0)
    public Short getVersion() {
        return version;
    }

    public void setVersion(Short version) {
        this.version = version;
    }

    @Basic
    @Column(name = "CON_USU_ALTA", nullable = false, length = 50)
    public String getUsuAlta() {
        return usuAlta;
    }

    public void setUsuAlta(String usuAlta) {
        this.usuAlta = usuAlta;
    }

    @Basic
    @Column(name = "CON_FECHA_ALTA", nullable = false)
    public Time getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(Time fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    @Basic
    @Column(name = "CON_USU_MODIF", nullable = false, length = 50)
    public String getUsuModif() {
        return usuModif;
    }

    public void setUsuModif(String usuModif) {
        this.usuModif = usuModif;
    }

    @Basic
    @Column(name = "CON_FECHA_MODIF", nullable = false)
    public Time getFechaModif() {
        return fechaModif;
    }

    public void setFechaModif(Time fechaModif) {
        this.fechaModif = fechaModif;
    }

    @Basic
    @Column(name = "CON_USU_BAJA", nullable = true, length = 50)
    public String getUsuBaja() {
        return usuBaja;
    }

    public void setUsuBaja(String usuBaja) {
        this.usuBaja = usuBaja;
    }

    @Basic
    @Column(name = "CON_FECHA_BAJA", nullable = true)
    public Time getFechaBaja() {
        return fechaBaja;
    }

    public void setFechaBaja(Time fechaBaja) {
        this.fechaBaja = fechaBaja;
    }

    @Basic
    @Column(name = "CON_SISTEMA_ORIGEN", nullable = true, length = 60)
    public String getSistemaOrigen() {
        return sistemaOrigen;
    }

    public void setSistemaOrigen(String sistemaOrigen) {
        this.sistemaOrigen = sistemaOrigen;
    }

    @Basic
    @Column(name = "CON_PRIORIDAD_DISTRIBUCION", nullable = true, precision = 0)
    public Integer getPrioridadDistribucion() {
        return prioridadDistribucion;
    }

    public void setPrioridadDistribucion(Integer prioridadDistribucion) {
        this.prioridadDistribucion = prioridadDistribucion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ConceptoEntity that = (ConceptoEntity) o;
        return Objects.equals(id, that.id) && Objects.equals(codigo, that.codigo) && Objects.equals(deno, that.deno) && Objects.equals(tipo, that.tipo) && Objects.equals(grupo, that.grupo) && Objects.equals(Obs, that.Obs) && Objects.equals(estado, that.estado) && Objects.equals(aplDist, that.aplDist) && Objects.equals(version, that.version) && Objects.equals(usuAlta, that.usuAlta) && Objects.equals(fechaAlta, that.fechaAlta) && Objects.equals(usuModif, that.usuModif) && Objects.equals(fechaModif, that.fechaModif) && Objects.equals(usuBaja, that.usuBaja) && Objects.equals(fechaBaja, that.fechaBaja) && Objects.equals(sistemaOrigen, that.sistemaOrigen) && Objects.equals(prioridadDistribucion, that.prioridadDistribucion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, codigo, deno, tipo, grupo, Obs, estado, aplDist, version, usuAlta, fechaAlta, usuModif, fechaModif, usuBaja, fechaBaja, sistemaOrigen, prioridadDistribucion);
    }
}
