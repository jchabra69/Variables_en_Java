/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.politecnicomalaga.ejercicios_var;

/** EJERCICIO 1
Escribe un programa en el que se declaren las variables enteras x e y. Asígnales los valores 200 y
111 respectivamente. A continuación, muestra por pantalla el valor de cada variable, la suma, la resta, la división
y la multiplicación.
 * @author Jose-PC
 */

public class Ejercicio_Var1 {

    public static void main(String[] args) {
        int letraX;
        letraX = 200;
        
        System.out.println("El valor de X es = " + letraX);
        
        int letraY;
        letraY = 111;
        System.out.println("El valor de Y = " + letraY);
        
         System.out.print("La suma de Y más X equivale a = ");
         System.out.println(letraX+letraY);
         
         System.out.print("La resta de X menos Y equivale a = ");
         System.out.println(letraX-letraY);
         
         System.out.print("La división de X entre Y equivale a = ");
         System.out.println(letraX/letraY);
         
         System.out.print("La multiplicación de X por Y equivale a = ");
         System.out.println(letraX*letraY);
    }
}


