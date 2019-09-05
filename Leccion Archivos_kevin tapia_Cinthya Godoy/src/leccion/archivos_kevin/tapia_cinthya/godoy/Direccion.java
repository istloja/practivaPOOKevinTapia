/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leccion.archivos_kevin.tapia_cinthya.godoy;

import java.io.Serializable;

/**
 *
 * @author its
 */
public class Direccion implements Serializable{
    private String Ciudad;
    private String Calle;
    private int Casa;

    public Direccion() {
    }

    public Direccion(String Ciudad, String Calle, int Casa) {
        this.Ciudad = Ciudad;
        this.Calle = Calle;
        this.Casa = Casa;
    }

    public String getCiudad() {
        return Ciudad;
    }

    public void setCiudad(String Ciudad) {
        this.Ciudad = Ciudad;
    }

    public String getCalle() {
        return Calle;
    }

    public void setCalle(String Calle) {
        this.Calle = Calle;
    }

    public int getCasa() {
        return Casa;
    }

    public void setCasa(int Casa) {
        this.Casa = Casa;
    }
    
    
}
