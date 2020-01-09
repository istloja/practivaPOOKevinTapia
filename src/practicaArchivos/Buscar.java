/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaArchivos;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author its
 */
public class Buscar {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("ingresa 1 para listar archivos de documentos");
        System.out.println("ingresa 2  para listar archivos de imagenes");
        System.out.println("ingresa 3  para listar archivos de musica");
        System.out.println("ingresa 4  para listar archivos de videos");
        System.out.println("ingresa 5  para listar archivos de NeatBeans");

        int opcion = entrada.nextInt();
        switch (opcion) {
            case 1:
                File carpeta = new File("\\\\ISTLOJA02\\Users\\its\\Documents");
                String[] arregloarchivos = carpeta.list();
                for (int i = 0; i < arregloarchivos.length; i++) {
                    System.out.println(arregloarchivos[i]);
                }

            case 2:
                File carpeta1 = new File("\\Users\\its\\Pictures");
                String[] arregloarchivos1 = carpeta1.list();
                for (int i = 0; i < arregloarchivos1.length; i++) {
                    System.out.println(arregloarchivos1[i]);

                }
            case 3:
                File carpeta2 = new File("C:\\Users\\its\\Music");
                String[] arregloarchivos2 = carpeta2.list();
                for (int i = 0; i < arregloarchivos2.length; i++) {
                    System.out.println(arregloarchivos2[i]);

                }
            case 4:
                File carpeta3 = new File("C:\\Users\\kevin\\Videos");
                String[] arregloarchivos3 = carpeta3.list();
                for (int i = 0; i < arregloarchivos3.length; i++) {
                    System.out.println(arregloarchivos3[i]);

                }
            case 5:
                File carpeta4 = new File("C:/Users\\kevin\\Documents\\NetBeansProjects");
                String[] arregloarchivos4 = carpeta4.list();
                for (int i = 0; i < arregloarchivos4.length; i++) {
                    System.out.println(arregloarchivos4[i]);
                }
            default:
                System.out.println("ingrese numero un numero de la lista porfavor");
        }
        
    }

}
