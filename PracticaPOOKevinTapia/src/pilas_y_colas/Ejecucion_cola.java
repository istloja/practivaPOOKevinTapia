/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilas_y_colas;
import java.util.LinkedList;
/**
 *
 * @author its
 */
public class Ejecucion_cola {
    public static void main(String[] args) {
    LinkedList cola = new LinkedList();//linkedlist :lista doblemente enlazada (si un elemento se va otro ocupa su lugar)
        for (int i = 0; i < 15; i++) {
            cola.offer(i);//offer insertar
            while(cola.peek()!=null)//peek sirve para consultar
            {
                System.out.println(cola.poll());//poll sirve .para extraer
            }
            
        }
    }
}
