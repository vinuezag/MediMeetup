/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import java.awt.Graphics;
import java.awt.Image;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author USUARIO
 */
public class FondoPantalla extends JPanel{
    
    private URL url = getClass().getResource("\\Resourse\\nombreSistem.jpg");
    
    Image imagen = new ImageIcon(url).getImage();
    
    @Override
    public void paint(Graphics g){
        g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
        setOpaque(false); 
       super.paint(g); 
       
    }
    
    private void setOPaque(boolean b) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    
}
