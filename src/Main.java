import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /* ćw.3 */

        /*  zad.1 napisać interfejs który bedzie słuzył do wpisania danych osobowych:
        *   a) Imię, nazwisko, wiek, nr indeksu,
        *   dane mają być wprowadzane z klawiatury w konsoli
        *   b) wyświetlić dane za pomocą println i printf
        */

        // a) zbieranie danych od użytkownika
        Scanner scan = new Scanner(System.in);
        System.out.print("Podaj Imię: ");
        String imię = scan.next();
        System.out.print("Podaj Nazwisko: ");
        String nazwisko = scan.next();
        System.out.print("Podaj wiek: ");
        int wiek = scan.nextInt();
        System.out.print("Podaj numer indeksu: ");
        int indeks = scan.nextInt();

        // b) wyświetlanie
        System.out.println("\nWitaj: " + imię + " " + nazwisko + " " + wiek + " " + indeks + "\n");
        System.out.printf("Witaj: %S, moja mama również nazywała się %S,%nPoważnie %d? Nie wyglądasz na tyle lat? \nTwój indeks to :%d %n %n", imię, nazwisko, wiek, indeks);

        /*  zad.2 zadeklarować 2 zmienne typu int i wykonać na nich obliczenia arytmetyczn (+, -, *, /, %)
        *   wynik wyświetlić w konsoli programu
        */
        int zmienna1 = 4;
        int zmienna2 = 2;

        System.out.println("Jedno plus drugie = " +  (zmienna1 + zmienna2));
        System.out.println("Jedno minus drugie = " + (zmienna1 - zmienna2));
        System.out.println("Jedno razy drugie = " + (zmienna1 * zmienna2));
        System.out.println("Jedno przez drugie = " + (zmienna1 / zmienna2));
        System.out.println("Jedno modulo drugie = " + (zmienna1 % zmienna2));
    }
}
