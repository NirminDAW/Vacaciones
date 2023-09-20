package com.mycompany.vacaciones.java;
import java.util.Scanner;
public class Vacaciones {
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
        String nombre;
        System.out.println("Introduce un nombre: ");
        nombre = sc.nextLine();
        System.out.println("Buenos Días " + nombre);   
        int  Clave;
        System.out.println("Introduce una clave");
        Clave = sc.nextInt();
        int antiguedad;
        System.out.println("Introduce una antiguedad");
         antiguedad= sc.nextInt();{
    }
         case1:
        if (Clave == 1) {
            if (antiguedad == 1) {
            System.out.println("Nombre,derecho 6 dias" );
    } else{
    System.out.println("antiguedad >= 2 && antiguedad>=6");
    }
              System.out.println("Nombre,derecho 14 dias");
    }else{
    System.out.println("Aun no tiene derecho a vacaciones");
    }
case2:
             if (Clave == 2) {
                 if (antiguedad == 1) {
                     System.out.println("Nombre,derecho 7 dias");
    }else{
    System.out.println("antiguedad>=2 & antiguedad<=6");
                     System.out.println("Nombre,derecho 15 dias");
    }
    }else{
    System.out.println(antiguedad == 7);
                    System.out.println("Nombre,derecho 22 dias");
    }
case3:
                    if (Clave ==3) {
                    if (antiguedad == 1) {
                    System.out.println("Nombre,derecho 7 dias");
    } else {
    System.out.println("antiguedad > 2   && antiguedad<=6");
    System.out.println("Nombre,derecho 20 dias");{
    }
    }
    }else{
                         System.out.println ("antiguedad == 7");
                         System.out.println("Nombre,derecho 30 dias");
                    }
                    System.out.println("Aun no tiene derecho a vacaciones");
                    System.out.println("Error, la clave departamento no existe.");
            }
    }
    



    
    
    
   