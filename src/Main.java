import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        nObj[] tab = new nObj[3];

        System.out.println("Wpisz imie i numer");
        Method.uzup(tab);

        for (int i = 0; i <tab.length ; i++) {
            System.out.println(tab[i].getName() + " " + tab[i].getNumber());
        }

    }
}
