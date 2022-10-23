/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.politecnicomalaga.ejercicios_var;

/** EJERCICIO 5
 * Realiza una modificación al ejercicio 4 para que los datos de las variables se lean desde el teclado.
 * @author Jose-PC
 */

import java.util.Scanner;

public class Ejercicio_Var5 {

    public static void main(String[] args) {
      Scanner entrada=new Scanner(System.in);
      
      String nombre;
      String direccion;
      int telefono;
      
        System.out.println("Escribe tu nombre:");
        nombre=entrada.next();
        System.out.println(" Encantado " + nombre);
        
        System.out.println("Ahora tu dirección, por favor:");
        direccion=entrada.next();
        System.out.println(" Vale, te visitaré mañana entonces en " + direccion);
        
        System.out.println("Para finalizar, necesito tu número de teléfono.");
        telefono=entrada.nextInt();
        System.out.println(" Te llamaremos mañana al: " + telefono);
    }
    
}
