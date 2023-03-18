
package com.mycompany.ejercicio7_actividad2;
import java.util.Scanner;
public class Ejercicio7_actividad2 {

    public static void main(String[] args) {
      Scanner leerporteclado = new Scanner(System.in);
      
      double A, B;
      
        System.out.print("Ingrese el valor de A: ");
        A = leerporteclado.nextDouble();
        
        System.out.print("Ingrese el valor de B: ");
        B = leerporteclado.nextDouble();
        
        if(A>B){
            System.out.print("A es mayor que B: " + A + " > "+B);
        } else if(A==B) {
            System.out.print("A es igual a B: " + A + " = "+B);
        } else {
            System.out.print("A es menor que B: " + A + " < "+B);
        }
    }
}
