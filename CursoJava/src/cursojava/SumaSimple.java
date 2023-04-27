/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cursojava;

import java.util.Scanner;

/**
 *
 * @author ronald
 */
public class SumaSimple {
     public static void main(String[] args) {
         Scanner entrada= new Scanner(System.in);
         
         System.out.println("Ingrese un numero");
         int a=entrada.nextInt();
         System.out.println("Ingrese otro numero");
         int b=entrada.nextInt();
         var r=a+b;
         System.out.printf("La SUMA %d + %d= %d \n", a,b,r);
         
         // RECUERDA QUE %d almacena en el orden despues del coma
     }
    
}
