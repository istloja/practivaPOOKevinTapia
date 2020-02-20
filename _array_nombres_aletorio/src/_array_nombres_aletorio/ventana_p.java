/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _array_nombres_aletorio;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.ThreadLocalRandom;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;

import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author kevin
 */
public class ventana_p extends JFrame {

    JLabel l = new JLabel("nombres aletorios");
    JButton button = new JButton("Aletorio");
    JPanel p = new JPanel();
    JPanel p1 = new JPanel();
    JTextField nombre = new JTextField("dar click en Aletorio para sacar un nombre aletoriamente");

    public ventana_p() {
        super("nombres aletorios");
        setSize(600, 200);
        setLocation(300, 300);
        setVisible(true);

        agregarComponentes();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void agregarComponentes() {
        getContentPane().add(p);
        p.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.gridx = 0;
        c.gridy = 0;
        c.insets = new Insets(4, 4, 4, 4);

        p.add(nombre,c);
        c.gridy = 1;

        p.add(button, c);
        c.gridy = 2;
        
        p.add(p1, c);
        p1.setLayout(new GridBagLayout());

        GridBagConstraints b = new GridBagConstraints();
        b.gridx = 0;
        b.gridy = 0;
        b.insets = new Insets(5, 5, 5, 5);
        
        
       String nombres[] = {"Pedro", "Angel", "Manuel", "Vicente","jhon","frank"};
        JList lista = new JList(nombres);
         p1.add(lista, b);
        b.gridx = 2;
        b.gridy = 0;
        p.add(p1, b);
        p1.setLayout(new GridBagLayout());
        p1.setBackground(Color.BLACK);
  
       button.addActionListener(new ActionListener() {
            @Override

            public void actionPerformed(ActionEvent e) {
                int selectlist = list(lista.getSelectedIndex());

            }
             private int list(int selectlist) {
               int a = ThreadLocalRandom.current().nextInt(0, 6);

             lista.resetKeyboardActions();
             nombre.setText(nombres[a]);




                 return a;
             }
         });
  
    }
    public static void main(String[] args) {
        ventana_p o =new ventana_p();
    }
}
