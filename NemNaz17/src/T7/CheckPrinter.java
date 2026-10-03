package T7;

import java.util.Scanner;

public class CheckPrinter {
    public static void printCheck(String[] items) {
        for (String item : items) {
            String[] parts = item.split(", ");
            // parts: [Наименование, Количество, Цена]
            System.out.printf("%-10s%-10s%-10s%n",
                    parts[0], parts[1], parts[2]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество записей:");
        int n = Integer.parseInt(scanner.nextLine());
        String[] values = new String[n];
        for (int i = 0; i < n; ++i)
            values[i] = scanner.nextLine();
        printCheck(values);
    }
}
