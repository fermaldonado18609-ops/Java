/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POO;

/**
 *
 * @author Fer
 */
import javax.swing.JOptionPane;
public class Auto {
    
    
    String marca; 
    String modelo; 
    int velocidad;

    public Auto(String marca, String modelo, int velocidad) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidad = velocidad;
    }
    
    
    void marca (){
        System.out.println("La marca del auto es: "+ marca);}
    void model (){
        System.out.println("El modelo es: " + modelo);}
    
    void acelerar (){
       System.out.println("Velocidad:  "+ velocidad );  
      int op;
       do {
            
              op= JOptionPane.showConfirmDialog(null, "Acelerar?");
         
              if (op== 0){
               velocidad= velocidad+1;
            System.out.println("La velocidad ahora es:  "+velocidad );
        }
        else if (op==1){
            System.out.println("Bien");
                  System.out.println("La velocidad es: "+velocidad);
        }
        else if (op== 2) {
            System.out.println("Programa finalizado");
        }
        else {
               System.out.println("No está esa opción");}
       }while (op!=2);
    }
    
    
    void frenar (){
     System.out.println("Velocidad:  "+ velocidad );  
      int op;
         do {
            
              op= JOptionPane.showConfirmDialog(null, "Acelerar?");
         
              if (op== 0){
               velocidad= velocidad-1;
            System.out.println("La velocidad ahora es:  "+velocidad );
        }
        else if (op==1){
            System.out.println("Bien");
                  System.out.println("La velocidad es: "+velocidad);
        }
        else if (op== 2) {
            System.out.println("Programa finalizado");
        }
        else {
               System.out.println("No está esa opción");}
       }while (op!=2);
         
    }

}
