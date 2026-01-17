 
package com.mycompany.automovil.logica;

//import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Automovil  {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id; 
    
    @Basic
    private String marca;
    private String patente ;
    private String motor;
    private String color ; 
    private String modelo ; 
    private int cantPuertas;

    public Automovil() {
    }

    public Automovil(int id, String marca, String patente, String motor, String color, String modelo, int cantPuertas) {
        this.id = id;
        this.marca = marca;
        this.patente = patente;
        this.motor = motor;
        this.color = color;
        this.modelo = modelo;
        this.cantPuertas = cantPuertas;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCantPuertas() {
        return cantPuertas;
    }

    public void setCantPuertas(int cantPuertas) {
        this.cantPuertas = cantPuertas;
    }

    @Override
    public String toString() {
        return "Automovil{" + "id=" + id + ", marca=" + marca + ", patente=" + patente + ", motor=" + motor + ", color=" + color + ", modelo=" + modelo + ", cantPuertas=" + cantPuertas + '}';
    }

    
    
    
}
