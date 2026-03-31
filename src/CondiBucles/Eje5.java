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
public class Eje5 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner  (System.in);
        System.out.println("Ingrese una opción (1, 2 o 3 )");
        int op= sc.nextInt();
        switch (op){
            case 1 :
                System.out.println("Seleccionaste: La opcioón 1: Ver perfil");
                break;
            case 2: 
                System.out.println("Seleccionaste: La opcion 2: Editar Datos");
                break;
            case 3:
                System.out.println("Seleccionaste: La opción 3: Cerrar sesión");
                break;
            default: 
                System.out.println("No exite esa opción");
    }
    }
}
