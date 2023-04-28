/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cursojava;

import java.util.Scanner;

public class BucleFor {
       public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        // for= para(inicio;condicion;incremento)
        // declaras dentro de la misma condicion la variable
        
           System.out.println("----Ejemplo FOR Simple-------");
        for(int i=1;i<=10;i++){
    System.out.println( "hola "+i);
        }
           System.out.println("-------Ejercicio FOR----------");
           //Menos codigo que el while
           System.out.println("Ingrese un numero");
           int r=entrada.nextInt();
           for(int u=0;u<=10;u++){
          //Siempre usar printf si usas el(%d) y luego de la comilla va el coma distinto al prinln
               System.out.printf("%d x %d = %d \n",r,u,(r*u) );
           }
        
           System.out.println("------Break y Continue en For-------");
           //tambien se usa en while
           // se usa dentro del corchete for 
 for(int p=0;p<=5;p++){
               System.out.println("Cuento: "+p);
           
           if(p==3){
               System.out.println("Detengo el bucle");
               break;
           }
           }
       }
    
}
