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
public abstract class Personal_Sala extends Personal {

    //Definiciones
    private int contPersonalSala;
    private String turnoCocina;
        //definir mas adelante para mañana/tarde/noche

    //metodos
    //accesores

    public String getTurnoCocina() {
        return turnoCocina;
    }

    public void setTurnoCocina(String turnoCocina) {
        this.turnoCocina = turnoCocina;
    }
    
    //----------
    
    public int getContPersonalSala() {
        return contPersonalSala;
    }

    public void setContPersonalSala(int contPersonalSala) {
        this.contPersonalSala = contPersonalSala;
    }

    //constructores
    public Personal_Sala(int numSSEmpleado, int tfnoEmpleado, int sueldoEmpleado, String categoriaEmpleado, String nombreEmpleado, String apellidoEmpleado, String dniEmpleado, String turnoEmpleado) {
        super(numSSEmpleado, tfnoEmpleado, sueldoEmpleado, categoriaEmpleado, nombreEmpleado, apellidoEmpleado, dniEmpleado, turnoEmpleado);
    }

}
