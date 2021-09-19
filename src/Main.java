import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /* ćw.4 */
        /* zad.1 proszę dodać kilka złożonych operacji uzywając kilku operatorów arytmetycznych i logicznych */
        int zmienna = 10;
        if (zmienna <= 10) {
            System.out.println("Liczba " + zmienna + " jest mniejsza od 10");
        }

        if (zmienna < 10) {
            System.out.println("Liczba " + zmienna + " jest mniejsza od 10");
        } else {
            System.out.println("zmienna jest >= 10");
        }

        int wynik = (zmienna % 2 == 0) ? 0 : 1;
        System.out.println(wynik);

        if (zmienna < 4) {
            System.out.println("Liczba " + zmienna + " jest mniejsza od 4");
        } else if (zmienna < 8) {
            System.out.println("zmienna " + zmienna + " jest < od 8");
        } else if (zmienna == 16) {
            System.out.println("zmienna jest równa 16");
        } else {
            System.out.println("wykonał się else: " + zmienna + " jest > 4 i > 8 i inna niż 16");
        }

    }
}
