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
public class EjercicioBucles8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Ingrese el tamaño del primer lado: ");
        double lado1 = scanner.nextDouble();

        System.out.print("Ingrese el tamaño del segundo lado: ");
        double lado2 = scanner.nextDouble();

        System.out.print("Ingrese el tamaño del tercer lado: ");
        double lado3 = scanner.nextDouble();

        // Verificar si los lados forman un triángulo
        boolean esTriangulo = (lado1 + lado2 > lado3) && (lado2 + lado3 > lado1) && (lado1 + lado3 > lado2);

        if (esTriangulo) {
            // Verificar si el triángulo es rectángulo
            double[] ladosOrdenados = { lado1, lado2, lado3 };
            java.util.Arrays.sort(ladosOrdenados);
            boolean esRectangulo = Math.pow(ladosOrdenados[0], 2) + Math.pow(ladosOrdenados[1], 2) == Math.pow(ladosOrdenados[2], 2);

            // Clasificar el triángulo
            if (esRectangulo) {
                System.out.println("El triángulo es rectángulo.");
            } else if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("El triángulo es equilátero.");
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                System.out.println("El triángulo es isósceles.");
            } else {
                System.out.println("El triángulo es escaleno.");
            }
        } else {
            System.out.println("No es un triángulo válido.");
        }
    }
}
