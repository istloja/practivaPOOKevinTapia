/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_bimestre;

/**
 *
 * @author its
 */
public class Fraccion {

    private int numerador;
    private int denominador;

    public Fraccion() {
        this.numerador = 1;
        this.denominador = 1;

    }

    public Fraccion(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;

    }

    public int getNumerador() {
        return numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }

    public void invertir() {
        int aux = numerador;
        numerador = denominador;
        denominador = aux;
    }

    public void simplificar() {
        System.out.println("Simplificando...");
        int cont = 2;
        while (cont <= Math.abs(numerador) && cont <= Math.abs(denominador)) {
            if (numerador % cont == 0 && denominador % cont == 0) {
                numerador = numerador / cont;
                denominador = denominador / cont;
                System.out.println(toString());
            } else {
                cont++;
            }
        }
        System.out.println("Fin simplificando");
    }

    

    public static void main(String[] args) {
        Fraccion f = new Fraccion(2, 4);
        //System.out.println(f.toString());
        System.out.println("simplificar");
        f.simplificar();
        System.out.println("resultado");
        System.out.println("numerador"+f.numerador);
        
        System.out.println("denominador"+f.denominador);
        

    }
}
