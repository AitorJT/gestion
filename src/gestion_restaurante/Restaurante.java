/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion_restaurante;

/**
 *
 * @author DAW114
 */
public class Restaurante {
    //definiciones
    private int numSalas;
    private  String nombreRestaurante;
    
    //metodos

    //accesores
    
    public String getNombreRestaurante() {    
        return nombreRestaurante;
    }

    public void setNombreRestaurante(String nombreRestaurante) {
        this.nombreRestaurante = nombreRestaurante;
    }
    
    
    
    //----------
    public int getNumSalas() {
        return numSalas;
    }

    public void setNumSalas(int numSalas) {
        this.numSalas = numSalas;
    }
    
    

    //constructor
    public Restaurante(String nombreRestaurante, int numSalas) {
        this.nombreRestaurante = nombreRestaurante;
        this.numSalas=numSalas;
    }
    
    
}
