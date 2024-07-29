package com.mycompany.vacaciones.java;

import java.util.Scanner;

public class Vacaciones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un nombre: ");
        String nombre = sc.nextLine();

        System.out.println("Buenos Días " + nombre);

        System.out.println("Introduce una clave");
        int clave = sc.nextInt();

        System.out.println("Introduce una antigüedad en años");
        int antiguedad = sc.nextInt();

        if (clave == 1) {
            if (antiguedad == 1) {
                System.out.println(nombre + ", tienes derecho a 6 días de vacaciones.");
            } else if (antiguedad >= 2 && antiguedad <= 6) {
                System.out.println(nombre + ", tienes derecho a 14 días de vacaciones.");
            } else if (antiguedad >= 7) {
                System.out.println(nombre + ", tienes derecho a 20 días de vacaciones.");
            } else {
                System.out.println(nombre + ", aún no tienes derecho a vacaciones.");
            }
        } else if (clave == 2) {
            if (antiguedad == 1) {
                System.out.println(nombre + ", tienes derecho a 7 días de vacaciones.");
            } else if (antiguedad >= 2 && antiguedad <= 6) {
                System.out.println(nombre + ", tienes derecho a 15 días de vacaciones.");
            } else if (antiguedad >= 7) {
                System.out.println(nombre + ", tienes derecho a 22 días de vacaciones.");
            } else {
                System.out.println(nombre + ", aún no tienes derecho a vacaciones.");
            }
        } else if (clave == 3) {
            if (antiguedad == 1) {
                System.out.println(nombre + ", tienes derecho a 10 días de vacaciones.");
            } else if (antiguedad >= 2 && antiguedad <= 6) {
                System.out.println(nombre + ", tienes derecho a 20 días de vacaciones.");
            } else if (antiguedad >= 7) {
                System.out.println(nombre + ", tienes derecho a 30 días de vacaciones.");
            } else {
                System.out.println(nombre + ", aún no tienes derecho a vacaciones.");
            }
        } else {
            System.out.println("Error, la clave del departamento no existe.");
        }
    }
}

    
    
   