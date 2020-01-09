/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;

/**
 *
 * @author its
 */
public class EstaticosyDinamicos {
    public static void main(String[] args) {
      saludar(); //Para llamar un metodo estatico
      //Si quiero llamare a despedir debo crear un objeto
EstaticosyDinamicos objeto=new EstaticosyDinamicos();//creo un objeto
objeto.despedir();// Asi se llama a un metodo no estatico
    }
    public static void saludar(){// Este es un metodo estatico
        System.out.println("hola");
    }

    public void despedir(){//Este es un metodo No estatico
        System.out.println("chao");
    }
}
