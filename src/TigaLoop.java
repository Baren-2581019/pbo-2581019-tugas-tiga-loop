import java.util.Scanner;

public class TigaLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Batas deret (n) : ");
        int n = scanner.nextInt();

        System.out.println("\n===== SATU DERET, TIGA LOOP =====");

        // Loop 1: for
        System.out.print("for       : ");
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }

        // Loop 2: while
        System.out.print("\nwhile     : ");
        int j = 1;
        while (j <= n) {
            System.out.print(j + " ");
            j++;
        }

        // Loop 3: do-while
        System.out.print("\ndo-while  : ");
        int k = 1;
        do {
            System.out.print(k + " ");
            k++;
        } while (k <= n);
        System.out.println();

        /*
         * HASIL JALAN PERTAMA (n = 5):
         * for       : 1 2 3 4 5
         * while     : 1 2 3 4 5
         * do-while  : 1 2 3 4 5
         *
         * HASIL JALAN KEDUA (n = 0):
         * for       :
         * while     :
         * do-while  : 1
         *
         * KESIMPULAN:
         * do-while mengecek kondisinya sesudah badan loop dijalankan, jadi badannya pasti jalan minimal sekali.
         */
