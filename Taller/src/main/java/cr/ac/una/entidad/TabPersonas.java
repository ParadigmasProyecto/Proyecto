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
@Table(name = "tab_personas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TabPersonas.findAll", query = "SELECT t FROM TabPersonas t"),
    @NamedQuery(name = "TabPersonas.findByIdPer", query = "SELECT t FROM TabPersonas t WHERE t.idPer = :idPer"),
    @NamedQuery(name = "TabPersonas.findByNombrePer", query = "SELECT t FROM TabPersonas t WHERE t.nombrePer = :nombrePer"),
    @NamedQuery(name = "TabPersonas.findByCorreoPer", query = "SELECT t FROM TabPersonas t WHERE t.correoPer = :correoPer"),
    @NamedQuery(name = "TabPersonas.findByTelefonoPer", query = "SELECT t FROM TabPersonas t WHERE t.telefonoPer = :telefonoPer"),
    @NamedQuery(name = "TabPersonas.findByEstamentoPer", query = "SELECT t FROM TabPersonas t WHERE t.estamentoPer = :estamentoPer"),
    @NamedQuery(name = "TabPersonas.findByCentroTrabajoPer", query = "SELECT t FROM TabPersonas t WHERE t.centroTrabajoPer = :centroTrabajoPer")})
public class TabPersonas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "Id_Per")
    private String idPer;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 150)
    @Column(name = "Nombre_Per")
    private String nombrePer;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "Correo_Per")
    private String correoPer;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 8)
    @Column(name = "Telefono_Per")
    private String telefonoPer;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "Estamento_Per")
    private String estamentoPer;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "Centro_Trabajo_Per")
    private String centroTrabajoPer;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idPerPM")
    private Collection<TabPersonasMociones> tabPersonasMocionesCollection;

    public TabPersonas() {
    }

    public TabPersonas(String idPer) {
        this.idPer = idPer;
    }

    public TabPersonas(String idPer, String nombrePer, String correoPer, String telefonoPer, String estamentoPer, String centroTrabajoPer) {
        this.idPer = idPer;
        this.nombrePer = nombrePer;
        this.correoPer = correoPer;
        this.telefonoPer = telefonoPer;
        this.estamentoPer = estamentoPer;
        this.centroTrabajoPer = centroTrabajoPer;
    }

    public String getIdPer() {
        return idPer;
    }

    public void setIdPer(String idPer) {
        this.idPer = idPer;
    }

    public String getNombrePer() {
        return nombrePer;
    }

    public void setNombrePer(String nombrePer) {
        this.nombrePer = nombrePer;
    }

    public String getCorreoPer() {
        return correoPer;
    }

    public void setCorreoPer(String correoPer) {
        this.correoPer = correoPer;
    }

    public String getTelefonoPer() {
        return telefonoPer;
    }

    public void setTelefonoPer(String telefonoPer) {
        this.telefonoPer = telefonoPer;
    }

    public String getEstamentoPer() {
        return estamentoPer;
    }

    public void setEstamentoPer(String estamentoPer) {
        this.estamentoPer = estamentoPer;
    }

    public String getCentroTrabajoPer() {
        return centroTrabajoPer;
    }

    public void setCentroTrabajoPer(String centroTrabajoPer) {
        this.centroTrabajoPer = centroTrabajoPer;
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
        hash += (idPer != null ? idPer.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TabPersonas)) {
            return false;
        }
        TabPersonas other = (TabPersonas) object;
        if ((this.idPer == null && other.idPer != null) || (this.idPer != null && !this.idPer.equals(other.idPer))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "cr.ac.una.entidad.TabPersonas[ idPer=" + idPer + " ]";
    }
    
}
