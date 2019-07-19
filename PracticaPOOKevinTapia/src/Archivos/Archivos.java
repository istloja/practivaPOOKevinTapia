/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Archivos;
import java.io.File;
/**
 *
 * @author its
 */
public class Archivos {
    public static void main(String[] args) {
        File archivo=new File("C:\\Users\\its\\Desktop/ejemplo.txt");//CREANDO UN OBJETO   //sirve para archivo y carpetas
    // en las comillas va el nombre y  la direccion del archivo
        System.out.println(archivo.exists());
        System.out.println(archivo.isDirectory());//para saber si es una carpeta o no
        System.out.println(archivo.isFile());//para saber si es archivo
        System.out.println(archivo.isHidden());//para ocultar
        System.out.println(archivo.lastModified());//para saber la ultima fecha de modificacion
        archivo.delete();
    
    File carpeta=new File("C:\\Users\\its\\Desktop");
   //carpeta.list devuelve un arreglo (coleccion del mismo tipo) con los archivos de una carpeta
    String [] arregloarchivos=carpeta.list();
        for (int i = 0; i < arregloarchivos.length; i++) {
            System.out.println(arregloarchivos[i]);
            
        }
    }
}
