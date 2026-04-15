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

/*Crear una clase Persona con los atributos nombre y edad.
Usar JOptionPane para pedir los datos.
Crear un método esMayorDeEdad() que devuelva true si la edad es mayor o  igual a 18.
Mostrar si la persona es mayor de edad o menor.
*/

public class Edad {
    String nombre; 
    int edad; 

    public Edad(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    void esMayorDeEdad (){
        if (edad>=18){
            boolean mayor= true ;
            JOptionPane.showMessageDialog(null, nombre+" tienes "+edad +" ¿Eres mayor de edad? "+mayor); 
        
        }
        else {
                 boolean mayor= false;
                 JOptionPane.showMessageDialog(null, nombre+ "tienes "+edad +" ¿Eres mayor de edad? "+mayor); 
        }
    }
    
    public static void main(String[] args) {
        String name= JOptionPane.showInputDialog(null, "Ingresa tu nombre");
        int edad= Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa tu edad"));
        
        Edad ed= new Edad (name, edad);
        ed.esMayorDeEdad();
    }
}
