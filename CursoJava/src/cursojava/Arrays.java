/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cursojava;

/**
 *
 * @author ronald
 */
public class Arrays {
    public static void main(String[] args){
        
        System.out.println("-----Matriz o Array-----");
        //estos corchetes[] significa usar Array
        String nombres[];
        nombres = new String[3];
        
        nombres[0] = "Ron";
    nombres[1] = "javier";
    nombres[2] = "alex";
        System.out.println(nombres[2]);
    //Cambiar un elemento de array 
    nombres[1]="Nuevo";
        System.out.println(nombres[1]);
        //Saber Cuantos datos hay en un Array
        System.out.println(nombres.length);
        
        int[] hola1={0,1,2,3,4,5,6,7,8,9,10};
        System.out.println(hola1[9]);
        //Modificar una pocision
        hola1[2]=12;
        System.out.println(hola1[2]);
          //Codigo Simple Array
          int[] array2= new int[5];
         
          System.out.println("----------------ITERADOR--------------");
          System.out.println("Para mostrar todos los datos que tiene los array");
          String [] Nombres ={"Ronald","Alex","Pablo","Leo","Katy"};
          //Usamos el metodo For + Array
          System.out.println("---Metodo While----");
          int c=0;
                  while(c<Nombres.length)//Para saber la cantidad de datos se usa length
                  {
                      System.out.println(Nombres[c]);
                      c++;
                  }
           System.out.println("---Metodo For---");   
           for(int i=0;i<Nombres.length;i++){
        System.out.println(Nombres[i]);
    }
           System.out.println("---Metodo For EACH---");
           //Mas simple es para iterar arrays
           for(String dato:Nombres){
               System.out.println(dato);
           }
          
          System.out.println("----------Matriz Multidimensional------");
          
          // Arraya con 2 dimensiones
          
          int[][] x =new int[2][3];
          x[0][0] =1; //Fila 1   // Columna 1
          x[0][1] =2; //Fila 1   // Columna 2
          x[0][2] =3; //Fila 1   // Columna 3

          
          x[1][0] =4; //Fila 2   // Columna 1
          x[1][1] =5; //Fila 2   // Columna 2
          x[1][2] =6; //Fila 2   // Columna 3
          
          
          for(int[] matriz:x){
              for(int dato: matriz){
                  System.out.println(dato);
              }
          }
          
          // Arraya con 3 dimensiones
          
          
}  
} 
  

