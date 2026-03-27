/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CondiBucles;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Fer
 */
public class Eje13 {
    public static void main(String[] args) {
        Random rm= new Random ();
        Scanner sc =new Scanner (System.in);
        int random= rm.nextInt(10)+ 1; 
        int num;
        do{
        System.out.println("Adivina número entre el 1 y 10");
         num= sc.nextInt();
         if (num==random){
             System.out.println("¡Adivinaste!");}
        }while (num !=random);
    }
}
