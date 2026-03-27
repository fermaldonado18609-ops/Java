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
public class Eje2 {
    public static void main(String[] args) {
        Scanner  sc= new Scanner (System.in);
        System.out.println("Ingrese un número");
        int num= sc.nextInt();
        if (num>0){
            System.out.println("El número es positivo");}
        else if (num<0){
        System.out.println("El numero es negativo ");}
        else{
            System.out.println("El numero es neutral (Igual a cero)");}
                
    }
    
}
