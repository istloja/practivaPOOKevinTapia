/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;

import java.util.Scanner;

/**
 * Mostrar las diferencias entre los metodos void y los que devuelven datos De
 * tipo Objeto o Tipos Primitivos
 *
 * @author its
 */
public class VoidyDatos {

    // Es un metodo de tipo void que suma dos numeros y presenta el resultado
    public void sumar(int numero1, int numero2) {// RECIBE 2 NUMEROS DE TIPO ENTERO
        System.out.println("la suma es : " + (numero1 + numero2));//presenta el resultado
    }

    //Los metodos que devuelven datos pueden ser de diferentes tipos como
    //int,double,String,char,booleano y tambien pueden ser Objetos
    public int sumar1(int numero1, int numero2) {
        return numero1 + numero2;//devolvemos el valor
    }

    public String unirCadenas(String cadena1, String cadena2) {
        return cadena1 + cadena2;
    }

    public boolean iniciaSesion(String usuario, String password) {
        boolean valor = false;
        if (usuario.equals("admin") && password.equals("1234")) {
            valor = true;
        }
        return valor;
    }

    public static void main(String[] args) {
        VoidyDatos objeto = new VoidyDatos();//Creamos un objeto
        objeto.sumar(10, 8);//llamamos al metodo sumar y enviamos 2 numeros
        objeto.sumar(11, 23);
        objeto.sumar(80, 7);
        int resultado = objeto.sumar1(40, 10);//guardo lo que devuelve el metodo sumar1
        System.out.println("la suma es : " + resultado);
        String cadena = objeto.unirCadenas("hola", " mundo");
        System.out.println("la cadena unida es :" + cadena);
        System.out.println("ingrese usuario");
        Scanner entrada = new Scanner(System.in);
        String usu = entrada.next();
        System.out.println("ingrese contraseña");
        String pas = entrada.next();
        
        boolean v = objeto.iniciaSesion(usu,pas);
        if(v){
            System.out.println("bienvenidos al sistemma");
        }else{
            System.out.println("credenciales incorrectas");
        }
    }
}
