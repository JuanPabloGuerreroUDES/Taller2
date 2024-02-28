
package EJERCICIOS;

import java.util.Scanner;

public class ejercicio1 {

   
    public static void main(String[] args) {
      
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("ingrese un numero:");
        
        int num1 = scanner.nextInt();
        
        System.out.print("ingrese un numero");
        
        int num2 = scanner.nextInt();
        
        // calcular cual de los numeros es mayor o es igual
        
      // Comparar los números y mostrar el resultado
        if (num1 > num2) {
            System.out.println("El primer número es mayor que el segundo.");
        }else 
        if (num2 > num1) {
            System.out.println("El segundo número es mayor que el primero.");
        }else{
                System.out.println("Los dos números son iguales.");
            }
    }
}
