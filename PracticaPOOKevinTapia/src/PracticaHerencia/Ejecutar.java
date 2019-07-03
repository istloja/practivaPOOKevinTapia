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
        System.out.println("ingrese 1 para circulo, ingrese 2 para triangulo , ingrese 3 para cuadrado,ingrese 4 para cubo,ingrese 5 para esfera,ingrese 6 para tetraedro ");
        int num = entrada.nextInt();
        switch (num) {//es como un (if)se// utiliza en un numero //pero diferente(es universal:string,etc)
            case 1://es una opcion 
                System.out.println("ingrese el radio del circulo");
                double radio=entrada.nextDouble();
                Circulo objeto=new Circulo();
                double areacirculo=objeto.calcularArea(radio);
                double perimetroCirculo=objeto.calcularPerimetro(radio);
                System.out.println("este es el area: "+areacirculo+"este es el perimetro: "+perimetroCirculo);
                break;//este para va depues de cada case
            case 2:
                System.out.println("ingrese base y altura del triangulo");
                double base=entrada.nextDouble();
                double altura=entrada.nextDouble();
                System.out.println("ingrese lados del triangulo");
                double Lado1=entrada.nextDouble();
                double Lado2=entrada.nextDouble();
                double Lado3=entrada.nextDouble();
                Triangulo objeto1=new Triangulo();
                double calcularArea=objeto1.calcularArea(base, altura);
                double calcularPerimetro=objeto1.calcularPerimetro(Lado1, Lado2, Lado3);
                System.out.println("este es el area: "+calcularArea+"este es el perimetro: "+calcularPerimetro);
                break;
            case 3:
                System.out.println("ingrese el lado del cuadrado");
                double Lado=entrada.nextDouble();
                Cuadrado objeto2=new Cuadrado();
                double areacuadrado=objeto2.calcularArea(Lado);
                double perimetrocuadrado=objeto2.calcularPerimetro(Lado);
                System.out.println("este es el area: "+areacuadrado+"este es el perimetro: "+perimetrocuadrado);
                break;
                 case 4:
                System.out.println("ingrese la longitud del cubo");
                 double cubo=entrada.nextDouble();
                 System.out.println("ingrese el volumen");
                 double volumen=entrada.nextDouble();
                Cubo objeto4 = new Cubo();
                double calcularlongitud=objeto4.calcularlogintudcubo(cubo);
                        
                double calcularvolumencubo=objeto4.calcularVolumencubo(volumen);
                System.out.println("longitud"+calcularlongitud+"volumen"+calcularvolumencubo);
                break;
            case 5:
                System.out.println("ingrese el radio para la esfera");
                double radioes=entrada.nextDouble();
                
                
               
                 Esfera objeto5 = new Esfera();
                 
                double calcularradio=objeto5.calcularRadio(radioes);
                double calcularvolumen=objeto5.calcularVolumen(radioes);
                System.out.println("radio"+calcularradio+"volumen"+calcularvolumen);
                break;
           
               
            case 6:
                System.out.println("ingrese valor para el area");
                double ladotetra=entrada.nextDouble();
                System.out.println("ingrese la arista");
                double aristas=entrada.nextDouble();
                
                Tetraedro objeto6=new Tetraedro();
                
                double calcularaereatetra=objeto6.calcularAREA(ladotetra);
                double calcularvolumentetra=objeto6.calcularVOLUMEN(aristas);
                System.out.println("areatetraedro"+calcularaereatetra+"volumen del tetraedro"+calcularvolumentetra);
                break;
            default://cunado no se cumple se utiliza
                System.out.println("ingrese un numero correcto");
                break;
                
        }
    }

}
