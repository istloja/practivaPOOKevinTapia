/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herencia21junio;

/**
 *
 * @author its
 */
public class Persona {

    private String nombre;
    private String apellido;
    private int edad;
    private int cedula;
    private String direccion;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
        
    public void saludar() {
        System.out.println("hola");
    }    
    public void despedir() {
        System.out.println("chao");
    }
    public void Nombre(){
        System.out.println("viche");
    }
        public void Cedula(){
        System.out.println(1012910328);
    }
    public static void main(String[] args) {
        Persona objeto=new Persona();
        objeto.setNombre("viche");
        objeto.setCedula(1105001111);
        System.out.println(objeto.getNombre());
    }
}
