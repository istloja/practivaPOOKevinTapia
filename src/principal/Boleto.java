/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

/**
 *
 * @author ISTLOJA_02
 */
public class Boleto {

    private double precio;
    private final double m = 0.15;
    private final double f = 0.30;
    private final double e = 0.10;

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double descuento(String desc) {
        double N=0;
        if (desc=="Menor de Edad") {
            N=precio*m;
            
        }else if (desc=="Fumador"){
            N=precio*f;
            
        }else if (desc=="Estudiante"){
            N=precio*e;
            
        }
        
        return N;

    }

}
