/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cursojava;

/**
 *
 * @author ronald
 */
public class ClaseString {
       public static void main(String[] args) {
           System.out.println("----------Clase String---------- ");
           System.out.println("Metodo charAt");
           // Puedes ingresar a cada indice de la cadena o llamado tmb caracter
           // Comienza de 0 a Infinito
           String nombre="Hola";
           System.out.println(nombre.charAt(3));  // Muestranos el Indice 3
           System.out.println("Metodo length");
           System.out.println(nombre.length());
           System.out.println("Metodo toLowerCase");
           System.out.println(nombre.toLowerCase()); // Convertimos a Minusculas
           System.out.println("Metodo toUpperCase");
           System.out.println(nombre.toUpperCase()); // Convertimos  Mayusculas
           System.out.println("Metodo replace"); // Sirve para reemplazar
           nombre="H O L A A";
           System.out.println(nombre.replace("A","a")); // el segundo parametro es al que quiero que cambie 
           System.out.println("Metodo Equals ");
           // Sirve para comparar 2 cadenas de caracteres para saber si son iguales o no
           System.out.println(" Holi".equals("HOLI")); // devuelve un boleano true o false
           
           
       }
    
}
