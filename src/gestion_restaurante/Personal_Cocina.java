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
public abstract class Personal_Cocina extends Personal{
    //definiciones
    private String encargado;
    private String turnoCocina;
        //definir mas adelante para mañana/tarde/noche
    
    private int contPersonalCocina;
    
    //metodos
    
    //accesores

    public String getTurnoCocina() {
        return turnoCocina;
    }

    public void setTurnoCocina(String turnoCocina) {
        this.turnoCocina = turnoCocina;
    }
    
    //--------------

    public String getEncargado() {
        return encargado;
    }

    public void setEncargado(String encargado) {
        this.encargado = encargado;
    }
    //-------------
    public int getContPersonalCocina() {
        return contPersonalCocina;
    }

    public void setContPersonalCocina(int contPersonalCocina) {
        this.contPersonalCocina = contPersonalCocina;
    }
    
    
    //Constructores
    public Personal_Cocina(int numSSEmpleado, int tfnoEmpleado, int sueldoEmpleado, String categoriaEmpleado,String nombreEmpleado, String apellidoEmpleado, String dniEmpleado, String turnoEmpleado){
        super(numSSEmpleado,tfnoEmpleado,sueldoEmpleado,categoriaEmpleado,nombreEmpleado,apellidoEmpleado,dniEmpleado,turnoEmpleado);
    }
    
}
