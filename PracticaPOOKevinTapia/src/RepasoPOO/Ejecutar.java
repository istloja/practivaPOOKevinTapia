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
public class Ejecutar {
    public static void main(String[] args) {
        Animal objeto=new Animal("jirafa",12,16,"amarillo",20);
        Aves objeto1 =new Aves(10,false,"pato",3,2,"blanco",1);
        Reptiles objeto3=new Reptiles(true,"ratones","serpiente",2,3,"red and black",1);
        Anfibios objeto4=new Anfibios(true,"tropical","sapo",1,1,"varios colores",2);
        Mamiferos objeto2 =new Mamiferos(1,true,"vaca",5,20.5,"white and black",3);
        System.out.println(objeto.informacionAnimal());
        System.out.println(objeto1.informacionAnimal());
        System.out.println(objeto2.informacionAnimal());
        System.out.println(objeto3.informacionAnimal());
        System.out.println(objeto4.informacionAnimal());
       
    }
}
