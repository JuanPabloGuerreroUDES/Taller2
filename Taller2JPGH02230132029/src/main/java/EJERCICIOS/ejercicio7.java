
package EJERCICIOS;

import java.util.Scanner;

public class ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
    
        int limiteInferior, limiteSuperior;
        do {
            System.out.print("Ingrese el límite inferior del intervalo: ");
            limiteInferior = scanner.nextInt();
            
            System.out.print("Ingrese el límite superior del intervalo: ");
            limiteSuperior = scanner.nextInt();
            
            if (limiteInferior >= limiteSuperior) {
                System.out.println("Error: El límite inferior debe ser menor que el límite superior.");
            }
        } while (limiteInferior >= limiteSuperior);
        
        // Variables para almacenar las sumas y conteo
        int sumaDentroIntervalo = 0;
        int numerosFueraIntervalo = 0;
        boolean haIntroducidoLimites = false;
        
        // Solicitar números y realizar cálculos
        System.out.println("Introduzca números (0 para terminar):");
        int numero;
        do {
            numero = scanner.nextInt();
            
            if (numero != 0) {
                if (numero > limiteInferior && numero < limiteSuperior) {
                    sumaDentroIntervalo += numero;
                } else {
                    numerosFueraIntervalo++;
                }
                if (numero == limiteInferior || numero == limiteSuperior) {
                    haIntroducidoLimites = true;
                }
            }
        } while (numero != 0);
        
        // Mostrar resultados
        System.out.println("\nResultados:");
        System.out.println("Suma de los números dentro del intervalo: " + sumaDentroIntervalo);
        System.out.println("Cantidad de números fuera del intervalo: " + numerosFueraIntervalo);
        if (haIntroducidoLimites) {
            System.out.println("Se introdujo al menos un número igual a los límites del intervalo.");
        } else {
            System.out.println("No se introdujo ningún número igual a los límites del intervalo.");
        }
    }
}
