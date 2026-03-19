/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication4;

import java.util.Scanner;

/**
 *
 * @author LABO B 10
 */
public class Receta {
        /*Crear un programa para solicitar los valores más importantes de una receta de cocina.
	Los valores que debe introducir el usuario son:
>nombre de la receta
>ingredientes principales
>Tiempo de Preparación (minutos)
>Dificultad (“Facil,Media o Alta”)
*/
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
