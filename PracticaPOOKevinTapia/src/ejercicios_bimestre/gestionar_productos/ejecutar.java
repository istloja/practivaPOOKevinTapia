/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_bimestre.gestionar_productos;

/**
 *
 * @author its
 */
public class ejecutar {
     public  static void main (String[] args){
        
       Producto ListaProductos[]=new Producto[3];
       
       ListaProductos[0]=new Producto("producto1", 15);
       ListaProductos[1]=new Perecedero(1, "producto2",10);
       ListaProductos[2]=new Noperecedero("tipo 1", "producto 3", 1);
       
     
       
       double suma=0;
       for(int i=0;i<ListaProductos.length;i++){
           suma=suma+ListaProductos[i].Calcular(5);
       }
        System.out.println("El precio total de productos es: "+suma);
      
      
    }
}
