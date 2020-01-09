/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escribirarchivo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author kevin
 */
public class EscribirArchivo {

    /**
     * @param args the command line arguments
     */
    public void crearTexto(String nombre, String texto) {
        File f;
        FileReader lectorArchivo;
        FileWriter escritorArchivo;

        try {
            f = new File(nombre);
            escritorArchivo = new FileWriter(f);
            BufferedWriter bw = new BufferedWriter(escritorArchivo);
            PrintWriter salida = new PrintWriter(bw);

            salida.write(texto + "\n");

            salida.close();
            bw.close();
        } catch (IOException e) {
            System.out.println("error" + e.getMessage());

        }

    }

    public String leer(String nombre) //El parametro nombre indica el nombre del archivo por ejemplo "prueba.txt" 
    {

        File f;
        FileReader lectorArchivos;
        try {
//Creamos el objeto del archivo que vamos a leer
            f = new File(nombre);

//Creamos el objeto FileReader que abrira el flujo(Stream) de datos para realizar la lectura
            lectorArchivos = new FileReader(f);

//Creamos un lector en buffer para recopilar datos a travez del flujo "lectorArchivos" que hemos creado
            BufferedReader br = new BufferedReader(lectorArchivos);

            String l = "";
//Esta variable "l" la utilizamos para guardar mas adelante toda la lectura del archivo

            String aux = "";/*variable auxiliar*/

            while (true) //este ciclo while se usa para repetir el proceso de lectura, ya que se lee solo 1 linea de texto a la vez
            {

                aux = br.readLine();
//leemos una linea de texto y la guardamos en la variable auxiliar
                if (aux != null) {
                    l = l + aux + "n";
                } /*si la variable aux tiene datos se va acumulando en la variable l,
                 * en caso de ser nula quiere decir que ya nos hemos leido todo
                 * el archivo de texto*/ else {
                    break;
                }
            }
            br.close();
            lectorArchivos.close();
            return l;
        } catch (IOException e) {
            System.out.println("Error:" + e.getMessage());
        }
        return null;
    }
            public void concatenar (String nombre,String texto){
                String temp=this.leer(nombre);
                temp=temp+texto;
            this.crearTexto(nombre, temp);
        }
}
