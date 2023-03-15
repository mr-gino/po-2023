import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Podaj a, b i c: ");
        double a = inDouble();
        double b = inDouble();
        double c = inDouble();
        if (a!=0) rozKw(a,b,c);
        else System.out.println("To nie jest rownanie kwadratowe.");
    }

    public static double inDouble() {
        Scanner read = new Scanner(System.in);
        double liczba = read.nextDouble();
        return liczba;
    }

    public static void rozKw(double a, double b, double c){
        double delta = Math.pow(b,2)-(4*a*c);
        if (delta < 0) System.out.println("brak rozwiazan w zbiorze R.");
        else if (delta == 0) System.out.println("Jedno rozwiazanie: "+ (-b/(2*a)));
        else System.out.println("Dwa rozwiazania: x1= " + (-b - Math.sqrt(delta))/(2*a) + " x2= "+ (-b + Math.sqrt(delta))/(2*a));
        }
    }
