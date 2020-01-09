/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leccion.archivos_kevin.tapia_cinthya.godoy;

import java.util.Map;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author its
 */
public class Estudiante implements Serializable {

    private String Nombre;
    private String Apellido;
    private int Edad;
    private double Promedio;
    private Direccion direccion;
    private Curso curso;

    public Estudiante() {
    }

    public Estudiante(String Nombre, String Apellido, int Edad, double Promedio, Direccion direccion, Curso curso) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Edad = Edad;
        this.Promedio = Promedio;
        this.direccion = direccion;
        this.curso = curso;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public double getPromedio() {
        return Promedio;
    }

    public void setPromedio(double Promedio) {
        this.Promedio = Promedio;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public void escribirLista(String direccion, List<Estudiante> lista) {
        try {
            ObjectOutputStream escr = new ObjectOutputStream(new FileOutputStream(direccion));
            for (Estudiante estudiante : lista) {
                escr.writeObject(estudiante);
            }
            escr.close();
        } catch (Exception e) {
            System.out.println("error" + e);

        }
    }

    public Estudiante menoredad(List<Estudiante> lista) {
        Estudiante edadmenor = lista.get(0);
        for (Estudiante estudiante : lista) {
            if (edadmenor.getEdad() > estudiante.getEdad()) {
                edadmenor = estudiante;
            }
        }
        return edadmenor;
    }

    public Estudiante mayorpromedio(List<Estudiante> lista) {
        Estudiante promediomayor = lista.get(0);
        for (Estudiante estudiante : lista) {
            if (promediomayor.getPromedio() < estudiante.getPromedio()) {
                promediomayor = estudiante;
            }
        }
        return promediomayor;
    }

    public Estudiante mayorestudiante(List<Estudiante> lista) {
        Estudiante cantidadestudiante = lista.get(0);
        for (Estudiante estudiante : lista) {
            if (cantidadestudiante.curso.getNestudiante() < estudiante.curso.getNestudiante()) {
                cantidadestudiante = estudiante;
            }
        }
        return cantidadestudiante;
    }

    public Estudiante mayorciclo(List<Estudiante> lista) {
        Estudiante ciclomayor = lista.get(0);
        for (Estudiante estudiante : lista) {
            if (ciclomayor.curso.getNciclo() < estudiante.curso.getNciclo()) {
                ciclomayor = estudiante;
            }
        }
        return ciclomayor;
    }

//    public Estudiante Rciudad(List<Estudiante> lista) {
//        HashMap<String, Integer> mapa = new HashMap<String, Integer>();
//        for (Estudiante lista1 : lista) {
////            System.out.println(lista1.getDireccion().getCiudad());
//            mapa.put(lista1.getDireccion().getCiudad(), mapa.getOrDefault(lista1.getDireccion().getCiudad(), 0) + 1);
//        }
//        for (Map.Entry<String, Integer> entry : mapa.entrySet()) {
//            String key = entry.getKey();
//            int value = entry.getValue();
//            if(value >){
//                
//            }
//        }
//        
//        System.out.println(mapa);
//        return null;
//    }

    public static void main(String[] args) {
        Estudiante objeto = new Estudiante();
        Estudiante e1 = new Estudiante("kevin", "tapia", 20, 9, new Direccion("loja", "av.quito", 1), new Curso("software", "software", 2, 15));
        Estudiante e2 = new Estudiante("dani", "lopez", 19, 8.5, new Direccion("QUITO", "av.pensilvania", 2), new Curso("contabilidad", "contabilidad", 1, 20));
        Estudiante e3 = new Estudiante("jessy", "davila", 17, 7.5, new Direccion("guayaquil", "av.rumiña", 3), new Curso("mecanica", "mecanica", 4, 40));
        Estudiante e4 = new Estudiante("lucas", "duarte", 22, 5.80, new Direccion("el oro", "av.barcelona", 5), new Curso("industrias de alimentos", "industrias", 2, 27));
        Estudiante e5 = new Estudiante("vero", "godoy", 25, 9, new Direccion("cuenca", "calle juan xlll", 7), new Curso("psicologia", "psicologia", 6, 20));
        Estudiante e6 = new Estudiante("vane", "macas", 38, 8.75, new Direccion("machala", "av.eugenio espejo", 9), new Curso("medicina", "medicina", 7, 12));
        Estudiante e7 = new Estudiante("lili", "mendez", 27, 7.6, new Direccion("zamora", "calle nose", 6), new Curso("artes plasticas", "artes", 4, 17));
        Estudiante e8 = new Estudiante("luis", "castillo", 19, 7, new Direccion("tena", "calle vino", 10), new Curso("informatica", "informatica", 5, 30));
        Estudiante e9 = new Estudiante("santy", "campoazul", 21, 9.25, new Direccion("macas", "av.amaluza", 23), new Curso("derecho", "derecho", 1, 25));
        Estudiante e10 = new Estudiante("salome", "cortez", 20, 9.85, new Direccion("loja", "av.caritas", 75), new Curso("lengua y literatura", "lengua", 3, 47));
        List<Estudiante> Lista = new ArrayList<>();
        Lista.add(e1);
        Lista.add(e2);
        Lista.add(e3);
        Lista.add(e4);
        Lista.add(e5);
        Lista.add(e6);
        Lista.add(e7);
        Lista.add(e8);
        Lista.add(e9);
        Lista.add(e10);
        objeto.escribirLista("C:\\\\Users\\\\its\\\\Desktop\\\\Leccion.txt", Lista);
        System.out.println("El estudiante con menor edad es : " + objeto.menoredad(Lista).getNombre());
        System.out.println("El estudiante con mayor promedio es: " + objeto.mayorpromedio(Lista).getNombre());
        System.out.println("El curso con mas estudiantes es: " + objeto.mayorestudiante(Lista).curso.getCarrera());
        System.out.println("La carrera con el ciclo mas alto es : " + objeto.mayorciclo(Lista).curso.getCarrera());
        System.out.println("La ciudad con mas estudiantes es : " + objeto.mayorestudiante(Lista).direccion.getCiudad());
        objeto.Rciudad(Lista);
    }

}
