/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JFrame;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;


/**
 *
 * @author its
 */
public class Formulario_Face {

  public static void main( String args[] ) {
        IHM ihm = new IHM();
        }
    }

class IHM {
     
    public IHM() {
        
       
        Frame miFrame = new Frame( "Facebook" );
        GridBagLayout gridbag = new GridBagLayout();
        GridBagConstraints gbc = new GridBagConstraints();
    
 
        miFrame.setLayout( gridbag );

        // Para este grupo fijamos la anchura y vamos variando alguna
        // de las caracteristicas en los siguientes, de tal forma que
        // los botones que aparecen en cada una de las lineas tengan
        // apariencia diferente en pantalla 
       
        JLabel correo = new JLabel( "Correo electronico o telefono" );
        gridbag.setConstraints( correo,gbc );
        miFrame.add( correo);
       
    
        JTextField textc = new JTextField( 20 );
        gridbag.setConstraints( textc,gbc );
        miFrame.add( textc );
        JLabel contraseña = new JLabel( "Contraseña" );
        gridbag.setConstraints( contraseña,gbc );
        miFrame.add( contraseña );

        gbc.gridwidth = GridBagConstraints.REMAINDER;
        JTextField text2 = new JTextField( 0 );
        gridbag.setConstraints( text2,gbc );
        miFrame.add( text2 );
           
        gbc.fill = GridBagConstraints.BOTH;
        gbc.weightx = 1.0;
        Button entrar= new Button( "Entrar" );
        gridbag.setConstraints( entrar,gbc );
        miFrame.add( entrar );
        gbc.fill = GridBagConstraints.BOTH;
        gbc.weightx=1.0;
        
    
        gbc.weightx = 0.0;
        Button boton1 = new Button( "Has olvidado datos de la cuenta" );
        gridbag.setConstraints( boton1,gbc );
        miFrame.add( boton1 );

        gbc.gridwidth = GridBagConstraints.RELATIVE;
        JLabel boton5 = new JLabel( "Registrate" );
        gridbag.setConstraints( boton5,gbc );
        miFrame.add( boton5 );

        gbc.gridwidth = GridBagConstraints.REMAINDER;
        Button boton6 = new Button( "Botón 6" );
        gridbag.setConstraints( boton6,gbc );
        miFrame.add( boton6 );

        gbc.gridwidth = 1;
        gbc.gridheight = 2;
        gbc.weighty = 1.0;
        Button boton7 = new Button( "Botón 7" );
        gridbag.setConstraints( boton7,gbc );
        miFrame.add( boton7 );

        gbc.weighty = 0.0;
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        gbc.gridheight = 1;
        Button boton8 = new Button( "Botón 8" );
        gridbag.setConstraints( boton8,gbc );
        miFrame.add( boton8 );
        Button boton9 = new Button( "Botón 9" );
        gridbag.setConstraints( boton9,gbc );
        miFrame.add( boton9 );
        miFrame.setSize( 250,150 );
        miFrame.setVisible( true );
      
        
        
        }
     
    
    }

