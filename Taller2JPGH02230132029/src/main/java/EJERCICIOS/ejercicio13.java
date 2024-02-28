
package EJERCICIOS;

import java.util.Scanner;

public class ejercicio13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Ingrese el resultado obtenido al lanzar el dado (1-6): ");
        int resultadoDado = scanner.nextInt();
        
        // Verificar si el resultado está en el rango válido
        if (resultadoDado < 1 || resultadoDado > 6) {
            System.out.println("ERROR: número incorrecto");
        } else {
            // Determinar el número en la cara opuesta del dado
            String caraOpuesta;
            switch (resultadoDado) {
                case 1:
                    caraOpuesta = "Seis";
                    break;
                case 2:
                    caraOpuesta = "Cinco";
                    break;
                case 3:
                    caraOpuesta = "Cuatro";
                    break;
                case 4:
                    caraOpuesta = "Tres";
                    break;
                case 5:
                    caraOpuesta = "Dos";
                    break;
                default:
                    caraOpuesta = "Uno";
                    break;
            }
           
            System.out.println("El número en la cara opuesta del dado es: " + caraOpuesta);
        }
    }
}
