/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.politecnicomalaga.ejercicios_var;

/** EJERCICIO 2
Modifica el ejercicio anterior y lee del teclado dos enteros para asignarlos respectivamente a x e y.
Prueba con varias ejecuciones la funcionalidad de esta minicalculadora.
 * @author Jose-PC
 */

import java.util.Scanner;

public class Ejercicio_Var2 {

    public static void main(String[] args) {
      Scanner entrada=new Scanner(System.in);
      int x;
      int y;
      System.out.println("Escribe un entero para X");
      x=entrada.nextInt();
      System.out.println("Tu número para X es: " + x);
      
      System.out.println("Escribe un entero para Y");
      y=entrada.nextInt();
      System.out.println("Tu número para Y es: " + y);
    }
    
    
}
