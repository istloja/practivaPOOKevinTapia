/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Archivos;
import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;
/**
 *
 * @author its
 */
public class Archivos {
//    public static void main(String[] args) {
//        File archivo=new File("C:\\Users\\its\\Desktop/ejemplo.txt");//CREANDO UN OBJETO   //sirve para archivo y carpetas
//    // en las comillas va el nombre y  la direccion del archivo
//        System.out.println(archivo.exists());
//        System.out.println(archivo.isDirectory());//para saber si es una carpeta o no
//        System.out.println(archivo.isFile());//para saber si es archivo
//        System.out.println(archivo.isHidden());//para ocultar
//        System.out.println(archivo.lastModified());//para saber la ultima fecha de modificacion
//       // archivo.delete();
//    
//    File carpeta=new File("C:\\Users\\its\\Desktop");
//   //carpeta.list devuelve un arreglo (coleccion del mismo tipo) con los archivos de una carpeta
//    String [] arregloarchivos=carpeta.list();
//        for (int i = 0; i < arregloarchivos.length; i++) {
//            System.out.println(arregloarchivos[i]);
//            
//        }
//    }
    public static void main(String[] args) {
        Archivos objeto= new Archivos();
        Scanner entrada=new Scanner(System.in);
        String hola=entrada.nextLine();
        objeto.leerArchivo("D:\\Users\\its\\Desktop/ejemplo.txt");
        objeto.escribirArchivo("C:\\Users\\its\\Desktop/ejemplo.txt",hola);
    }
    public void leerArchivo(String direccion){
        File archivo=new File(direccion);
        try{
        FileReader reader=new FileReader(archivo);//nos convierte el archivo en objeto
        BufferedReader recorrido=new BufferedReader(reader);
        String linea;
        while((linea=recorrido.readLine())!=null){
            System.out.println(linea);
        }
        } catch (Exception e){
            System.out.println(e);
        }
    }
    public void escribirArchivo(String direccion,String texto){
        try {
            FileWriter archivo=new FileWriter(direccion);//escribe en
            PrintWriter escribir = new PrintWriter(archivo);
            escribir.println(texto);
            archivo.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        
    }
    
}
