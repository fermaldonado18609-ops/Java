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
public class Eje9 {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        int num;
        do {
            System.out.println("Ingrese un número");
            num= sc.nextInt();
            if (num>=9) {
                System.out.println("Fin");}
        }while (num < 9);
    }
    
}
