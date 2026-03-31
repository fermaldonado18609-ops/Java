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
public class Eje11 {
    public static void main(String[] args) {
        Scanner  sc = new Scanner (System.in);
        System.out.println("Ingrese un número: ");
        int num= sc.nextInt();
        System.out.println("La tabla es: ");
        for (int i= 0; i<11; i++){
            System.out.println(num+ "*"+i+"="+(i*num));
        }
        
    }
    
}
