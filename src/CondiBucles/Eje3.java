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
public class Eje3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Ingrese una nota");
        int nota= sc.nextInt();
        if (nota==10 || nota== 9){
            System.out.println("Excelente");}
        else if (nota==8 || nota==7){
            System.out.println("Aprobado");}
        else if (nota== 6|| nota==5 || nota==4){
            System.out.println("Recupera");  }
        else {
            System.out.println("Desaprobado");}
    }
}
