
package EJERCICIOS;

import java.util.Scanner;

public class ejercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
     
        System.out.print("Ingrese la duración de la llamada en minutos: ");
        int duracionLlamada = scanner.nextInt();
        
        System.out.print("Ingrese el día de la semana (1: Domingo, 2: Otro día): ");
        int diaSemana = scanner.nextInt();
        
        // Calcular el costo base de la llamada según la duración
        double costoBase;
        if (duracionLlamada <= 5) {
            costoBase = 1.0;
        } else if (duracionLlamada <= 8) {
            costoBase = 1.0 + (duracionLlamada - 5) * 0.8;
        } else if (duracionLlamada <= 10) {
            costoBase = 1.0 + 3 * 0.8 + (duracionLlamada - 8) * 0.7;
        } else {
            costoBase = 1.0 + 3 * 0.8 + 2 * 0.7 + (duracionLlamada - 10) * 0.5;
        }
        
        // Aplicar el impuesto según el día y turno
        double impuesto;
        if (diaSemana == 1) { // Domingo
            impuesto = costoBase * 0.03;
        } else { // Otro día
            System.out.print("Ingrese el turno (1: Mañana, 2: Tarde): ");
            int turno = scanner.nextInt();
            if (turno == 1) { // Mañana
                impuesto = costoBase * 0.15;
            } else { // Tarde
                impuesto = costoBase * 0.10;
            }
        }
        
        // Calcular el costo total de la llamada
        double costoTotal = costoBase + impuesto;
        
 
        System.out.println("El costo total de la llamada es: " + costoTotal + " euros.");
    }
}
