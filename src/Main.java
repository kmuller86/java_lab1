import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ćw.5 */

        /* zad.1 podziel swój wiek przez modulo 3 i jeśli twój wiek zwraca 0 wyświetl napis "Podzielny przez 3",
         * w innym wypadku "Niepodzielny przez 3" użyj kontrukcji if else
         * */
        int wiek = 48;
        int modulo = 3;
        int wynik;
        if (wiek % modulo == 0) {
            wynik = 0;
            System.out.println("Wynik modulo: " + wynik + " Podzielny przez: " + modulo);
        } else {
            wynik = (wiek % modulo);
            System.out.println("Wynik modulo: " + wynik + " Niepodzielny prze: " + modulo);
        }

        /* zad.2 użyj parametru trójargumentowego aby sprawdzić parzystośc nr. indeksu */
        int mojIndex = 60473;
        String czyParzysta;
        if (mojIndex % 2 == 0) {
            czyParzysta = "parzysta";
        } else {
            czyParzysta = "nieparzysta";
        }
        System.out.println(
                "Liczba " + mojIndex + " jest " + czyParzysta);

        // albo raczej to:
        int numerindeksu = 60473;
        String parzysta = (numerindeksu % 2 == 0) ? "parzysta" : "nieparzysta";
        System.out.println("Ten indeks to liczba " + parzysta + ".");

        /* zad.3 wpisz z klawiatury liczbę zmiennoprzecinkową (użyj klasy Scanner z poprzednich ćwiczeń)
         * i stwórz konstrukcję else if z dowolnymi komunikatami */

        Scanner sc=new Scanner(System.in);
        System.out.println("Wpisz liczbę: ");
        double num = sc.nextDouble();
        if(num > 0)
        {
            System.out.println(num+" jest liczbą dodatnią.");
        }
        else
        {
            System.out.println(num+" jest liczbą ujemną.");
        }
    }
}
