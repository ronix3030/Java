/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cursojava;

/**
 *
 * @author ronald
 */
//OPERADORES BASICOS
// + = suma ,- = resta,* = multipliacion ,/= division ,% =resto de una Division

public class Operadores {
    public static void main(String[] args) {
        int a =50;
        int b=6;
        int c=5;
        System.out.println(a%b);
        System.out.println((a-b * c)/4);
        
// OPERADORES EN ASIGNACION 
// SIRVE PARA SIMPLIFICAR EL CODIGO = +=, *= ETC
        
        a=10;
        a+=5;
        System.out.println(a);
        
// OPERADORES RELACIONALES    
 //  = <,>(menoro o M) , <=>=(menor o igual) , != (distinto)
        int f=20;
        int j=5;
        
        System.out.println(f<=j);
 
// OPERADORES LOGICOS
// ESTOS NIEGAN Y COMPARAN DOS VALORES BOOLEANOS Y DEVUELVE BOLLEANO(TRUE,FALSE)
//NOT(!) NIEGA UN VALOR  Y AND (&&) COMPARA 2 VALORES Y OR (||) DEVUELVE TRUE AL MENOS UNO SEA TRUE


        System.out.println(true && true);
        System.out.println(true || false);
        System.out.println(f == j && a>b );
        
 // OPERADORES INCREMENTO Y DECREMENTO
 // se incrementa despues de la ejecucion
           int n=5;
           
           n++;
           n++;
           System.out.println(n);
           System.out.println(++n);
           System.out.println(--n);
       
        
        
    }
    
}
