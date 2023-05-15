package com.mycompany.examen1p1_exdimatamoros;

import java.util.Scanner;

public class Examen1P1_ExdiMatamoros {

    public static void main(String[] args) {
        menu();
    }//fin main

    public static void menu() {
        int opcion;
        Scanner lea = new Scanner(System.in);

        do {
            System.out.println("Menú:");
            System.out.println("1. Ejercicio de palabras");
            System.out.println("2. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = lea.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese la primera palabra: ");
                    String palabra1 = lea.next();
                    System.out.print("Ingrese la segunda palabra: ");
                    String palabra2 = lea.next();

                    String resultado = ejercicio_palabras(palabra1, palabra2);
                    System.out.println("Cadena resultante: " + resultado);
                    break;

                case 2:
                    System.out.println("Se abandonara el programa");
                    break;

                default:
                    System.out.println("Opción ingresada es invalida, ingrese una opcion palabra.");
                    break;
            }
        } while (opcion != 2);

    }//fin menu

    public static String ejercicio_palabras(String palabra1, String palabra2) {
        if (palabra1.equals(palabra2)) {
            return palabra1 + new StringBuilder(palabra1).reverse().toString();
        } else if (palabra1.length() == palabra2.length()) {
            StringBuilder cadenaResultante = new StringBuilder();
            for (int i = 0; i < palabra1.length(); i++) {
                cadenaResultante.append(palabra1.charAt(i));
                cadenaResultante.append(palabra2.charAt(i));
            }
            return cadenaResultante.toString();
        } else {
            return palabra1 + palabra2;
        }
    }//fin ejercicio_palabras

}//fin clase
