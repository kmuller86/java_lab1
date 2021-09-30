import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* Tablice - cw_6 */

        /* zad1. stworzyć tablicę typu double 5-cio elementową,
        przypisać do niej wartości i wyświetlić */

        double[] tab1 = new double[] {1.1, 2.2, 3.3, 4.4, 5.5};
        for (int i = 0; i < tab1.length; i++) {
            System.out.print(tab1[i] + " ");
        }
        // najgorsze co może być ;).
        System.out.println("\n" + tab1[0]+ " " + tab1[1]+ " " +tab1[2]+ " " +tab1[3]+ " " +tab1[4]);
        System.out.print("Tablica posiada " + tab1.length + " elementów/ty.");
    }
}
