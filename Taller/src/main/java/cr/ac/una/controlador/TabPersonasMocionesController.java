/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.una.controlador;

import cr.ac.una.entidad.TabPersonasMociones;
import cr.ac.una.entidad.TabPersonasMocionesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 *
 * @author María Laura
 */
@Component
@Scope("session")
public class TabPersonasMocionesController {
    
    @Autowired
    TabPersonasMocionesRepository TabPersonasMocionesRepository;
    TabPersonasMociones TabPersonasMociones = new TabPersonasMociones();
    
    public void  save(){
        TabPersonasMocionesRepository.save(TabPersonasMociones);
    }

    public TabPersonasMociones getTabPersonasMociones() {
        return TabPersonasMociones;
    }

    public void setTabPersonasMociones(TabPersonasMociones TabPersonasMociones) {
        this.TabPersonasMociones = TabPersonasMociones;
    }
    
}
