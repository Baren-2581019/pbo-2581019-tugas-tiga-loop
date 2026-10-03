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

        System.out.println(); // Jarak baris kosong

        // Pembuktian meleset satu (off-by-one)
        int kurang = 0;
        for (int i = 1; i < n; i++) {
            kurang++;
        }

        int kurangSama = 0;
        for (int i = 1; i <= n; i++) {
            kurangSama++;
        }

        System.out.println("i <  n berputar : " + kurang + " kali");
        System.out.println("i <= n berputar : " + kurangSama + " kali");

        // Saringan deret 1-10
        System.out.print("Disaring : ");
        int jumlahPrint = 0;

        // Bagian saringan memakai angka tetap 1-10, tidak ikut n
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                continue; // Lewati angka genap
            }
            if (i > 7) {
                break; // Berhenti kalau i > 7
            }
            System.out.print(i + " ");
            jumlahPrint++;
        }
        System.out.println("\nSampai println : " + jumlahPrint + " kali");

        /*
         * PENJELASAN KENAPA LOOP TIDAK BERHENTI DI i = 8:
         * Karena urutan penulisan kode di dalam badan loop. Pengecekan 'continue' untuk angka genap (i % 2 == 0)
         * berada SEBELUM pengecekan 'break' (i > 7). Saat i bernilai 8, kondisi genap terpenuhi, sehingga 'continue'
         * langsung memicu perulangan melompat ke iterasi berikutnya (i = 9) tanpa sempat membaca baris pengecekan 'break'.
         */

        scanner.close();
    }
}
