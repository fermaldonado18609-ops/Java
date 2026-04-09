/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POO;

/**
 *
 * @author Fer
 */
public class Profe {
    String nombre;
    String materia;
    int edad; 
    int añoDeNacimiento;

    public Profe(String nombre, String materia, int edad, int añoDeNacimiento) {
        this.nombre = nombre;
        this.materia = materia;
        this.edad = edad;
        this.añoDeNacimiento = añoDeNacimiento;
    }

  
    
    void enseñar (){
        System.out.println(nombre+" enseña  "+materia);}
    
    void anios (){
        System.out.println(nombre+" tiene "+edad);}
    
    void nacer (){
        System.out.println(nombre+ " nacio en "+añoDeNacimiento);}
}
