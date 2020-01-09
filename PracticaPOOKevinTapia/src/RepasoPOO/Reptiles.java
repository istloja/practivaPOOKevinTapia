/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RepasoPOO;

/**
 *
 * @author its
 */
public class Reptiles extends Animal{
    private boolean reproduccionHuevos;
    private String alimentacion;


    public Reptiles(boolean reproduccionHuevos, String alimentacion, String nombre, int Edad, double peso, String color, double altura) {
        super(nombre, Edad, peso, color, altura);
        this.reproduccionHuevos = reproduccionHuevos;
        this.alimentacion = alimentacion;
    }

    public Reptiles() {
    }

    public boolean isReproduccionHuevos() {
        return reproduccionHuevos;
    }

    public void setReproduccionHuevos(boolean reproduccionHuevos) {
        this.reproduccionHuevos = reproduccionHuevos;
    }

    public String getAlimentacion() {
        return alimentacion;
    }

    public void setAlimentacion(String alimentacion) {
        this.alimentacion = alimentacion;
    }
    
    
}
