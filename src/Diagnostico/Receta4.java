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
public class Receta4 {
     public static void main(String[] args) {
        Scanner input= new Scanner (System.in);
        String nombre,   Ingredientes,  time,  Dif;
        System.out.println("Ingrese nombre de la receta: ");
        nombre=input.nextLine();
        System.out.println("Ingrese los Ingredientes Princpales: ");
        Ingredientes= input.nextLine();
        System.out.println("Tiempo de duración: ");
        time= input.nextLine();
        System.out.println("¿Dificultad: Facil, Media o Alta?");
        Dif= input.nextLine();
        System.out.println("Que horrible comer "+nombre);
        //comida
    }
    
}
