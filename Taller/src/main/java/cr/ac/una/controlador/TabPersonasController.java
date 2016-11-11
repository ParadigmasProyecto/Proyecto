/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.una.controlador; 

import cr.ac.una.entidad.TabPersonas;
import cr.ac.una.entidad.TabPersonasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 *
 * @author María Laura 
 */
@Component
@Scope("session")

public class TabPersonasController {
    
    @Autowired
    TabPersonasRepository TabPersonasRepository;
    TabPersonas TabPersonas = new TabPersonas();
    
    public void  save(){
        TabPersonasRepository.save(TabPersonas);
    }

    public TabPersonas getTabPersonas() {
        return TabPersonas;
    }

    public void setTabPersonas(TabPersonas TabPersonas) {
        this.TabPersonas = TabPersonas;
    }
    
}