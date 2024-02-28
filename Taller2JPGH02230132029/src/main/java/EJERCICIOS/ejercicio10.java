
package EJERCICIOS;

import java.util.Scanner;

public class ejercicio10 {
    
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
        System.out.println("Tipos de uva: A, B");
        System.out.println("Tamaños de uva: 1, 2");
        
        System.out.print("Ingrese el tipo de uva (A o B): ");
        char tipoUva = scanner.next().charAt(0);
        
        System.out.print("Ingrese el tamaño de uva (1 o 2): ");
        int tamanoUva = scanner.nextInt();
        
        // Definir el precio inicial según el tipo de uva
        double precioInicial;
        if (tipoUva == 'A') {
            precioInicial = 0.80; // Precio inicial para uva tipo A
        } else if (tipoUva == 'B') {
            precioInicial = 0.70; // Precio inicial para uva tipo B
        } else {
            System.out.println("Tipo de uva no válido.");
            return;
        }
        
        // Modificar el precio inicial según el tamaño de uva
        if (tamanoUva == 1) {
            if (tipoUva == 'A') {
                precioInicial += 0.20; // Aumentar 20 céntimos para tamaño 1
            } else if (tipoUva == 'B') {
                precioInicial -= 0.30; // Reducir 30 céntimos para tamaño 1
            }
        } else if (tamanoUva == 2) {
            if (tipoUva == 'A') {
                precioInicial += 0.30; // Aumentar 30 céntimos para tamaño 2
            } else if (tipoUva == 'B') {
                precioInicial -= 0.50; // Reducir 50 céntimos para tamaño 2
            }
        } else {
            System.out.println("Tamaño de uva no válido.");
            return;
        }
        

        System.out.println("El precio final de la uva entregada es: " + precioInicial + " euros por kilo.");
     }  
}
