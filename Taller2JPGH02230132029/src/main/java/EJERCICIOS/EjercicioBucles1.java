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
public class EjercicioBucles1 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      
        System.out.print("Ingrese el primer número: ");
        double numero1 = scanner.nextDouble();

        
        System.out.print("Ingrese el segundo número: ");
        double numero2 = scanner.nextDouble();

       
        if (numero1 > numero2) {
            System.out.println("El primer número es mayor.");
        } else if (numero2 > numero1) {
            System.out.println("El segundo número es mayor.");
        } else {
            System.out.println("Los dos números son iguales.");
        }
    }
    
}
