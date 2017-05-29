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
public class Sala {
    //definiciones
    private  String nombreSala;
    private int numMesas;
    private  int idSala;
    
    
    
    

    //accesores
    public String getNombreSala(){
        return nombreSala;
    } 

    public void setNombreSala(String nombreSala) {
        this.nombreSala = nombreSala;
    }
    //---------
    public int getIdSala() {
        return idSala;
    }

    public void setIdSala(int idSala) {
        this.idSala = idSala;
    }
    

   
    //--------------
    public int getNumMesas() {
        return numMesas;
    }
    public void setNumMesas(int numMesas) {    
        this.numMesas = numMesas;
    }

    //metodos
    
    
    //constructor
   
    public Sala( int numSalas, String nombreSala, int numMesas, int idSala) {
        //this.nombreRestaurante = nombreRestaurante;
        //setNumSalas(getNumSalas()+1);
        
        this.nombreSala = nombreSala;
        this.numMesas = numMesas;
        this.idSala = idSala;
        //Restaurante.setNumSalas(Restaurante.getNumSalas()+1);
        
        
        
               
    } 

    
    
    
}
