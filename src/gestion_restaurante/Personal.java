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
public abstract class Personal {
    //definiciones
    private int codEmpresa, numSSEmpleado, tfnoEmpleado;
    private String nombreEmpleado, apellidoEmpleado, dniEmpleado, direccionEmpleado, categoriaEmpleado,turnoEmpleado ;

    
    private double sueldoEmpleado;
    
    //contadores
    private int contadorEmpleados;
    
    //metodos accesores
    
    public int getCodEmpresa(){
        return codEmpresa;
    }
    public void setCodEmpresa(int codEmpresa){
        this.codEmpresa = codEmpresa;
    }
    //--------
    public int getNumSSEmpleado(){
        return numSSEmpleado;
    }
    public void setNumSSEmpleado(int numSSEmpleado){
        this.numSSEmpleado = numSSEmpleado;
    }
    //--------
    public int getTfnoEmpleado(){
        return tfnoEmpleado;
    }
    public void setTfnoEmpleado(int tfnoEmpleado){
        this.tfnoEmpleado = tfnoEmpleado;
    }
    //--------
    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }
    //--------

    public String getApellidoEmpleado() {
        return apellidoEmpleado;
    }

    public void setApellidoEmpleado(String apellidoEmpleado) {
        this.apellidoEmpleado = apellidoEmpleado;
    }
    //--------
    public String getDniEmpleado() {
        return dniEmpleado;
    }

    public void setDniEmpleado(String dniEmpleado) {
        this.dniEmpleado = dniEmpleado;
    }
    //--------
    public String getDireccionEmpleado() {
        return direccionEmpleado;
    }

    public void setDireccionEmpleado(String direccionEmpleado) {
        this.direccionEmpleado = direccionEmpleado;
    }
    //--------
    public String getCategoriaEmpleado() {
        return categoriaEmpleado;
    }

    public void setCategoriaEmpleado(String categoriaEmpleado) {
        this.categoriaEmpleado = categoriaEmpleado;
    }
    //--------
    public String getTurnoEmpleado() {
        return turnoEmpleado;
    }

    public void setTurnoEmpleado(String turnoEmpleado) {
        this.turnoEmpleado = turnoEmpleado;
    }
    //--------
    public double getSueldoEmpleado() {
        return sueldoEmpleado;
    }

    public void setSueldoEmpleado(double sueldoEmpleado) {
        this.sueldoEmpleado = sueldoEmpleado;
    }
    //--------
    public int getContadorEmpleados() {
        return contadorEmpleados;
    }

    public void setContadorEmpleados(int contadorEmpleados) {
        this.contadorEmpleados = contadorEmpleados;
    }
    
    
    //Construcrores
    
    public Personal( int numSSEmpleado, int tfnoEmpleado, int sueldoEmpleado, String categoriaEmpleado,String nombreEmpleado, String apellidoEmpleado, String dniEmpleado, String turnoEmpleado){
        this.numSSEmpleado=numSSEmpleado;
        this.tfnoEmpleado = tfnoEmpleado;
        this.sueldoEmpleado = sueldoEmpleado;
        this.categoriaEmpleado = categoriaEmpleado;
        this.nombreEmpleado = nombreEmpleado;
        this.apellidoEmpleado=apellidoEmpleado;
        this.dniEmpleado = dniEmpleado;
        this.turnoEmpleado=turnoEmpleado;
    }
}
