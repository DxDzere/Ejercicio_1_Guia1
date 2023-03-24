/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_1_guia1;

import java.util.Scanner;

/**
 *
 * @author Zere
 */
public class Ejercicio_1_Guia1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1, num2;
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese 2 numeros");
        System.out.print("Numero 1: ");
        num1 = leer.nextInt();
        System.out.print("Numero 2: ");
        num2 = leer.nextInt();
        System.out.println("");
        System.out.println("La suma de los 2 numeros ingresados es: "+ (num1+num2));
    }
    
}