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
public class EjercicioBucles4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Ingrese una letra: ");
        String entrada = scanner.nextLine();

        // Verificar si la cadena es una letra mayúscula
        if (entrada.length() == 1 && Character.isUpperCase(entrada.charAt(0))) {
            System.out.println("La letra ingresada es una letra mayúscula.");
        } else {
            System.out.println("La entrada no es una letra mayúscula.");
        }
    }
}
