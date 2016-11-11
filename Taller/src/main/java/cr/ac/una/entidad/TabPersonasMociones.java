/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.una.entidad;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author María Laura
 */
@Entity
@Table(name = "tab_personas_mociones")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TabPersonasMociones.findAll", query = "SELECT t FROM TabPersonasMociones t"),
    @NamedQuery(name = "TabPersonasMociones.findByIdPerMoc", query = "SELECT t FROM TabPersonasMociones t WHERE t.idPerMoc = :idPerMoc")})
public class TabPersonasMociones implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "Id_Per_Moc")
    private String idPerMoc;
    @JoinColumn(name = "Id_Moc_PM", referencedColumnName = "Id_Moc")
    @ManyToOne(optional = false)
    private TabMocion idMocPM;
    @JoinColumn(name = "Id_Per_PM", referencedColumnName = "Id_Per")
    @ManyToOne(optional = false)
    private TabPersonas idPerPM;

    public TabPersonasMociones() {
    }

    public TabPersonasMociones(String idPerMoc) {
        this.idPerMoc = idPerMoc;
    }

    public String getIdPerMoc() {
        return idPerMoc;
    }

    public void setIdPerMoc(String idPerMoc) {
        this.idPerMoc = idPerMoc;
    }

    public TabMocion getIdMocPM() {
        return idMocPM;
    }

    public void setIdMocPM(TabMocion idMocPM) {
        this.idMocPM = idMocPM;
    }

    public TabPersonas getIdPerPM() {
        return idPerPM;
    }

    public void setIdPerPM(TabPersonas idPerPM) {
        this.idPerPM = idPerPM;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPerMoc != null ? idPerMoc.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TabPersonasMociones)) {
            return false;
        }
        TabPersonasMociones other = (TabPersonasMociones) object;
        if ((this.idPerMoc == null && other.idPerMoc != null) || (this.idPerMoc != null && !this.idPerMoc.equals(other.idPerMoc))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "cr.ac.una.entidad.TabPersonasMociones[ idPerMoc=" + idPerMoc + " ]";
    }
    
}
