
package EJERCICIOS;

import java.util.Scanner;

public class ejercicio4 {
    
        public static void main(String[] args) {
            
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar al usuario que ingrese una cadena
        
        System.out.print("Ingrese una letra: ");
        
        String cadena = scanner.next();
        
        // Verificar si la cadena es una letra mayúscula
        if (cadena.length() == 1 && Character.isUpperCase(cadena.charAt(0))) {
            System.out.println("La letra ingresada es una letra mayúscula.");
        } else {
            System.out.println("La cadena ingresada es una letra minuscula.");
        }
        
        
        
        }
        
}
