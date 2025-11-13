package org.example.dowhile;

import java.util.Scanner;

public class mi_prog {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int option;
        // XXX -> option
        do {
            System.out.println("Calculator");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplica");
            System.out.println("4. Salir");
            option = sc.nextInt();
            sc.nextLine();
            if (option == 1) {
                System.out.println("Introduce un numero");
                int n1 = sc.nextInt();
                // Aaa -> n1
                sc.nextLine();
                System.out.println("Introduce otro");
                int n2 = sc.nextInt();
                // Bbb -> n2
                sc.nextLine();
                System.out.println("La suma es " + (n1 + n2));
            } else if (option == 2) {
                System.out.println("Introduce un numero");
                int n1 = sc.nextInt();
                sc.nextLine();
                System.out.println("Introduce otro");
                int n2 = sc.nextInt();
                sc.nextLine();
                // Inicialización de "n3" borrada
                System.out.println("La resta es " + (n1 - n2));
                // "n3 sustituído por (n1 - n2)"
            } else if (option == 3) {
                System.out.println("Introduce un numero");
                int n1 = sc.nextInt();
                // NUM1 -> n1
                sc.nextLine();
                System.out.println("Introduce otro");
                int n2 = sc.nextInt();
                // NUM2 -> n2
                sc.nextLine();
                System.out.println("La multiplicación es " + (n1 * n2));
                // "n1 * n2" sustituído por "(n1 * n2)"
            }
        } while (option != 4);
        // Indentación corregida usando CTRL + ALT + L
    }
    // que cohone
}