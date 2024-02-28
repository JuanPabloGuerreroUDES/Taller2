
package EJERCICIOS;

import java.util.Scanner;

public class ejercicio15 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar al usuario el número de mes
        System.out.print("Ingrese un número entre 1 y 12 para el mes: ");
        int numeroMes = scanner.nextInt();
        
        // Determinar el número de días del mes
        int diasMes;
        switch (numeroMes) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                diasMes = 31;
                break;
            case 4: case 6: case 9: case 11:
                diasMes = 30;
                break;
            case 2:
                diasMes = 28; // Consideramos un año no bisiesto por simplicidad
                break;
            default:
                diasMes = -1; // Indicador de error
                break;
        }
        
        // Imprimir el número de días del mes o mensaje de error
        if (diasMes != -1) {
            System.out.println("El mes " + numeroMes + " tiene " + diasMes + " días.");
        } else {
            System.out.println("ERROR: Número de mes no válido.");
        }
    }
    
}
