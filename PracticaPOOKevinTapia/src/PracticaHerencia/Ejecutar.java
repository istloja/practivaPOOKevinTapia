/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PracticaHerencia;

import java.util.Scanner;

/**
 *
 * @author its
 */
public class Ejecutar {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("ingrese 1 para circulo, ingrese 2 para triangulo e ingrese 3 para cuadrado");
        int num = entrada.nextInt();
        switch (num) {//es como un (if)se// utiliza en un numero //pero diferente(es universal:string,etc)
            case 1://es una opcion 
                System.out.println("ingrese el radio del circulo");
                double radio = entrada.nextDouble();
                Circulo objeto = new Circulo();
                double areacirculo = objeto.calcularArea(radio);
                double perimetroCirculo = objeto.calcularPerimetro(radio);
                System.out.println("este es el area: " + areacirculo + "este es el perimetro: " + perimetroCirculo);
                break;//este para va depues de cada case
            case 2:
                System.out.println("ingrese base y altura del triangulo");
                double base = entrada.nextDouble();
                double altura = entrada.nextDouble();
                System.out.println("ingrese lados del triangulo");
                double Lado1 = entrada.nextDouble();
                double Lado2 = entrada.nextDouble();
                double Lado3 = entrada.nextDouble();
                Triangulo objeto1 = new Triangulo();
                double calcularArea = objeto1.calcularArea(base, altura);
                double calcularPerimetro = objeto1.calcularPerimetro(Lado1, Lado2, Lado3);
                System.out.println("este es el area: " + calcularArea + "este es el perimetro: " + calcularPerimetro);
                break;
            case 3:
                System.out.println("ingrese el lado del cuadrado");
                double Lado = entrada.nextDouble();
                Cuadrado objeto2 = new Cuadrado();
                double areacuadrado = objeto2.calcularArea(Lado);
                double perimetrocuadrado = objeto2.calcularPerimetro(Lado);
                System.out.println("este es el area: " + areacuadrado + "este es el perimetro: " + perimetrocuadrado);
                break;
            default://cunado no se cumple se utiliza
                System.out.println("ingrese un numero correcto");
                break;
        }
    }
}

