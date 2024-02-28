
package EJERCICIOS;

import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[]args){
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("digite un numero:");
        int num1 =scanner.nextInt();
     
        if (num1 % 2 == 0){
            
            System.out.println("el numero es par");
            
        }    else {
                    System.out.println("el numero es impar");
        
                    }
        }
    }
