import java.util.Scanner;

public class Main {
    public static void printKal() {
        System.out.println("==================");
        System.out.println("====KALKULATOR====");
        System.out.println("==================");
        System.out.println("1. Suma");
        System.out.println("2. Roznica");
        System.out.println("3. Iloczyn");
        System.out.println("4. Iloraz");
        System.out.println("5. Potega");
        System.out.println("6. Pierwiastek");
        System.out.println("7. Funkcje trygnonometryczne (sin, cos, tg");
        System.out.println("8. Wyjscie");
        System.out.println("==================");
    }

    public static void calc(int x, double a, double b) {
        switch (x) {
            case 1:
                System.out.println(a + " + " + b + " = " + (a + b));
                break;
            case 2:
                System.out.println(a + " - " + b + " = " + (a - b));
                break;
            case 3:
                System.out.println(a + " * " + b + " = " + (a * b));
                break;
            case 4:
                System.out.println(a + " / " + b + " = " + (a / b));
                break;
            case 5:
                System.out.println(a + " ^" + b + " = " + (Math.pow(a, b)));
                break;
            case 6:
                System.out.println(" /'" + a + " = " + (Math.sqrt(a)));
                System.out.println(" /'" + b + " = " + (Math.sqrt(b)));
                break;
            case 7:
                System.out.println("sin(a) = " + Math.sin(a));
                System.out.println("cos(a) = " + Math.cos(a));
                System.out.println("tg(a) = " + Math.tan(a));
                System.out.println("sin(b) = " + Math.sin(b));
                System.out.println("cos(b) = " + Math.cos(b));
                System.out.println("tg(b) = " + Math.tan(b));
                break;
        }
    }

    public static void main(String[] args) {
        int i = 1;
        int x;
        double a, b;
        Scanner input = new Scanner(System.in);
        do {
            printKal();
            System.out.print("Wybor z kalkulatora: ");
            x = input.nextInt();
            System.out.println("==================");
            if (x == 8) {
                i = 0;
                System.out.println("Kończenie pracy kalkulatora.");
            } else {
                System.out.print("Podaj pierwsza liczbe: ");
                a = input.nextDouble();
                System.out.println("==================");
                System.out.print("Podaj druga liczbe: ");
                b = input.nextDouble();
                System.out.println("==================");
                calc(x, a, b);
            }
            System.out.println("==================\n");
        } while (i == 1);
    }
}