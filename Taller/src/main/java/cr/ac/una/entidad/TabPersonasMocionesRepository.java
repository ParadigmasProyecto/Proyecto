/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.una.entidad;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author María Laura
 */
@Repository
public interface TabPersonasMocionesRepository extends JpaRepository<TabPersonasMociones, Long>{
    
}
