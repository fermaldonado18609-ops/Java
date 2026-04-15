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

public class Auto {

    String modelo;
    String marca;

    public Auto(String modelo, String marca) {
        this.modelo = modelo;
        this.marca = marca;
    }

    void arrancar() {
        JOptionPane.showMessageDialog(null, "Arranco, siu");
    }

}
  

