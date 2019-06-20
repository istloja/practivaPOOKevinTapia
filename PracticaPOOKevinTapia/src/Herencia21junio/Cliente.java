/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herencia21junio;

/**
 *
 * @author its
 */
public class Cliente extends Persona{//heredamos atributos y datos de la clase principal Persona
   private String pedir;
   private String reservar;
public void pedir(){
    System.out.println("el pedido se realizo");
}
    public String getPedir() {
        return pedir;
    }

    public void setPedir(String pedir) {
        this.pedir = pedir;
    }

    public String getReservar() {
        return reservar;
    }

    public void setReservar(String reservar) {
        this.reservar = reservar;
    }
   @Override//significa que estoy sobreescribiendp
    public void saludar(){
        System.out.println("hola soy un cliente llamado viche");
    }
    public void test(){
    saludar();
    super.saludar();//llama al metodo de la clase padre
    }
    public static void main(String[] args) {
        Cliente objeto=new Cliente();//creo un nuevo objeto
        //llamo al objeto saludar de la clase principal Persona
        objeto.saludar();//imprime objeto 
        objeto.pedir();
        objeto.test();

    }
}
