import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int n = 10;
        double[] t = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("t[" + i + "] = ");
            t[i] = read.nextDouble();
        }

        System.out.println("Wybierz opcje wyswietlania: ");
        System.out.println("1. Wyświetlanie tablicy od pierwszego do ostatniego indeksu.");
        System.out.println("2. Wyświetlanie tablicy od ostatniego do pierwszego indeksu.");
        System.out.println("3. Wyświetlanie elementów o nieparzystych indeksach.");
        System.out.println("4. Wyświetlanie elementów o parzystych indeksach.");
        int x = read.nextInt();

        if (x == 1) {
            System.out.println("Wyświetlanie tablicy od pierwszego do ostatniego indeksu");
            for (int i = 0; i < n; i++)
                System.out.println("t[" + i + "] = " + t[i]);
            System.out.println();
        } else if (x == 2) {
            System.out.println("Wyświetlanie tablicy od ostatniego do pierwszego indeksu.");
            for (int i = (n - 1); i >= 0; i--)
                System.out.println("t[" + i + "] = " + t[i]);
            System.out.println();
        } else if (x == 3) {
            System.out.println("Wyświetlanie elementów o nieparzystych indeksach.");
            for (int i = 0; i < n; i++)
                if (i % 2 != 0) System.out.println("t[" + i + "] = " + t[i]);
            System.out.println();
        } else if (x == 4) {
            System.out.println("Wyświetlanie elementów o parzystych indeksach.");
            for (int i = 0; i < n; i++)
                if (i % 2 == 0) System.out.println("t[" + i + "] = " + t[i]);
            System.out.println();

        } else System.out.println("Niepoprawny wybór. Kończenie programu.");
    }
}