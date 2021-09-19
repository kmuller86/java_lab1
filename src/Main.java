import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* Tablice - cw_6 */

        /* zad1. stworzyć tablicę typu double 5-cio elementową,
        przypisać do niej wartości i wyświetlić */
        /* Deklarowanie i inicjalizacja tablic */
        int[] tab1 = {2, 4, 6, 8, 10};
        boolean[] tab2 = new boolean[12];
        String[] tab3 = new String[]{"Alex", "Steve", "John"};
        char[] tab4;

        /* drógi sposób inicjalizowania tablic */
        int[] tab5 = new int[5];
        tab5[0] = 1;
        tab5[1] = 2;
        tab5[2] = 3;
        tab5[3] = 4;
        tab5[4] = 5;
        System.out.println(tab5.length); // 5

        /* wyświetlanie elementów tablicy */
        System.out.println("tab1: " + tab1); // [I@36baf30c
        System.out.println("tab1[0]: " + tab1[0]); // tab1[0]: 2
        System.out.println("tab3[2]: " + tab3[2]); // tab5[1]: John

        /* przykład przypisania wartości w pętli for */
        int[] tab6 = new int[5];
        for (int i = 0; i < tab6.length; i++) {
            tab6[i] = i + 5;
        }

        /* przykład wyświetlania wartości w pętli for */
        for (int i = 0; i < tab6.length; i++) {
            System.out.print(tab6[i] + " "); // 5 6 7 8 9
        }
    }
}
