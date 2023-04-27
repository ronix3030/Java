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
public class IFyELSE {
    public static void main(String[] args) {
         Scanner entrada=new Scanner(System.in);
         
         
        System.out.println("Ingrese un numero: ");
        int n1=entrada.nextInt();
        // compara si es par si es divisible entre 2 es par
        if(n1%2 ==0){
            System.out.println("Es par");
        }
        // si no devuelve el primero se ejecuta el else 
        else{
            System.out.println("Es impar");
        }
        
        System.out.println("-------CONDICIONES ANIDADAS-----");
        // Dentro de este if pueden haber varias if con su respectivo else 
        // en este caso el if tiene que cumplirse para seguir la secuencia
        // si no cumple la primera o 2da se iria a else 
        
        System.out.println("Ingrese un numero");
        int n2=entrada.nextInt();
        if (n2!=0) {
            if(n2>0){
                if(n2 %2 ==0){
                    System.out.printf("El numero %d es Par POSITIVO \n",n2);
                }
                else{
                    System.out.println("El numero %d es Impar POSITIVO \n");
                }
                
            }else{
                 if(n2 %2 ==0){
                    System.out.printf("El numero %d es Par NEGATIVO",n2);
                }
                else{
                    System.out.println("El numero %d es Impar NEGATIVO");
                }
            }   
        } else {
            System.out.printf("El numero %d es Neutro\n",n2);
        }
        
        System.out.println("---------MULTIPLES CONDICIONES-------");
        System.out.println("Ingrese una Letra");
       char c=entrada.next().charAt(0);
    // Dentro de un mismo if o if else if
    //Siempre usar char para un caracter y lleva comilla simple
        if(c=='a'|| c=='A'){
        System.out.printf("&s es Vocal\n",c);
        }     else if (c== 'e' || c=='E'){
            System.out.printf("%s es Vocal \n",c);
            
        }
        else if (c== 'i' || c=='I'){
            System.out.printf("%s es Vocal \n",c);
            
        }
        else if (c== 'o' || c=='O'){
            System.out.printf("%s es Vocal \n",c);
            
        }
        else if (c== 'u' || c=='U'){
            System.out.printf("%s es Vocal \n",c);
            
        }
        else{
            System.out.printf("%s No es VOCAL");
        }
        
        
        
        
        
    }
    
}
