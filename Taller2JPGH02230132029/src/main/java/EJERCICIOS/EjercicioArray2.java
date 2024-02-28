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
public class EjercicioArray2 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int[]numero = new int[10];
        
        //Entrada de numeros
        System.out.println("Ingrese 10 numeros: ");
        for(int i=0; i<numero.length;i++){
            numero[i]=entrada.nextInt();
        }
        
        //numero minimo
        int min=numero[0];
        for(int i=1; i<numero.length;i++){
            if(min>numero[i]){
                min=numero[i];
            }
        }
        
        //numero maximo
        int max=numero[0];
        for(int i=0; i<numero.length; i++){
            if(max<numero[i]){
                max=numero[i];
            }
        }
                
        System.out.println("El numero minimo es: "+min);
        System.out.println("El numero maximo es: "+max);
    }
    
}
