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
public class Mamiferos extends Animal{
    private int tiempoGestacion;
    private Boolean pelaje;

    public Mamiferos() {
    }

    public Mamiferos(int tiempoGestacion, Boolean pelaje, String nombre, int Edad, double peso, String color, double altura) {
        super(nombre, Edad, peso, color, altura);
        this.tiempoGestacion = tiempoGestacion;
        this.pelaje = pelaje;
    }

    public int getTiempoGestacion() {
        return tiempoGestacion;
    }

    public void setTiempoGestacion(int tiempoGestacion) {
        this.tiempoGestacion = tiempoGestacion;
    }

    public Boolean getPelaje() {
        return pelaje;
    }

    public void setPelaje(Boolean pelaje) {
        this.pelaje = pelaje;
    }
    
}
