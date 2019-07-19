/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PracticaHerencia;

/**
 *
 * @author its
 */
public class Cubo extends FiguraTridimensional{
       public double calcularlogintudcubo(double cubo){
    return Math.pow(cubo,cubo);
    }
        public double calcularVolumencubo(double volumen){
        return volumen*volumen*volumen;
        }
}
