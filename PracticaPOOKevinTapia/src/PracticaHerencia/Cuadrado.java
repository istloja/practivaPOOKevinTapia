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
public class Cuadrado extends FiguraBidimensional {

    public double calcularArea(double Lado) {
        return Math.pow(Lado, 2);
    }

    public double calcularPerimetro(double Lado) {
        return Lado + Lado + Lado + Lado;
    }

}
