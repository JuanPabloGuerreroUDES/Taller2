
package EJERCICIOS;

import java.util.Scanner;

public class ejercicio3 {
    
    public static void main(String[]args){
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("digite numero uno:");
        
       double num1 =scanner.nextDouble();
       
       System.out.print("digite el segundo numero ");
       
       double num2= scanner.nextDouble();
       
        // Verificar si el segundo número es 0 antes de la división
        if (num2 != 0) {
            // Realizar la división y mostrar el resultado
            double resultado = num1 / num2;
            System.out.println("El resultado de la división es: " + resultado);
        } else {
            // Mostrar mensaje de error si el segundo número es 0
            System.out.println("Error: No se puede dividir entre 0.");
        }
        
        
        
    }
    
}
