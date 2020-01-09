/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_bimestre.gestion_empleados;

/**
 *
 * @author its
 */
public class ejecutar {

    public static void main(String[] args) {

        Comercial c1 = new Comercial(3000000, "jhona ", 20 , 1000);
        Repartidor R1 = new Repartidor(7, "pedro ", 22 , 350);
        Repartidor R2 = new Repartidor(6, "vicente ", 25 , 350);

        c1.Plus();
        R1.Plus();
        R2.Plus();
        c1.mostrarDatos();
        R1.mostrarDatos();
        R2.mostrarDatos();
        System.out.println(c1.getSalario());
    }

}


