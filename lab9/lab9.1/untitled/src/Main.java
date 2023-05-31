import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        var imiona = new ArrayList<String>();
        int n =0;
        while (n == 0){
            System.out.print("Podaj imie: ");
            String m = read.nextLine();
            if (!Objects.equals(m, "-"))
                imiona.add(m);
            else n++;
        }

        for (String imie: imiona)
            System.out.println(imie);
    }
}