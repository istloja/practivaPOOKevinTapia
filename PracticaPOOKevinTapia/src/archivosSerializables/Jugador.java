/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivosSerializables;

import archivos_serializables.Persona;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author its
 */
public class Jugador implements Serializable {

    private String nombre;

    private String apellido;

    private int edad;

    private int numeroGoles;

    private int añoDebut;

    private Equipo equipo;
    private int PerdidasBalon;
    private int asistencias;
    private double KmRecorrridos;
    private int PasesCompletados;
    private int FalloGol;

    public Jugador() {
    }

    public Jugador(String nombre, String apellido, int edad, int numeroGoles, int añoDebut, Equipo equipo, int PerdidasBalon, int asistencias, double KmRecorrridos, int PasesCompletados, int FalloGol) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.numeroGoles = numeroGoles;
        this.añoDebut = añoDebut;
        this.equipo = equipo;
        this.PerdidasBalon = PerdidasBalon;
        this.asistencias = asistencias;
        this.KmRecorrridos = KmRecorrridos;
        this.PasesCompletados = PasesCompletados;
        this.FalloGol = FalloGol;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getNumeroGoles() {
        return numeroGoles;
    }

    public void setNumeroGoles(int numeroGoles) {
        this.numeroGoles = numeroGoles;
    }

    public int getAñoDebut() {
        return añoDebut;
    }

    public void setAñoDebut(int añoDebut) {
        this.añoDebut = añoDebut;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    public int getPerdidasBalon() {
        return PerdidasBalon;
    }

    public void setPerdidasBalon(int PerdidasBalon) {
        this.PerdidasBalon = PerdidasBalon;
    }

    public int getAsistencias() {
        return asistencias;
    }

    public void setAsistencias(int asistencias) {
        this.asistencias = asistencias;
    }

    public double getKmRecorrridos() {
        return KmRecorrridos;
    }

    public void setKmRecorrridos(double KmRecorrridos) {
        this.KmRecorrridos = KmRecorrridos;
    }

    public int getPasesCompletados() {
        return PasesCompletados;
    }

    public void setPasesCompletados(int PasesCompletados) {
        this.PasesCompletados = PasesCompletados;
    }

    public int getFalloGol() {
        return FalloGol;
    }

    public void setFalloGol(int FalloGol) {
        this.FalloGol = FalloGol;
    }

 

    public void escribirLista(String direccion, List<Jugador> lista) {
        try {
            ObjectOutputStream escr = new ObjectOutputStream(new FileOutputStream(direccion));
            for (Jugador jugador : lista) {
                escr.writeObject(jugador);
            }
            escr.close();
        } catch (Exception e) {
            System.out.println("error" + e);

        }
    }

    public int edadMayor(List<Jugador> lista) {
        int edadmax = lista.get(0).getEdad();
        for (Jugador jugador : lista) {
            if (jugador.getEdad() > edadmax) {

                edadmax = jugador.getEdad();

            } else {
                System.out.println("");
            }

        }

        return edad;

    }

    public Jugador edadmenorObjeto(List<Jugador> lista) {
        Jugador edadmenor = lista.get(0);
        for (Jugador jugador : lista) {
            if (edadmenor.getEdad() > jugador.getEdad()) {
                edadmenor = jugador;
            }
        }
        return edadmenor;
    }

    public Jugador masGoles(List<Jugador> lista) {
        Jugador mayorgoles = lista.get(0);
        for (Jugador jugador : lista) {
            if (jugador.getNumeroGoles() > mayorgoles.getNumeroGoles()) {
                mayorgoles = jugador;
            }
        }
        return mayorgoles;
    }

    public Jugador debutoP(List<Jugador> lista) {
        Jugador debuto = lista.get(0);
        for (Jugador jugador : lista) {
            if (debuto.getAñoDebut() > jugador.getAñoDebut()) {
                debuto = jugador;
            }

        }
        return debuto;
    }

    public Jugador titulos(List<Jugador> lista) {
        Jugador mastitulo = lista.get(0);
        for (Jugador jugador : lista) {
            if (jugador.getEquipo().getNumerotitulos() > mastitulo.getEquipo().getNumerotitulos()) {
                mastitulo = jugador;
            }

        }
        return mastitulo;
    }

    public void leerLista(String direccion) {
        try {
            ObjectInputStream lector = new ObjectInputStream(new FileInputStream(direccion));
            Object auxiliar = lector.readObject();
            Jugador j1 = (Jugador) auxiliar;
            System.out.println("nombre" + j1.nombre + "apellido" + j1.apellido);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public List<Jugador> leerJugadores(String url) {

        List<Jugador> Lista = new ArrayList<>();
        try {
            ObjectInputStream lector = new ObjectInputStream(new FileInputStream(url));
            Object auxiliar = lector.readObject();
            while (auxiliar != null) {
                Jugador j1 = (Jugador) auxiliar;
                Lista.add(j1);
                auxiliar = lector.readObject();
            }
        } catch (Exception e) {
            System.out.println("error" + e);
        }
        return Lista;

    }
public double PorcentajeAcierto(Jugador jugadorpro){
    return (jugadorpro.getNumeroGoles()+jugadorpro.getAsistencias())/ jugadorpro.getFalloGol();
}
public double PorcentajeEfectividad(Jugador jugadorefec){
   return(jugadorefec.getPasesCompletados()/jugadorefec.getPerdidasBalon()); 
}
public double EficienciaJugador(Jugador jugadorefi){
    return (PorcentajeAcierto(jugadorefi)+PorcentajeEfectividad(jugadorefi)+jugadorefi.getKmRecorrridos());
}
public Jugador MayorEficiencia(List<Jugador> lista){
    Jugador mayorefect=lista.get(0);
     for (Jugador jugador : lista) {
         if(EficienciaJugador(jugador)>EficienciaJugador(mayorefect)){
             mayorefect=jugador;
             
         }
        
    }
     return mayorefect;
}
public Jugador MporcentajeAcierto(List<Jugador> lista){
    Jugador mayorporcentaje=lista.get(0);
     for (Jugador jugador : lista) {
         if(PorcentajeAcierto(jugador)>PorcentajeAcierto(mayorporcentaje)){
             mayorporcentaje=jugador;
             
         }
        
    }
     return mayorporcentaje; 
}
public Jugador Mporcentajeefectividad(List<Jugador> lista){
    Jugador Mporcentajeefectividad=lista.get(0);
    for (Jugador jugador : lista) {
        if(PorcentajeEfectividad(jugador)> PorcentajeEfectividad(Mporcentajeefectividad)){
            Mporcentajeefectividad=jugador;
        }
        
    }
    return Mporcentajeefectividad;
}
    public static void main(String[] args) {
        Jugador objeto = new Jugador();
        Jugador j1 = new Jugador("cristiano", "Ronaldo", 33, 520, 2005, new Equipo("juventus", 20, "Turin"),1,2,1.5,11,2);
        Jugador j2 = new Jugador("Lionel", "Messi", 31, 600, 2001, new Equipo("Barcelona", 30, "Barcelona"),3,5,4.5,7,3);
        Jugador j3 = new Jugador("Neymar", "Jr", 28, 200, 2011, new Equipo("PSG", 10, "Paris"),7,4,6.3,4,2);
        Jugador j4 = new Jugador("Eden", "Hazard", 27, 520, 2010, new Equipo("Real Madrid", 40, "Madrid"),10,7,6.3,5,7);

        List<Jugador> Lista = new ArrayList<>();
        Lista.add(j1);
        Lista.add(j2);
        Lista.add(j3);
        Lista.add(j4);
        int a = Lista.size();//guardo en la variable a esta me permite saber el tamaño de lista (.size())
        System.out.println(a);
        objeto.escribirLista("C:\\\\Users\\\\its\\\\Desktop\\\\ejemplo.txt", Lista);
//        objeto.leerLista("C:\\\\Users\\\\its\\\\Desktop\\\\ejemplo.txt");
        List<Jugador> b = objeto.leerJugadores("C:\\\\Users\\\\its\\\\Desktop\\\\ejemplo.txt");
//        for (Jugador jugador : b) {
//            System.out.println(jugador.getEdad());
//        }
        System.out.println("el jugador con menor edad es "+objeto.edadmenorObjeto(b).getNombre());
        System.out.println("el juador que mas pronto debuto es "+" "+objeto.debutoP(b).getNombre()+" y su año de debut"+" "+objeto.debutoP(b).getAñoDebut());
        System.out.println("el equipo con mas titulos es;"+" "+objeto.titulos(b).getEquipo().getNombre()+" con; "+" "+objeto.titulos(b).getEquipo().getNumerotitulos()+" "+"titulos");
        System.out.println("el jugadore mas eficiente es :"+objeto.MayorEficiencia(b).getNombre());
        System.out.println("el jugador con mas porcentaje es:"+objeto.MporcentajeAcierto(b).getNombre());
        System.out.println("el jugador con mas porcentaje de efectividad es: "+objeto.Mporcentajeefectividad(b).getNombre());
    }
}
