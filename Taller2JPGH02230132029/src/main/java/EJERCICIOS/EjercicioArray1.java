/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJERCICIOS;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class EjercicioArray1 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("A continuacion ingrese 10 numeros: ");
        int[]numero= new int[10];
        
        //ingresar los valores
        for(int i=0; i<numero.length;i++){
            numero[i]=entrada.nextInt();
        }
        //leer los valores
        System.out.println("El orden inverso es: ");
        for(int i=numero.length-1; i>=0; i--){
            System.out.println(numero[i]);
        }
    }
    
}
