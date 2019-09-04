/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivosSerializables.Practica;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author its
 */
public class Libro implements Serializable {

    private int nLibro;
    private int nPagina;
    private String nombreLibro;
    private int codlibro;
    private int AñoPublicacion;
    private Autor autor;

    public Libro() {
    }

    public Libro(int nLibro, int nPagina, String nombreLibro, int codlibro, int AñoPublicacion, Autor autor) {
        this.nLibro = nLibro;
        this.nPagina = nPagina;
        this.nombreLibro = nombreLibro;
        this.codlibro = codlibro;
        this.AñoPublicacion = AñoPublicacion;
        this.autor = autor;
    }

    public int getnLibro() {
        return nLibro;
    }

    public void setnLibro(int nLibro) {
        this.nLibro = nLibro;
    }

    public int getnPagina() {
        return nPagina;
    }

    public void setnPagina(int nPagina) {
        this.nPagina = nPagina;
    }

    public String getNombreLibro() {
        return nombreLibro;
    }

    public void setNombreLibro(String nombreLibro) {
        this.nombreLibro = nombreLibro;
    }

    public int getCodlibro() {
        return codlibro;
    }

    public void setCodlibro(int codlibro) {
        this.codlibro = codlibro;
    }

    public int getAñoPublicacion() {
        return AñoPublicacion;
    }

    public void setAñoPublicacion(int AñoPublicacion) {
        this.AñoPublicacion = AñoPublicacion;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }
public Libro Masantiguo(List<Libro> lista) {
        Libro antiguo = lista.get(0);
        for (Libro libro : lista) {
            if (antiguo.getAñoPublicacion() > libro.getAñoPublicacion()) {
                antiguo = libro;
            }
        }
        return antiguo;
    }
 public Libro Actualizado(List<Libro> lista) {
        Libro actual = lista.get(0);
        for (Libro libro : lista) {
            if (actual.getAñoPublicacion()>2013) {
                actual = libro;
                System.out.println("actualizado"+libro.getNombreLibro());
            }
        }
        return actual;
    }
 public Libro Desactualizado(List<Libro> lista){
         Libro dactual = lista.get(0);
        for (Libro libro : lista){ 
         
         if(dactual.getAñoPublicacion()<2013){
            dactual=libro;
            System.out.println("desactualizado"+libro.getNombreLibro());
        }
}
return dactual;
}
    public void escribirLista(String direccion, List<Libro> lista) {
        try {
            ObjectOutputStream escr = new ObjectOutputStream(new FileOutputStream(direccion));
            for (Libro libro : lista) {
                escr.writeObject(libro);
            }
            escr.close();
        } catch (Exception e) {
            System.out.println("error" + e);

        }
    }

    public static void main(String[] args) {
        Libro objeto = new Libro();
        Libro l1 = new Libro(1, 1, "aventuras", 005, 2019, new Autor("sherlock", "holmes", 4, 5, 2));
        Libro l2 = new Libro(2, 4, "la noche", 004, 2018, new Autor("vicent", "putin", 4, 5, 2));
        Libro l3 = new Libro(3, 5, "pokemon", 007, 1960, new Autor("joel", "luzuriaga", 4, 5, 2));
        Libro l4 = new Libro(4, 6, "el musocal", 006, 2015, new Autor("vladimir", "samaniego", 4, 5, 2));
        Libro l5 = new Libro(5, 9, "el terror", 003, 1980, new Autor("kevin", "Smith", 4, 5, 2));
        List<Libro> Lista = new ArrayList<>();
        Lista.add(l1);
        Lista.add(l2);
        Lista.add(l3);
        Lista.add(l4);
        Lista.add(l5);

        objeto.escribirLista("C:\\\\Users\\\\its\\\\Desktop\\\\Biblioteca.txt", Lista);
        System.out.println("el libro mas antiguo es: "+objeto.Masantiguo(Lista).getNombreLibro());
        System.out.println("libros actualizados: "+objeto.Actualizado(Lista));
        System.out.println("desactual: "+objeto.Desactualizado(Lista));
    }
}
//un metodo que me diga si el llibor esta actualizado o no string
//si el libro fue publicado(año de publicacion)