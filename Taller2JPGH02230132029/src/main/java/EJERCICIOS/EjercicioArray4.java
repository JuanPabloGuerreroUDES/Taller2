/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJERCICIOS;

import java.util.Random;


/**
 *
 * @author juang
 */
public class EjercicioArray4 {
    public static void main(String[] args) {
        
        System.out.println("Ingrese los 20 numeros que se almacenaran de forma 4x5: ");
        int fila=4;
        int columna=5;
        int numero[][]=new int[fila][columna];
        Random numeroRandom =new Random();

        //entrada de datos
        for(int i=0;i<fila;i++){
            for(int j=0;j<columna;j++){
                numero[i][j]=numeroRandom.nextInt(999)+100;
            }
        }

        //operaciones
        int sumaFila[]=new int[fila];
        int sumaColumna[]=new int[columna];
        for(int i=0;i<fila;i++){
            for(int j=0;j<columna;j++){
                sumaFila[i]=sumaFila[i]+numero[i][j];
                sumaColumna[j]=sumaColumna[j]+numero[i][j];
            }
        }

        int numero2[][]=new int[fila+1][columna+1];
        for(int i=0; i<fila;i++){
            for(int j=0; j<columna;j++){
                numero2[i][j]=numero[i][j];
            }
            numero2[i][columna]=sumaFila[i];
        }

        

        // Agregar las sumas de cada columna en la última fila
        for(int j=0;j<columna;j++){
            numero2[fila][j]=sumaColumna[j];
        }
        
        // Calcular la suma total y agregarla en la esquina inferior derecha
        int total=0;
        for(int i=0;i<fila;i++){
            for(int j=0;j<columna;j++){
                total=total+numero[i][j];
            }
        }
        numero2[fila][columna]=total;

        //salida de datos
        for(int i=0;i<fila+1;i++){
            for(int j=0;j<columna+1;j++){
                System.out.print(numero2[i][j]+" ");
            }
            System.out.println("");
        }
    }
    
}
