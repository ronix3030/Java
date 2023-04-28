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
public class BucleWhile {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
      
      //Dentro del parentesis del While va una condicion
      //Siempre se declara la variable antes del while
      //Mientras la condicion no se cumpla se ejecuta lo que esta dentro de la lalve
        System.out.println("--------Bucle While-------"); 
      int c=0;  
        while (c<=10){
            System.out.println("No me detengo hasta que valga 10: " + c);
            c+=2; //incremento
        }
        System.out.println("---------Tabla EJERCICIO------");
        
        System.out.println("Ingrese un numero");
        int n =entrada.nextInt();
        
        int r=0;
        while(r<=10){
            System.out.printf("%d x %d = %d \n", n,r,(n*r) );
            r++;
        }
        System.out.println("--------Bucle DO-While-------"); 

        // La condicion se evalua siempre al final y que por lo menos se ejecute 
        // antes de entrar a la condicion y se valide
        // do= hacer ,while=Mientras
        int y=0;
        do{
        System.out.println("Cuento: " +y);// inicia en 0
        y++;
        }while (y<=10);
         int u=11;
        do{
        System.out.println("Cuento: " +u);
        u++;}
        while(u<=20);
        
        
       
        }
        
   
    
}
