/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_bimestre.codifica_herencia;


/**
 *
 * @author its
 */
public class ejecutara_herencia_codi {

    public static void main(String[] args) {
        Empleado E1 = new Empleado("jhonatan");
        Directivo D1 = new Directivo("vicente");
        Operario OP1 = new Operario("vladimir");
        Oficial OF1 = new Oficial("joel");
        Tecnico T1 = new Tecnico("kevin");
        System.out.println(E1);
        System.out.println(D1);
        System.out.println(OP1);
        System.out.println(OF1);
        System.out.println(T1);
    }

}
