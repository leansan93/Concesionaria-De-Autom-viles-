
package com.mycompany.automovil.logica;

import com.mycompany.automovil.persistencia.ControladoraPersistencia;
import java.util.List;


public class Controladora {
    
    ControladoraPersistencia controlPersis= new ControladoraPersistencia();
     Automovil auto = new Automovil();
    public void agregarAutomovil(String marca, String patente, String motor, String color, String modelo, int cantPuertas) {
           
            auto.setMarca(marca);
            auto.setMotor(motor);
            auto.setColor(color);
            auto.setPatente(patente);
            auto.setModelo(modelo);
            auto.setCantPuertas(cantPuertas);
            
            controlPersis.agregarAutomovil(auto);
    }

    public List<Automovil> traerAutos() {
        return  controlPersis.traerAutos() ;
    }

    public void borrarAuto(int idAuto) {
        controlPersis.borrarAuto(idAuto);
    }

    public Automovil traerAuto(int idAuto) {
        return controlPersis.traerAuto(idAuto);
    }

    public void modificarAuto(Automovil auto, String marca, String patente, String color, String modelo, String motor, int cantPuertas) {
            auto.setMarca(marca);
            auto.setPatente(patente);
            auto.setColor(color);
            auto.setModelo(modelo);
            auto.setMotor(motor);
            auto.setCantPuertas(cantPuertas);
            // le pido a la persis que lo modifique 
            controlPersis.modificarAuto(auto);
    }

   
    
}
