/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.una.entidad;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author María Laura
 */
@Entity
@Table(name = "tab_tipo_mocion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TabTipoMocion.findAll", query = "SELECT t FROM TabTipoMocion t"),
    @NamedQuery(name = "TabTipoMocion.findByIdTipMoc", query = "SELECT t FROM TabTipoMocion t WHERE t.idTipMoc = :idTipMoc"),
    @NamedQuery(name = "TabTipoMocion.findByDescripcionTipMoc", query = "SELECT t FROM TabTipoMocion t WHERE t.descripcionTipMoc = :descripcionTipMoc")})
public class TabTipoMocion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id_Tip_Moc")
    private Integer idTipMoc;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "Descripcion_Tip_Moc")
    private String descripcionTipMoc;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idTipMocMoc")
    private Collection<TabMocion> tabMocionCollection;

    public TabTipoMocion() {
    }

    public TabTipoMocion(Integer idTipMoc) {
        this.idTipMoc = idTipMoc;
    }

    public TabTipoMocion(Integer idTipMoc, String descripcionTipMoc) {
        this.idTipMoc = idTipMoc;
        this.descripcionTipMoc = descripcionTipMoc;
    }

    public Integer getIdTipMoc() {
        return idTipMoc;
    }

    public void setIdTipMoc(Integer idTipMoc) {
        this.idTipMoc = idTipMoc;
    }

    public String getDescripcionTipMoc() {
        return descripcionTipMoc;
    }

    public void setDescripcionTipMoc(String descripcionTipMoc) {
        this.descripcionTipMoc = descripcionTipMoc;
    }

    @XmlTransient
    public Collection<TabMocion> getTabMocionCollection() {
        return tabMocionCollection;
    }

    public void setTabMocionCollection(Collection<TabMocion> tabMocionCollection) {
        this.tabMocionCollection = tabMocionCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTipMoc != null ? idTipMoc.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TabTipoMocion)) {
            return false;
        }
        TabTipoMocion other = (TabTipoMocion) object;
        if ((this.idTipMoc == null && other.idTipMoc != null) || (this.idTipMoc != null && !this.idTipMoc.equals(other.idTipMoc))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "cr.ac.una.entidad.TabTipoMocion[ idTipMoc=" + idTipMoc + " ]";
    }
    
}
