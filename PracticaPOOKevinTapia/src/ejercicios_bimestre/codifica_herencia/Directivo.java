/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_bimestre.codifica_herencia;

/**
 *
 * @author its
 */
public class Directivo extends Empleado {
    public Directivo() {
    }
   
    public Directivo(String nombre) {
        super(nombre);
        System.out.println("Constructor de Directivo");
    }
   
    @Override
    public String toString() {
        return super.toString() + " -> Directivo";
    }
}
