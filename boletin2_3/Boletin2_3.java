package boletin2_3;

import java.util.Scanner;


public class Boletin2_3 {

   
    public static void main(String[] args) {
   // convertir cantidad de dinero equivalente a € 
        Scanner sc = new Scanner(System.in);
         System.out.println("Cuantos de 100€ hay?");
        int cien = sc.nextInt() * 100;
        System.out.println("cuantos de 20€?");
        int veinte = sc.nextInt() * 20;
        System.out.println("cuantos de 5€?");
        int five = sc.nextInt() * 5;
        System.out.println("y cuantas monedas de euro?");
        int euros = sc.nextInt();
        System.out.println("Tienes " + (cien + veinte + five) + "€");
    }
    
}
