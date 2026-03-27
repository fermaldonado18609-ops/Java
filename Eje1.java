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
public class Eje1 {
    public static void main(String[] args) {
        Scanner  input=  new Scanner (System.in);
        int edad;
        System.out.println("Ingrese su edad");
        edad= input.nextInt();
        if  (edad>=18){
                System.out.println("Acceso Permitido");
        }
        else{
            System.out.println("Acceso Denegado");
        }
    }
    
}
