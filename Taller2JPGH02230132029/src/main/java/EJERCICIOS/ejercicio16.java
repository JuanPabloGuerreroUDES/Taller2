
package EJERCICIOS;

import java.util.Scanner;

public class ejercicio16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        

        System.out.print("Ingrese el peso del paquete en kilogramos: ");
        double pesoPaquete = scanner.nextDouble();
        
        System.out.println("Zonas de destino:");
        System.out.println("1. América del Norte");
        System.out.println("2. América Central");
        System.out.println("3. América del Sur");
        System.out.println("4. Europa");
        System.out.println("5. Asia");
        System.out.print("Ingrese el número de la zona de destino: ");
        int zonaDestino = scanner.nextInt();
        
        // Verificar si el peso del paquete es superior a 5 kg
        if (pesoPaquete > 5) {
            System.out.println("El paquete excede el peso máximo permitido y no puede ser transportado.");
        } else {
            // Calcular el costo por la entrega del paquete
            double costoKilogramo;
            switch (zonaDestino) {
                case 1:
                    costoKilogramo = 24.00;
                    break;
                case 2:
                    costoKilogramo = 20.00;
                    break;
                case 3:
                    costoKilogramo = 21.00;
                    break;
                case 4:
                    costoKilogramo = 10.00;
                    break;
                case 5:
                    costoKilogramo = 18.00;
                    break;
                default:
                    costoKilogramo = -1; // Indicador de error
                    break;
            }
            
            
            if (costoKilogramo != -1) {
                double costoEnvio = pesoPaquete * costoKilogramo;
                System.out.println("El costo por la entrega del paquete es de " + costoEnvio + " euros.");
            } else {
                System.out.println("ERROR: Número de zona de destino no válido.");
            }
        }
        
        scanner.close();
    }
}
