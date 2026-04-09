/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POO;

/**
 *
 * @author Fer
 */
public class mainEstudiante {
    
    public static void main(String[] args) {

        Estudiante e1 = new Estudiante("Yago", 17);
        Estudiante e2 = new Estudiante("Martin", 17);
        
        e1.estudiar();
        e2.rendir();
        e1.comer();
    }

}
