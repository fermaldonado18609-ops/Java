/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Diagnostico;

import java.util.Scanner;

/**
 *
 * @author Fer
 */
public class Heladeria {
    public static void main(String[] args) {
        Scanner input= new Scanner (System.in); 
        String sabor;
        System.out.println("¿Qué sabor de helado desea pedir?");
        sabor=input.nextLine(); 
              if  (sabor.equalsIgnoreCase("Chocolate") || sabor.equalsIgnoreCase("Vainilla")|| sabor.equalsIgnoreCase("Frutilla")|| sabor.equalsIgnoreCase("Dulce de Leche")){
                  System.out.println("Si hay "+sabor);
              }
              else{
                  System.out.println("No hay "+sabor);}
    }
    
}
