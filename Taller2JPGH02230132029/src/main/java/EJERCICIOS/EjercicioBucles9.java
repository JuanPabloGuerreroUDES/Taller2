/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJERCICIOS;

import java.util.Scanner;

/**
 *
 * @author juang
 */
public class EjercicioBucles9 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce la cantidad de números primos que deseas mostrar: ");
        int n = entrada.nextInt();

        int contador=  0;
        int num = 2;
        while (contador < n) {
            boolean primo = true;
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    primo = false;
                    break;
                }
            }
            if (primo) {
                System.out.println(num);
                contador++;
            }
            num++;
        }
    }
    
}
