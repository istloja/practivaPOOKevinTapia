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
public class Jefe extends Persona{

    private String cargo;
    private String titulo;
    private String experiencia;

        public void cargo()

    {
        System.out.println("el cargo es de jefe");
    }
        public void titulo()

    {
        System.out.println("el titulo es ing");
    } 
        public void experiencia()

    {
        System.out.println("su experiencia es de 30 años");
    }
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(String experiencia) {
        this.experiencia = experiencia;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public static void main(String[] args) {
        
        Jefe objeto=new Jefe();
        objeto.cargo();
        objeto.experiencia();
        objeto.titulo();//
        objeto.Nombre();
        objeto.Cedula();
    }
}
