/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CondiBucles;

import java.util.Scanner;

/**
 *
 * @author Fer
 */
public class Eje8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int Contra= 1809;
          int contra;
      
          do{
            System.out.println("Ingrese la contraseña correcta (numeros): ");
            contra= sc.nextInt();
            if (contra==Contra){
                System.out.println("Bienvenido");}
            }while (contra != Contra);
         
    }
    
}
