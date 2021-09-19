import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int zmiennaInt = 7;
        System.out.println("zmienna int = " + zmiennaInt);
        /* ćw.2 */

        /*   zad.1 zadeklaruj i zainicjalizuj zmienne różnych typów i wyświetl w konsoli (im więcej tym lepiej ;) ) */
        byte zmiennaByte = 1;
        short zmiennaShort = 2;
        int zmiennaInt2 = 3;
        long zmiennaLong = 4;
        float zmiennaFloat = 5.5f;
        double zmiennaDouble = 6.6;
        boolean zmiennaBoolean = true;
        char zmiennaChar = 'M';
        String zmiennaString = "To jestem ja";
        /*
        *    zad.2 Napisz kod który będzie wykonywał operacje: dodawania, odejmowania,
        *    mnożenia, dziealenia i modulo na zmiennych:
        *    a) liczbaA i liczbaB, dowolne liczby calkowite (int),
        *    b) liczbaX i liczbaY, dowolne liczby zmiennoprzecinkowe (double)
        *  */
        System.out.println("Byte + Short = " + (zmiennaByte + zmiennaShort));
        System.out.println("Int2 * Long = " + zmiennaInt2 * zmiennaLong);
        System.out.println("Float / Double = " + zmiennaFloat / zmiennaDouble);
        System.out.println("Zmienna jest = " + zmiennaBoolean);
        System.out.println("To jest pierwsza litera ojego nazwiska Majchrzak: " + zmiennaChar);
        System.out.println("Kto to? " + zmiennaString);
    }
}
