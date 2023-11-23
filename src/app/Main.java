package app;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String[] products = {"Вино", "Молоток", "Яблоки", "Вівсяне Печиво", "Персики", "Яблоки", "Сік"};
        Scanner scanner = new Scanner(System.in);

        System.out.println("Нумерований перелік товарів:");
        for (int i = 0; i < products.length; i++) {
            System.out.println((i + 1) + ". " + products[i]);
        }
        System.out.print("\nВведіть найменування товару для пошуку:");
        String searchItem = scanner.nextLine();

        boolean found = false;
        for (int i = 0; i < products.length; i++) {
            if (products[i].equalsIgnoreCase(searchItem)) {
                System.out.println("Товар знайдений! Номер товару:" + (i + 1));
                found = true;
            }
        }

        if (!found) {
            System.out.println("Товар не знайдений.");
        }

        scanner.close();
    }
}
