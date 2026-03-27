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
public class Eje6 {
    public static void main(String[] args) {
        Scanner  sc = new Scanner (System.in);
        char opera;
        System.out.println("Ingrese un numero");
        int num1= sc.nextInt();
        System.out.println("Ingres otro numero");
        int num2= sc.nextInt();
        System.out.println("Ingrese una operación (+, - , * , /)");
         opera= sc.next().charAt(0);
        
        switch (opera){
            case '+':
                System.out.println("El resultado es:  "+(num1+num2));
                break; 
            case '-':
                System.out.println("El resultado es:  "+(num1-num2));     
                break;
            case '*':
                System.out.println("El resultado es:  "+(num1*num2));
                break;
            case '/':
                System.out.println("El resultado es: "+(num1/num2));
                break;
            default:
                System.out.println("Debe ingresar una operación (+, -, *, /)");
        }
    }
}
