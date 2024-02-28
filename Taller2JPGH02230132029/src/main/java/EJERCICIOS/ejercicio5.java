
package EJERCICIOS;

import java.util.Scanner;

public class ejercicio5 {
    
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar al usuario que ingrese la base y el exponente
        System.out.print("Ingrese la base: ");
        double base = scanner.nextDouble();
        
        System.out.print("Ingrese el exponente: ");
        int exponente = scanner.nextInt();
        
        // Calcular la potencia
        double resultado = 1;
        
        if (exponente > 0) {
            for (int i = 0; i < exponente; i++) {
                resultado *= base;
            }
        } else if (exponente == 0) {
            resultado = 1;
        } else {
            for (int i = 0; i < -exponente; i++) {
                resultado *= base;
            }
            resultado = 1 / resultado;
        }
        
        // Mostrar el resultado
        System.out.println("El resultado es: " + resultado);
     }
     
    
}
