/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cursojava;

/**
 *
 * @author ronald
 */
public class Funciones {
     public static void main(String[] args){
         
         // Se llama la funcion dentro el metodo main
         // las variables solo van dentro del metodo main para llamarlas en las funciones
         
         hola();
         sumar(5, 5);
         nombre("Ronald", 22);
         
         System.out.println("La resta es " + rest(50, 10));
    
     }
     
     //Definir la Funcion
     // Static Void solo se ejecutara
     static void hola(){
         System.out.println("Hola AMIGOOOO");
     }
     
     static void sumar(int a, int b){ // PARAMETROS
         int suma= a+b;
         System.out.println(""+ suma);
         
         
     }
     
     static void nombre(String nombre, int edad){ //PARAMETROS
         System.out.printf("Hola soy %s y mi edad es %d \n",nombre,edad);
         
         System.out.println("------Funcion Con Retorno---------");   
     }
         //Si queremos que retorne un int o string lo ponemos despues del static
         static int rest(int a, int x){
             
             return a-x;
             
         }
         
         
         
     }
    

