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
public class EjercicioBucles5 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Ingrese el número base: ");
        double base = scanner.nextDouble();

       
        System.out.print("Ingrese el exponente: ");
        int exponente = scanner.nextInt();

      
        double resultado;

        if (exponente > 0) {
            resultado = calcularPotenciaPositiva(base, exponente);
            System.out.println("El resultado de " + base + "^" + exponente + " es: " + resultado);
        } else if (exponente == 0) {
            resultado = 1;
            System.out.println("El resultado de " + base + "^" + exponente + " es: " + resultado);
        } else {
            resultado = calcularPotenciaNegativa(base, -exponente);
            System.out.println("El resultado de " + base + "^" + exponente + " es: 1/" + resultado);
        }
    }

    // Función para calcular la potencia con exponente positivo
    private static double calcularPotenciaPositiva(double base, int exponente) {
        return Math.pow(base, exponente);
    }

    // Función para calcular la potencia con exponente negativo
    private static double calcularPotenciaNegativa(double base, int exponente) {
        return 1 / Math.pow(base, exponente);
    }
}
