/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.politecnicomalaga.ejercicios_var;

/** EJERCICIO 6
 * Escribe un programa que calcule el total de una factura a partir de la base imponible (precio sin
IVA). Todos los datos se leerán desde el teclado
 * @author Jose-PC
 */

import java.util.Scanner;

public class Ejercicio_Var6 {
    
    public static void main(String[] args) {
      Scanner entrada=new Scanner(System.in);
      int base;
      int IVA;
      int resultado;
      
        System.out.println("Ingresa la base imponible");
        
            base=entrada.nextInt();
            
                System.out.println("Ahora el porcentaje");
                
                    IVA=entrada.nextInt();
                    
                    
                        System.out.println("El total a pagar en tu factura es: ");
                            
                                resultado= IVA*base/100;
                                System.out.println(base+resultado);
                                
      
    }
    
}
