/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.una.controlador;

import cr.ac.una.entidad.TabMocion;
import cr.ac.una.entidad.TabMocionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 *
 * @author María Laura
 */
@Component
@Scope("session")
public class TabMocionController {
    
    @Autowired
    TabMocionRepository TabMocionRepository;
    TabMocion TabMocion = new TabMocion();
    
    public void  save(){
        TabMocionRepository.save(TabMocion);
    }

    public TabMocion getTabMocion() {
        return TabMocion;
    }

    public void setTabMocion(TabMocion TabMocion) {
        this.TabMocion = TabMocion;
    }
    
}

