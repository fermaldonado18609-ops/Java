/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author Fer
 */
public class Ejemplo {
    public static void main(String[] args) {
        String[] inventario = new String[5];
        
        inventario[0] = "Espada";
        inventario[1] = "Pico";
        inventario[2] = "Pan";
        inventario[3] = "Antorcha";
        inventario[4] = "Pala";

        String [] YO= new String[3];
        YO[0]= "Mara";
        YO [1]= "Fernanda";
        YO [2]= "Maldonado";

        for (int i = 0; i < 3; i++) {
              JOptionPane.showMessageDialog(null, YO [i]);
        }
        
        String [] otraform= {"yo", "fer", "hermosa"}; 
         for (int i = 0; i < 3; i++) {
          
             JOptionPane.showMessageDialog(null, otraform [i]);}
             
          for (int i = 0; i < otraform.length; i++) {
              JOptionPane.showMessageDialog(null, otraform [i]);
        }
        
    }
}
