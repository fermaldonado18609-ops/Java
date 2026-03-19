/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication4;

import java.util.Scanner;
import javax.print.DocFlavor;

/**
 *
 * @author LABO B 10
 */
public class edad{
        /*Crear un programa para solicitar los valores más importantes de una receta de cocina.
	Los valores que debe introducir el usuario son:
>nombre de la receta
>ingredientes principales
>Tiempo de Preparación (minutos)
>Dificultad (“Facil,Media o Alta”)
*/
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
