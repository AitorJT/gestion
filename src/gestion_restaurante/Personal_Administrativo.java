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
public abstract  class Personal_Administrativo extends Personal{
    
    //definiciones
    private String turnoAdministrativo;
        //definir mas adelante para que tenga valor de mañana o tarde.
    //metodos
    
    //metodos accesores
      public String getTurnoAdministrativo() {
        return turnoAdministrativo;
    }

    public void setTurnoAdministrativo(String turnoAdministrativo) {
        this.turnoAdministrativo = turnoAdministrativo;
    }
    //constructores

    public Personal_Administrativo(int numSSEmpleado, int tfnoEmpleado, int sueldoEmpleado, String categoriaEmpleado,String nombreEmpleado, String apellidoEmpleado, String dniEmpleado, String turnoEmpleado){
        super(numSSEmpleado,tfnoEmpleado,sueldoEmpleado,categoriaEmpleado,nombreEmpleado,apellidoEmpleado,dniEmpleado,turnoEmpleado);
    }
    
}
