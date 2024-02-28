
package EJERCICIOS;

import java.util.Scanner;

public class ejercicio11 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Ingrese la cantidad de alumnos: ");
        int cantidadAlumnos = scanner.nextInt();
        
        // Calcular el costo por alumno y el costo total para la compañía de autobuses
        double costoPorAlumno;
        double costoTotalCompania;
        
        if (cantidadAlumnos >= 100) {
            costoPorAlumno = 65.0;
            costoTotalCompania = cantidadAlumnos * costoPorAlumno;
        } else if (cantidadAlumnos >= 50 && cantidadAlumnos <= 99) {
            costoPorAlumno = 70.0;
            costoTotalCompania = cantidadAlumnos * costoPorAlumno;
        } else if (cantidadAlumnos >= 30 && cantidadAlumnos <= 49) {
            costoPorAlumno = 95.0;
            costoTotalCompania = cantidadAlumnos * costoPorAlumno;
        } else {
            costoPorAlumno = 4000.0 / cantidadAlumnos;
            costoTotalCompania = 4000.0;
        }
       
        System.out.println("Costo por alumno: " + costoPorAlumno + " euros.");
        System.out.println("Total a pagar a la compañía de autobuses: " + costoTotalCompania + " euros.");
     }
}
