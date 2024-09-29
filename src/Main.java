import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        for (int i = 10; i <= 98; i += 2) {
            System.out.print(i + " ");
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj słowo: ");
        String slowo = scanner.nextLine();

        if (czyPalindrom(slowo)) {
            System.out.println("Słowo jest palindromem.");
        } else {
            System.out.println("Słowo nie jest palindromem.");
        }

        notatka notatka1 = new notatka("jeden", "1");
        notatka notatka2 = new notatka("dwa", "2");
        notatka1.wyswietlNotatke();
        notatka2.wyswietlNotatke();
        notatka1.wyswietlWszystko();
        notatka2.wyswietlWszystko();


    }

    public static boolean czyPalindrom(String slowo) {
        int dlugosc = slowo.length();
        for (int i = 0; i < dlugosc / 2; i++) {
            if (slowo.charAt(i) != slowo.charAt(dlugosc - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}