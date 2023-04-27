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
public class PrecioVenta {
    public static void main(String[] args) {
    Scanner entrada=new Scanner(System.in);
    
        System.out.println("Ingrese valor de la Venta");
        double va1=entrada.nextDouble();
        
        double igb=va1*0.18;
        double pv=igb+va1;
        System.out.println("Valor Venta: "+va1);
        System.out.println("IGB: "+ igb);
        System.out.println("Precio Total de Venta: " + pv);
    
    
    
    }
}
