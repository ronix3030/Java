/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cursojava;

/**
 *
 * @author ronald
 */
public class ClaseMath {
   public static void main(String[] args) {
       System.out.println("----------Clase Math Operaciones Matematicas Ejemplos-----");
       
       System.out.println("Valor Pi");
       System.out.println(Math.PI); 
       System.out.println("Valor de Euler");
       System.out.println(Math.E);
       System.out.println("Exponente o Potencia");
       System.out.println(Math.pow(5, 3)); // 5 elevado a la 3
       System.out.println("Numero Random con Valor Asignado ");
       System.out.println(Math.random()); // Si no hay valor asignado vota de 0 a 1
       // Numero Random con valor asignado
       // El random te bota numero boleano osea en decimales
       int numeroR=(int)(Math.random()*100); // Asi que tienes que convertirlo en Entero
       System.out.println(numeroR);
       
       
       
       
       
   }
    
}
