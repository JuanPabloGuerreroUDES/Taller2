
package EJERCICIOS;

import java.util.Scanner;

public class ejercicio14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
    
        System.out.print("Ingrese el número del día de la semana (1-7): ");
        int diaSemana = scanner.nextInt();
        
        // Determinar el día correspondiente
        String nombreDia;
        switch (diaSemana) {
            case 1:
                nombreDia = "Lunes";
                break;
            case 2:
                nombreDia = "Martes";
                break;
            case 3:
                nombreDia = "Miércoles";
                break;
            case 4:
                nombreDia = "Jueves";
                break;
            case 5:
                nombreDia = "Viernes";
                break;
            case 6:
                nombreDia = "Sábado";
                break;
            case 7:
                nombreDia = "Domingo";
                break;
            default:
                nombreDia = "ERROR: número incorrecto";
                break;
        }
        
       
        System.out.println("El día correspondiente al número ingresado es: " + nombreDia);
    }
}
