/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LibOptionPane;

import javax.swing.JOptionPane;

/**
 *
 * @author Fer
 */
public class ConsolaDeDialogo {
   
       public static void main(String[] args) {
           String nombre; 
           
           JOptionPane.showMessageDialog(null, "Hola");
            nombre=  JOptionPane.showInputDialog("Ingresa tu nombre"); 
            
            JOptionPane.showMessageDialog(null, "Hola " +nombre);
 
      }
}
