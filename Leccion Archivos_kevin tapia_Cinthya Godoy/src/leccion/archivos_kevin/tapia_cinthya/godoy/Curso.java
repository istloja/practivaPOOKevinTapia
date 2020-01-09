/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leccion.archivos_kevin.tapia_cinthya.godoy;

import java.io.Serializable;

/**
 *
 * @author its
 */
public class Curso implements Serializable {
    private String carrera;
    private String nombre;
    private int Nciclo;
    private int Nestudiante;

    public Curso() {
    }

    public Curso(String carrera, String nombre, int Nciclo, int Nestudiante) {
        this.carrera = carrera;
        this.nombre = nombre;
        this.Nciclo = Nciclo;
        this.Nestudiante = Nestudiante;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNciclo() {
        return Nciclo;
    }

    public void setNciclo(int Nciclo) {
        this.Nciclo = Nciclo;
    }

    public int getNestudiante() {
        return Nestudiante;
    }

    public void setNestudiante(int Nestudiante) {
        this.Nestudiante = Nestudiante;
    }
    
}
