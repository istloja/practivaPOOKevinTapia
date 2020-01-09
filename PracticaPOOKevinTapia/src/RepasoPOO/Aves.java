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
public class Aves extends Animal{
   private int numHuevos;
   private boolean vuela;  
//de ley va siempre getter an setter y constructor juntos 1ro getter luego constructor ...1 constructor vacio luego completo
    public Aves() {
    }

    public Aves(int numHuevos, boolean vuela, String nombre, int Edad, double peso, String color, double altura) {
        super(nombre, Edad, peso, color, altura);
        this.numHuevos = numHuevos;
        this.vuela = vuela;
    }

    public int getNumHuevos() {
        return numHuevos;
    }

    public void setNumHuevos(int numHuevos) {
        this.numHuevos = numHuevos;
    }

    public boolean isVuela() {
        return vuela;
    }

    public void setVuela(boolean vuela) {
        this.vuela = vuela;
    }
   
}
