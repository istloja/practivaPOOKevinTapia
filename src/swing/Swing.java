/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swing;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
/**
 *
 * @author its
 */
public class Swing extends JFrame{
//public Swing(){
//super("mi primer ventana");
//setLocation(200,200);
//    setSize(400,400);
//     setResizable(false);
//    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//    setVisible(true);
//    
//
    JFrame v=new JFrame();
    JPanel p=new JPanel();
    JButton b= new JButton("ACEPTAR");
    JLabel l=new JLabel("insertar cuenta a hackear");
    JTextField t=new JTextField(20);
    JTextField t2=new JTextField(10);
    public Swing(){
     v.setTitle("MI PRIMER VENTANA");
     v.setLocation(200, 200);
     v.setSize(400, 400);
//     v.setResizable(false);
     agregarComponentes();
     v.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     v.setVisible(true);
  
    }
    public void agregarComponentes(){
    v.getContentPane().add(p);
    p.setBorder(BorderFactory.createLineBorder(Color.blue));
    p.setBackground(Color.darkGray);
    l.setForeground(Color.GREEN);
    b.setForeground(Color.red);
    t2.setEditable(false);
    b.addActionListener(new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent e) {
           String texto =t.getText();
           if(!texto.isEmpty()){
              t.setText("");
           t2.setText(texto);   
           }else{
               JOptionPane.showMessageDialog(null, "Escribe en la barra");
           }
         
        }
    });
    p.add(l);
    p.add(t);
    p.add(b);
    p.add(t2);
}
}
