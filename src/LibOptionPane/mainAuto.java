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

public class mainAuto {

    public static void main(String[] args) {
        String marca = JOptionPane.showInputDialog(null, "Ingrese marca de auto");
        String modelo = JOptionPane.showInputDialog(null, "Ingrese Modelo");
        
        Auto aut1 = new Auto(marca, modelo);
        
        aut1.arrancar();
    }
}
