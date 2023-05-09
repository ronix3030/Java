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
         // Podemos reutilizar la funcion con solo llamarla 
         // 3 Ejemplos
         int resta=rest(100, 50);
         System.out.println("La resta es: "+resta);
         System.out.println("La resta es " + rest(50, 10)); 
         String nomb="Roberto";
         //Llamamos a la Funcion en este caso es nom y se rellena auto el espacio
         System.out.println(nom(nomb));
         // Ejemplo de SobreCARGA de funcion
         // No se puede llamar a la misma funcion y que imprima 2 veces la misma con diferente tipo de dato
         System.out.println("la suma de enteros es " + sumaDecimal(500, 500));
         System.out.println("La suma de Decimal es " + sumaDecimal(100.8, 80.5));
         titulo();
         cuentaRegresiva(20);
         System.out.println(factorial(5));
    
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
             
             return a-x; //Tenemos que retornar del mismo tipo en este caso entero
             
         }
         static String nom( String nomb ){
           
             return "Mi nombre es "+nomb;  
         }
         
         static double sumaDecimal(double a, double b){
               System.out.println("-----------Sobre Carga de Funciones-------"); 
       // Podemos llamar al misma funcion pero retorna diferente tipo de datos
       // No se puede crear el mismo nombre con el mismo tipo de dato
       // Tipo de dato es lo que viene despues del static y antes del parentesis
             return a+b;
         }
       static int sumaDecimal(int a, int b){
           
           return a+b;
           
       }
         static void titulo (){      
             System.out.println( "--------Funciones Recursivas-----");
         }
         static void cuentaRegresiva(int numero){ // recibe el numero asignado
             
             numero -- ; // Luego Descuenta -1
             if (numero>0){ // Si se cumple 
                
                 System.out.println(numero); // Imprime
                  cuentaRegresiva(numero); // Se ejecuta denuevo con un numero menos
                  // Reenvia el numero ya que es un bucle hasta que llege a 0
             }
             else {
                 System.out.println("LLego hasta 0");
             }
         }
         
         static int factorial(int numero){
             // El factorial de un numero de la multiplicacion de todos los numeros anteriores hasta llegar a uno
             if (numero >1){
                 numero = numero * factorial(numero - 1); // aca se multiplica con un numero menos con el asignado
                 // el resultado se guarda en numero
             }
             return numero;
         }
         
         
         
         
     }
    

