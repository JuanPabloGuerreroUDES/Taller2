
package EJERCICIOS;

import java.util.Scanner;

public class ejercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
       
        System.out.println("Ingrese las coordenadas y los radios de las dos circunferencias:");
        System.out.print("Circunferencia 1 (x1 y1 r1): ");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        double r1 = scanner.nextDouble();
        
        System.out.print("Circunferencia 2 (x2 y2 r2): ");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();
        double r2 = scanner.nextDouble();
        
        
        double distanciaCentros = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        
    
        if (distanciaCentros > r1 + r2) {
            System.out.println("Las circunferencias son exteriores.");
        } else if (distanciaCentros == r1 + r2) {
            System.out.println("Las circunferencias son tangentes exteriores.");
        } else if (distanciaCentros < Math.abs(r1 - r2)) {
            System.out.println("Las circunferencias son interiores.");
        } else if (distanciaCentros == Math.abs(r1 - r2)) {
            System.out.println("Las circunferencias son tangentes interiores.");
        } else {
            System.out.println("Las circunferencias son secantes.");
        }
        
    }
}