/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clase2;

/**
 *
 * @author LABO B 10
 */
    import java.util.Scanner;
public class Empleado3 {
    public static void main(String[] args){
        Scanner input= new Scanner (System.in);
        int edad; 
        double salario; 
        String nombre; 
        System.out.println("Ingrese su nombre: ");
        nombre= input.nextLine(); 
        System.out.println("Ingrese su edad: ");
        edad= input.nextInt(); 
        System.out.println("Ingrese si salario: ");
        salario= input.nextDouble();
        System.out.println("Nombre: "+nombre);
        System.out.println("Edad: "+edad);
        System.out.println("Salario: "+salario);
    }
    
}
