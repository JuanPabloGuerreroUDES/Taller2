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
public class EjercicioBucles7 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Ingrese los datos de la primera circunferencia:");
        double x1 = obtenerCoordenada("x");
        double y1 = obtenerCoordenada("y");
        double r1 = obtenerRadio();

        System.out.println("\nIngrese los datos de la segunda circunferencia:");
        double x2 = obtenerCoordenada("x");
        double y2 = obtenerCoordenada("y");
        double r2 = obtenerRadio();

       
        double distanciaCentros = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        // Clasificar las circunferencias
        if (distanciaCentros > r1 + r2) {
            System.out.println("Las circunferencias son exteriores.");
        } else if (distanciaCentros == r1 + r2) {
            System.out.println("Las circunferencias son tangentes exteriores.");
        } else if (distanciaCentros < Math.abs(r1 - r2)) {
            System.out.println("Las circunferencias son interiores.");
        } else if (distanciaCentros == Math.abs(r1 - r2)) {
            System.out.println("Las circunferencias son tangentes interiores.");
        } else {
            System.out.println("Las circunferencias son secantes.");
        }
    }

    // Función para obtener una coordenada (x o y)
    private static double obtenerCoordenada(String tipo) {
        System.out.print("Ingrese la coordenada " + tipo + ": ");
        return new Scanner(System.in).nextDouble();
    }

    // Función para obtener el radio de una circunferencia
    private static double obtenerRadio() {
        System.out.print("Ingrese el radio: ");
        return new Scanner(System.in).nextDouble();
    }
}
