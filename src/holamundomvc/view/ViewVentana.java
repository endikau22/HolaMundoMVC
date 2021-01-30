/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundomvc.view;

import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * Esta clase muestra una ventana Swing.
 * @author Endika Ubierna.
 */
public class ViewVentana extends javax.swing.JFrame implements View{
    
    public ViewVentana(){
        this.setLayout(null); 
        this.setBounds(300, 300, 400, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    } 
    /**
     * Añade un jLabel con un String en la ventana.
     * @param greeting String 
     */
    @Override
    public void showGreeting(String greeting) {
       JLabel jLabelSaludoHolaMundo;
       ViewVentana v = new ViewVentana();
       jLabelSaludoHolaMundo = new JLabel();
       jLabelSaludoHolaMundo.setBounds(150, 150, 200, 100);
       jLabelSaludoHolaMundo.setText(greeting);
       add(jLabelSaludoHolaMundo);
       this.setVisible(true);
    }
    
}
 