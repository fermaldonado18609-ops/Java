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
public class Eje10 {
    public static void main(String[] args) {
        Scanner sc =new Scanner (System.in);
        int op;
        do{
            System.out.println(" ");
            System.out.println("Menú: ");
            System.out.println("1_ Saludar");
            System.out.println("2_Mostrar Fecha");
            System.out.println("3_ Salir");
            op= sc.nextInt();
        
            switch (op) {
                case 1: 
                    System.out.println(" ");
                    System.out.println("Hola!");
                    break;
                case 2:
                    System.out.println(" ");
                    System.out.println(" La fecha es: 26/03");
                    break;
                case 3: 
                    System.out.println(" ");
                    System.out.println("Fin");
                      break;
                default: 
                    System.out.println("Tiene que elegir una opcion entre: 1, 2 o 3");
            }
        }while (op== 2|| op==1);
    }
    
}
