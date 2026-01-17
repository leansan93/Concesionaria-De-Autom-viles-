
package com.mycompany.automovil.persistencia;

import com.mycompany.automovil.logica.Automovil;
import com.mycompany.automovil.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ControladoraPersistencia {
    AutomovilJpaController autoJPA = new AutomovilJpaController();
    
    public void agregarAutomovil(Automovil auto) {
        autoJPA.create(auto);       
    }

    public List<Automovil> traerAutos() {
        return autoJPA.findAutomovilEntities(); // trae todos los registros de la base de datos
        
    }

    public void borrarAuto(int idAuto) {
        try {
            autoJPA.destroy(idAuto);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Automovil traerAuto(int idAuto) {
        return autoJPA.findAutomovil(idAuto);
    }

    public void modificarAuto(Automovil auto) {
        try {
            autoJPA.edit(auto);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
    
}
