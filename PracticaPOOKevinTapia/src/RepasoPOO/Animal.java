/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RepasoPOO;

/**
 *
 * @author its
 */
public class Animal {
    private String nombre;
    private int Edad;
    private double peso;
    private String color;
    private double altura;

    public Animal() {//constructor sirve para inicializar varios objetos
    }

    public Animal(String nombre, int Edad, double peso, String color, double altura) {//constructor
        this.nombre = nombre;
        this.Edad = Edad;
        this.peso = peso;
        this.color = color;
        this.altura = altura;
        //geter and setter
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    //fin geter And setter
   public void nombreAnimal(){//metodo de tipo void crea mensaje nombre
       System.out.println("hola soy un animal");
       
   }
  public String informacionAnimal(){//se declara un metodo de tipo String devuelve nombre+ el color+peso+edad+altura
     String informacion=nombre+" "+color+" "+altura+" "+peso+" "+Edad;
        return informacion;
  
  }
    public static void main(String[] args) {
        Animal objeto=new Animal(); 
        objeto.setNombre("perro");//set para agregar nombre o num auna variable 
        objeto.setEdad(10);
        objeto.setAltura(15);
        objeto.setPeso(22);
        objeto.setColor("negro");
        System.out.println(objeto.informacionAnimal());//imprimimos  al metodo informacionAnimal
       // constructor sirve para inicializar varios objetos
        Animal objeto1=new Animal("gato",5,8,"gris",10);
        System.out.println(objeto1.informacionAnimal());
    }
    
}
