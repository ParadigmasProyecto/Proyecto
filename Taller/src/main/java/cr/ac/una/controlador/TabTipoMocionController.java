/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.una.controlador;

import cr.ac.una.entidad.TabTipoMocion;
import cr.ac.una.entidad.TabTipoMocionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 *
 * @author María Laura
 */
@Component
@Scope("session")
public class TabTipoMocionController {
    
    @Autowired
    TabTipoMocionRepository TabTipoMocionRepository;
    TabTipoMocion TabTipoMocion = new TabTipoMocion();
    
    public void  save(){
        TabTipoMocionRepository.save(TabTipoMocion);
    }

    public TabTipoMocion getTabTipoMocion() {
        return TabTipoMocion;
    }

    public void setTabTipoMocion(TabTipoMocion TabTipoMocion) {
        this.TabTipoMocion = TabTipoMocion;
    }
   
}
