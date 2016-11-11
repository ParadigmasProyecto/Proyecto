/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.una.entidad;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author María Laura
 */
@Entity
@Table(name = "tab_mocion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TabMocion.findAll", query = "SELECT t FROM TabMocion t"),
    @NamedQuery(name = "TabMocion.findByIdMoc", query = "SELECT t FROM TabMocion t WHERE t.idMoc = :idMoc"),
    @NamedQuery(name = "TabMocion.findByFechaMoc", query = "SELECT t FROM TabMocion t WHERE t.fechaMoc = :fechaMoc")})
public class TabMocion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id_Moc")
    private Integer idMoc;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Fecha_Moc")
    @Temporal(TemporalType.DATE)
    private Date fechaMoc;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Column(name = "Mocion_Moc")
    private byte[] mocionMoc;
    @JoinColumn(name = "Id_Tip_Moc_Moc", referencedColumnName = "Id_Tip_Moc")
    @ManyToOne(optional = false)
    private TabTipoMocion idTipMocMoc;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idMocPM")
    private Collection<TabPersonasMociones> tabPersonasMocionesCollection;

    public TabMocion() {
    }

    public TabMocion(Integer idMoc) {
        this.idMoc = idMoc;
    }

    public TabMocion(Integer idMoc, Date fechaMoc, byte[] mocionMoc) {
        this.idMoc = idMoc;
        this.fechaMoc = fechaMoc;
        this.mocionMoc = mocionMoc;
    }

    public Integer getIdMoc() {
        return idMoc;
    }

    public void setIdMoc(Integer idMoc) {
        this.idMoc = idMoc;
    }

    public Date getFechaMoc() {
        return fechaMoc;
    }

    public void setFechaMoc(Date fechaMoc) {
        this.fechaMoc = fechaMoc;
    }

    public byte[] getMocionMoc() {
        return mocionMoc;
    }

    public void setMocionMoc(byte[] mocionMoc) {
        this.mocionMoc = mocionMoc;
    }

    public TabTipoMocion getIdTipMocMoc() {
        return idTipMocMoc;
    }

    public void setIdTipMocMoc(TabTipoMocion idTipMocMoc) {
        this.idTipMocMoc = idTipMocMoc;
    }

    @XmlTransient
    public Collection<TabPersonasMociones> getTabPersonasMocionesCollection() {
        return tabPersonasMocionesCollection;
    }

    public void setTabPersonasMocionesCollection(Collection<TabPersonasMociones> tabPersonasMocionesCollection) {
        this.tabPersonasMocionesCollection = tabPersonasMocionesCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idMoc != null ? idMoc.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TabMocion)) {
            return false;
        }
        TabMocion other = (TabMocion) object;
        if ((this.idMoc == null && other.idMoc != null) || (this.idMoc != null && !this.idMoc.equals(other.idMoc))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "cr.ac.una.entidad.TabMocion[ idMoc=" + idMoc + " ]";
    }
    
}
