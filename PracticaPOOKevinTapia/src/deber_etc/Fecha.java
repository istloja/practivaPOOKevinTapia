/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deber_etc;

import java.util.Calendar;
import javax.swing.JOptionPane;

/**
 *
 * @author its
 */
public class Fecha {
    public static void main(String[] args) {
        int nacimiento;
        int añoactual;
        int edad;
        
        String nac;
        Calendar c= Calendar.getInstance();
        añoactual=c.get(Calendar.YEAR);
        
        nac=JOptionPane.showInputDialog(null, "en que aÃ±o naciste");
        nacimiento=Integer.parseInt(nac);
    
        
        edad=añoactual-nacimiento;
       
        
        if(edad>18){
            JOptionPane.showMessageDialog(null, "tu edad es "+edad+" aÃ±os");
            
        }else {
            JOptionPane.showMessageDialog(null, "tu edad es "+edad+" aÃ±os");
        }
        
        
    }
}
