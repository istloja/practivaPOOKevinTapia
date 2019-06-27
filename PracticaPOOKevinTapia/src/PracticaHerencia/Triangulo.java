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
public class Triangulo extends FiguraBidimensional {

    public double calcularArea(double Base, double Altura) {
        return Base * Altura / 2;
    }

    public double calcularPerimetro(double Lado1, double Lado2, double Lado3) {
        return Lado1 + Lado2 + Lado3;
    }
}
