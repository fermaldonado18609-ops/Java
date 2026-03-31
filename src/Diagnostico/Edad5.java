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
public class Edad5 {
      public static void main(String[] args) {
        Scanner input= new Scanner (System.in);
        int edad;
        System.out.println("Ingrese su edad: ");
        edad= input.nextInt();
        if (edad>=16){
            System.out.println("Tienes permitido conducir");}
            else {
            System.out.println("No tines permitido conducir");}
    }
}
