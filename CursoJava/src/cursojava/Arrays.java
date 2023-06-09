/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cursojava;

import java.util.ArrayList;


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
          // Sirve para almacenar datos sea enteros o Letras 
          // Siempre la primera es la cantidad de Filas y la 2da es la columna
          // A la hora de interar es mas eficiente pero la flexibidad es menor
          int[][] x =new int[2][3]; // x =indice
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
          
        System.out.println("3 FILAS ");
          
          
          
          int [][] y=new int [3][3];
           
          y[0][0]= 1; 
          y[0][1]= 2; 
          y[0][2]= 3; 
          
          y[1][0]= 4; 
          y[1][1]= 5; 
          y[1][2]= 6;
          
          y[2][0]= 7;
          y[2][1]= 8; 
          y[2][2]= 9;
          
          for (int[] array: y){
              for (int datos: array){
                  System.out.println(datos);
              }
          }
          
           // Arraya con 3 dimensiones
                      System.out.println("MULTIDIMIMENSIONAL");
          int [][][] p={
        {
            {1,2,3},
            {4,5,6},
            },
              {
                  {-1,2-3},
                  {-4,-5,-6},
        },
        
    };
          
          
          System.out.println("------------EJEMPLO DE ARRAYLIST----------");
          // Es una clase que permite almacenar elementos en una matriz dinamica
          // Hay que importar la libreria de ArrayList
          // Los arralist normalmente se usan en Proyectos
          // Los arraylist es solo una linea y dinamicas
          // Rendimiento menor pero mas flexible al programar 
          ArrayList <Integer> list =new ArrayList<>();
          list.add(10);
          list.add(20);
          System.out.println(list);
          
          ArrayList<Integer> list2=new ArrayList<>();
          
          list.add(1);
          System.out.println("Otro ejemplo");
          System.out.println("--Pero en String--");
          //Declaracion
          ArrayList<String> cadenitas;
          // Crear Instancia
          cadenitas= new ArrayList<>();
          //Agregar Elementos
          
          cadenitas.add("Hola");
          cadenitas.add("Como ");
          cadenitas.add("Estas? ");
          
          //Recorrer Arraylist con for
          
          for(String datox:cadenitas){
               System.out.println(datox);
           }
          
          //Eliminar Elementos
          cadenitas.remove(2); //Elimine la 2da linea 
          for(String datox:cadenitas){
               System.out.println(datox);
           }
          
          
          
          
          
}
} 
  

