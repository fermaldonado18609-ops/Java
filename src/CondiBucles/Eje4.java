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
public class Eje4 {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.println("Ingrese el primer numero");
        int num1= sc.nextInt();
        System.out.println("Ingrese el segundo numero");
        int num2=sc.nextInt();
        System.out.println("ingrese el tercer numero");
        int num3= sc.nextInt();
        if  (num1>num2 && num1>num3){
            System.out.println("El número "+num1+" es el mayor de los tres ");
        }
        else if (num2>num1 && num2>num3){
            System.out.println("El número "+num2+" es el mayor de los tres");
        }
        else if (num3>num2&&num3>num1){
            System.out.println("El número "+num3+" es el mayor de los tres");
        }    
    
    }
}
