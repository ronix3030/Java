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
public class Switch {
    public static void main(String[] args) {
         Scanner entrada=new Scanner(System.in);
    
         System.out.println("Ingrese el numero del dia");
         int n1=entrada.nextInt();
         //Dentro del case es la condicion que se cumpla ya sea SUMA,Numero,Letra,etc
         // Tambien se puede hacer despues del case toda una operacion
        switch (n1) {
            case 1:{
                System.out.println("Dia seleccionado es Lunes");
            }               
                break;
                 case 2:{
                System.out.println("Dia seleccionado es martes");
            }               
                break;
                 case 3:{
                System.out.println("Dia seleccionado es miercoles");
            }               
                break;
                 case 4:{
                System.out.println("Dia seleccionado es jueves");
            }               
                break;
                 case 5:{
                System.out.println("Dia seleccionado es viernes");
            }               
                break;
                 case 6:{
                System.out.println("Dia seleccionado es Lunes");
            }               
                break;
                 case 7:{
                System.out.println("Dia seleccionado es Lunes");
            }               
                break;
                
            default:{
                System.out.println("Numero invalido");
            }
                throw new AssertionError();
                        
        }
        
        System.out.println("-------Ejemplo con Operacion-------");
        System.out.println("Operacion a Realizar");
        System.out.println("ingrese un numero");
        int r =entrada.nextInt();  
        switch (r) {
            case 1:{ System.out.println("SELECCIONO SUMA");
                 System.out.println("Ingrese un numero");
        int num1=entrada.nextInt();
        System.out.println("Ingrese otro numero");
         int num2=entrada.nextInt();
                System.out.println("La suma es "+ (num1+num2));
            } 
                break;
                case 2:{ System.out.println("SELECCIONO RESTA");
                 System.out.println("Ingrese un numero");
        int num1=entrada.nextInt();
        System.out.println("Ingrese otro numero");
         int num2=entrada.nextInt();
                System.out.println("La resta es "+ (num1-num2));
            } 
                case 3:{ System.out.println("SELECCIONO MULTIPLICACION");
                 System.out.println("Ingrese un numero");
        int num1=entrada.nextInt();
        System.out.println("Ingrese otro numero");
         int num2=entrada.nextInt();
                System.out.println("La multi es "+ (num1*num2));
            } 
                
                
            default:
                System.out.println("Numero incorrecto");
                throw new AssertionError();
        }

    }
    
    
}
