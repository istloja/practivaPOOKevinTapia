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
public class Anfibios extends Animal{
    private boolean nadar;
    private String ambiente;

    public Anfibios(boolean nadar, String ambiente, String nombre, int Edad, double peso, String color, double altura) {
        super(nombre, Edad, peso, color, altura);
        this.nadar = nadar;
        this.ambiente = ambiente;
    }

    public Anfibios() {
    }

    public boolean isNadar() {
        return nadar;
    }

    public void setNadar(boolean nadar) {
        this.nadar = nadar;
    }

    public String getAmbiente() {
        return ambiente;
    }

    public void setAmbiente(String ambiente) {
        this.ambiente = ambiente;
    }
    
    
}
