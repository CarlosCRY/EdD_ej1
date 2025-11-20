package org.ies.tierno.arrays;

import java.util.Scanner;

public class ejer2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // "SCANNER" renombrado como "scanner"
        int amount;
        // "length" renombrado como "amount" para evitar confusión con metodo ".length"
        do {
            System.out.println("¿Cuántos nombres vas a introducir?");
            amount = scanner.nextInt();
            scanner.nextLine();
            if (amount < 1) {
                System.out.println("Debe ser mayor que cero");
            }
        } while (amount < 1);


        String[] names = new String[amount];
        for (int i = 0; i < names.length; i++) {
            System.out.println("Introduce un nombre: ");
            names[i] = scanner.nextLine();
            // Inicialización de "name" eliminada. "scanner.nextLine()" aplicado directamente en "names[i]"
        }
        System.out.println("Nombres:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}