/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escribirarchivo;

import java.io.File;

/**
 *
 * @author kevin
 */
public class Ejecutar {

    public static void main(String[] args) {
        EscribirArchivo a = new EscribirArchivo();
        a.concatenar("practica.txt","    " +"aumento texto");
        String l = a.leer("practica.txt");
        System.out.println(l);
       
//File archivo=new File("practica.txt");
//archivo.delete();
// System.out.println(a.leer("archivo.txt"));
    }
}
