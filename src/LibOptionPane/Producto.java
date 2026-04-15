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
/*Crear una clase Producto con los atributos nombre y precio.
Usar JOptionPane para pedir al usuario el nombre y precio del producto.
Luego, implementar un método esCaro() que devuelva true si el precio es mayor a 10.000.📢 Mostrar un mensaje que indique si el producto es caro o no.
*/
public class Producto {
    String nombre; 
    double precio; 

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }
    
    void esCaro (){
        if (precio>100.000) {
            boolean Caro= true;
            JOptionPane.showMessageDialog(null, "¿Caro?:  "+Caro) ;
        }
        else {
            boolean Caro= false;
              JOptionPane.showMessageDialog(null, "¿Caro?:  "+Caro) ;
        
        }   
    }
    
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog(null, "Nombre del producto: ");
        double precio= Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el precio: ")); 
        
        Producto pdr = new Producto (name, precio); 
        pdr.esCaro();
    }
}
