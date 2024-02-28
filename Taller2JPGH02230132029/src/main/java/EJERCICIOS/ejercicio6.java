
package EJERCICIOS;

import java.util.Scanner;

public class ejercicio6 {
    
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar al usuario que ingrese la edad, la nota y el sexo
        System.out.print("Ingrese la edad: ");
        int edad = scanner.nextInt();
        
        System.out.print("Ingrese la nota: ");
        double nota = scanner.nextDouble();
        
        System.out.print("Ingrese el sexo (M/F): ");
        char sexo = scanner.next().charAt(0);
        
        // Verificar la aceptación de la solicitud
        if (nota >= 5 && edad >= 18) {
            if (sexo == 'M') {
                System.out.println("POSIBLE");
            } else if (sexo == 'F') {
                System.out.println("ACEPTADA");
            } else {
                System.out.println("NO ACEPTADA");
            }
        } else {
            System.out.println("NO ACEPTADA");
        }
     }
    
}
