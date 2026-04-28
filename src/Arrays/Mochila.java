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
public class Mochila {
    public static void main(String[] args) {
        
        String  [] elementos = {"Espejo", "Computadora", "Cargador", "Calculadora", "Termito"};
        JOptionPane.showMessageDialog(null, elementos [1]);
         JOptionPane.showMessageDialog(null, elementos [3]);
         
         JOptionPane.showMessageDialog(null, "Todos los elementos son: ");
         for (int i = 0; i < 5; i++) {
              JOptionPane.showMessageDialog(null, elementos [i]);
            
        }
    }
    
}
