/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivos_serializables;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import javax.imageio.stream.FileImageOutputStream;
import java.io.ObjectInputStream;
import java.io.FileInputStream;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author its
 */
public class LeeryEscribir {
    
    public void escribirObjeto(String direccion, Persona p1) {
        try {
            ObjectOutputStream escritorio = new ObjectOutputStream(new FileOutputStream(direccion));
            escritorio.writeObject(p1);
            escritorio.close();
        } catch (Exception e) {
            System.out.println("se produjo un error en " + e);
        }
    }
    
    public void leerArchivo(String direccion) {
        try {
            ObjectInputStream lector = new ObjectInputStream(new FileInputStream(direccion));
            Object auxiliar = lector.readObject();
            Persona p1 = (Persona) auxiliar;
            System.out.println("Dueño: " + p1.getNombre() + " " + "Nombre de la mascota: " + " " + p1.getMascota().getNombre() + " " + "Su edad es: " + p1.getMascota().getEdad());
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public void leerLista(String url){//lee toda la lista
        try {
             ObjectInputStream lector =new ObjectInputStream(new FileInputStream(url));
             Object auxiliar =lector.readObject();
              while(auxiliar!=null){
               Persona p1 =(Persona)auxiliar;
                  System.out.println("Dueño: " + p1.getNombre() + " " + "Nombre de la mascota: " + " " + p1.getMascota().getNombre() + " " + "Su edad es: " + p1.getMascota().getEdad());
              auxiliar=lector.readObject();
              }
        } catch (Exception e) {
            System.out.println("error"+e);
        }
 
    }
    public List<Persona> leerPersonas(String url){
   
        List<Persona> Lista = new ArrayList<>();
             try {
             ObjectInputStream lector =new ObjectInputStream(new FileInputStream(url));
             Object auxiliar =lector.readObject();
              while(auxiliar!=null){
               Persona p1 =(Persona)auxiliar;
                Lista.add(p1);
              auxiliar=lector.readObject();
              }
        } catch (Exception e) {
            System.out.println("error"+e);
        }
        return Lista ;  
             
       }
    public void escribirLista(String direccion, List<Persona> lista) {
        try {
            ObjectOutputStream escritorio = new ObjectOutputStream(new FileOutputStream(direccion));
            for (Persona persona : lista) {
                escritorio.writeObject(persona);
            }
            escritorio.close();
        } catch (Exception e) {
            System.out.println("error" + e);
            
        }
    }
    
    public static void main(String[] args) {
        LeeryEscribir objeto = new LeeryEscribir();
        Persona p2 = new Persona("vicente", "luzuriaga", 982369, 20, new Mascota("viche", 3, 4));
        Persona p3 = new Persona("jhoan", "oth", 934, 19, new Mascota("miau", 3, 4));
        Persona p4 = new Persona("luzi", "kawats", 98234, 34, new Mascota("rebeca", 3, 4));
        Persona p5 = new Persona("kevin", "tapia", 982369, 17, new Mascota("akamaru", 3, 4));
        Persona p6 = new Persona("jhoel", "kawai", 982369, 55, new Mascota("vicha1", 3, 4));
        List<Persona> Lista = new ArrayList<>();//creamos la lista para guarar objetos
        //una vez que creasmos la lista ponemos los objetos dentro de ella
        
        Lista.add(p2);
        Lista.add(p4);
        Lista.add(p3);
        Lista.add(p5);
        Lista.add(p6);
        int a = Lista.size();//guardo en la variable a esta me permite saber el tamaño de lista (.size())
        System.out.println(a);//obtengo el tamaño de la lista
//        for (Persona perso : Lista) {
//            System.out.println(perso.getNombre()); 
//        }
        
         //objeto.escribirLista("C:\\\\Users\\\\its\\\\Desktop\\\\ejemplo.txt", Lista);
        // objeto.escribirObjeto("C:\\Users\\its\\Desktop\\ejemplo.txt", p2);
        //objeto.leerArchivo("C:\\\\Users\\\\its\\\\Desktop\\\\ejemplo.txt");
        //objeto.leerLista("C:\\\\Users\\\\its\\\\Desktop\\\\ejemplo.txt");
        List<Persona> b=objeto.leerPersonas("C:\\\\Users\\\\its\\\\Desktop\\\\ejemplo.txt");
        for (Persona persona : b) {
            System.out.println(persona.getEdad());
        }
    }
}
