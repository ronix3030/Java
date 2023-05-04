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
         hola();
         sumar(5, 5);
         nombre("Ronald", 22);
    
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
         System.out.println("Mi nombre y edad es: "+nombre);
         
     }
    
}
