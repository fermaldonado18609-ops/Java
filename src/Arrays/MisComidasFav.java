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
public class MisComidasFav {
    public static void main(String[] args) {
        String []comidasFavoritas= {"Pasta", "Milanesa", "Locro", "Tartas", "Empanadas de pollo"};
        
        JOptionPane.showMessageDialog(null, comidasFavoritas [1]);
        
        JOptionPane.showMessageDialog(null, "Y todas mis comidas favoritas son: ");
        for (int i = 0; i < comidasFavoritas.length; i++) {
            JOptionPane.showMessageDialog(null, comidasFavoritas[i]);
        }
    }
}
