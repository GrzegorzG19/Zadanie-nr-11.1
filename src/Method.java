import java.util.Scanner;

public class Method {

    public static nObj[] uzup(nObj[] tab) {
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < tab.length; i++) {
            System.out.println("element " + i);
            tab[i] = new nObj(scan.nextLine(), scan.nextInt());
            scan.nextLine();

            for (int j = 0; j < tab.length; j++) {
                if (i != j) {
                    while (tab[i].equals(tab[j])) {
                        System.out.println("wykryłem ten sam element, wpisz ponownie");
                        tab[i] = new nObj(scan.nextLine(), scan.nextInt());
                        scan.nextLine();
                    }
                }
            }

        }
        return tab;
    }
}
