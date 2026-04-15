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
public class Alumno {
        String name;
        int nota;

    public Alumno(String name, int nota) {
        this.name = name;
        this.nota = nota;
    }

  
   
    void aprobo (){
        if  (nota<5){
            JOptionPane.showMessageDialog(null, name+" no aprobó");
        }
        
        else {
            JOptionPane.showMessageDialog(null, name+ " aprobó");
        }
     }    

    
    
    public static void main(String[] args) {
            String name= JOptionPane.showInputDialog(null, "Ingrese su nombre");
            int nota= Integer.parseInt ( JOptionPane.showInputDialog(null, "Ingrese nota"));
          
          Alumno alu= new Alumno (name,  nota);
          alu.aprobo();
    }

}       
      

