/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJERCICIOS;

/**
 *
 * @author Armando Bautista
 */
import java.util.Scanner;
public class EjercicioBucles6 {
  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Ingrese la nota: ");
        int nota = scanner.nextInt();

        System.out.print("Ingrese la edad: ");
        int edad = scanner.nextInt();

        System.out.print("Ingrese el sexo (M/F): ");
        char sexo = scanner.next().charAt(0);

        
        if (nota >= 5 && edad >= 18) {
            if (sexo == 'M') {
                System.out.println("Solicitud POSIBLE.");
            } else if (sexo == 'F') {
                System.out.println("Solicitud ACEPTADA.");
            } else {
                System.out.println("Solicitud NO ACEPTADA.");
            }
        } else {
            System.out.println("Solicitud NO ACEPTADA.");
        }
    }   
}
