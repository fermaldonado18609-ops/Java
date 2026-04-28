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
public class Canciones {
    public static void main(String[] args) {
        String  [] album = {"Bien o Mal", "Atrevido", "El último baile", "Turrazo", "SUNO"};
        JOptionPane.showMessageDialog(null, album [0]);
        JOptionPane.showMessageDialog(null, album [4]);
        
       JOptionPane.showMessageDialog(null, "Algunos de mis albumes favoritos son");
        for (int i = 0; i < album.length; i++) {
            JOptionPane.showMessageDialog(null, album [i]);
        }
    }
}
