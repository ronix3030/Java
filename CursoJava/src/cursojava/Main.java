/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cursojava;

public class Main {

    public static void main(String[] args) {
      
        System.out.println("Hola Mundo");
        // AGREGAMOS 2 slash para poder hacer comentarios sin dañara el codigo
        
        
        String nombre;
        int a,b,c;
        
        nombre="Ronald Ro";
        int edad=25;
        a=1;
        b=2;
        c=3;
        
        System.out.println(nombre);
        System.out.println(edad);
        
        edad=26;
        System.out.println(edad);
        System.out.println(a+b+c);
        
        // nueva forma de definir las variables
        // var le asignas tipo de dato ahi mismo
        // no se usa comunmente 
        
        var primerNombre="hola";
        var segundoNombre="jaja";
        var edadx="20";
        var misNombres = primerNombre+segundoNombre;
        System.out.println("Mi nombre es " +misNombres + "y mi edad es: " +edadx);

    }
    
}
