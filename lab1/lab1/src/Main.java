import javax.lang.model.element.Name;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static String Name(){
        return "Dawid, 21 lat";
    }

    public static void licz(int a, int b){
        System.out.println(a + " + " + b + " = " + (a+b));
        System.out.println(a + " - " + b + " = " + (a-b));
        System.out.println(a + " * " + b + " = " + (a*b));
    }

    public static boolean isParse(int c){
        if (c%2==0) return true;
        else return false;
    }

    public static boolean isDiv(int d){
        if ((d%3==0)&&(d%5==0)) return true;
        else return false;
    }

    public static double pow3(double e){
        return Math.pow(e,3);
    }

    public static double sqrt2(double f){
        return Math.sqrt(f);
    }

    public static boolean isTriangle(int m, int n, int o){
        if ((m+n)<=o) return false;
        else if ((m+o)<=n) return false;
        else if ((n+o)<=m) return false;
        else return true;
    }
    public static void main(String[] args) {
        int a, b, g, h;
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        System.out.println(Name());

        System.out.println("Zadanie 2:");
        System.out.print("Podaj a: ");
        a = input.nextInt();
        System.out.print("Podaj b: ");
        b = input.nextInt();
        licz(a,b);

        System.out.println(isParse(6));

        System.out.println(isDiv(12));

        System.out.println(pow3(2));

        System.out.println(sqrt2(4));

        System.out.println("Zadanie 7:");
        System.out.print("Podaj a: ");
        g = input.nextInt();
        System.out.print("Podaj b: ");
        h = input.nextInt();

        int x = rand.nextInt(h) + g;
        int y = rand.nextInt(h) + g;
        int z = rand.nextInt(h) + g;

        System.out.println(isTriangle(x,y,z));

    }
}