
import java.io.*;
import java.util.*;

public class mathStackQueue {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         int menu;

        do {
            System.out.println("--- 3. Math, Stack, Queue ---");
            System.out.println("Penjelasan dan Contoh \n"
                    + "1. Math \n"
                    + "2. Stack \n"
                    + "3. Queue");
            System.out.print("Pilihan : ");
            menu = Integer.parseInt(br.readLine());
            switch (menu) {
                case 1:
                    System.out.println("1. Math");
                    System.out.println("Math adalah sebuah class yang didalamnya memiliki "
                            + "banyak metode matematika untuk digunakan pada program. \n"
                            + "Contoh metode yang sering digunakan pada Math Class: \n"
                            + "- Math.max() : Maximum \n"
                            + "- Math.min() : Minimum\n"
                            + "- Math.round() : Pembulatan angka ke atas\n"
                            + "- Math.sqrt() : Akar kuadrat \n"
                            + "- Math.pow(): Pangkat\n"
                            + "- Math.random(): Angka random");
                    //sqrt: akar kuadrat
                    System.out.println("Hasil Math.sqrt() : " + Math.sqrt(4.4));
                    //pow: pangkat
                    System.out.println("Hasil Math.pow() : " + Math.pow(5.0, 3));
                    //random
                    System.out.println("Hasil Math.random() : " + Math.random());
                    //math.max
                    int angka[] = {10, 20, 33, 21, 43, 12};
                    int max = angka[0];
                    for (int i = 1; i < angka.length; i++) {
                        max = Math.max(max, angka[i]);
                    }
                    System.out.println("Nilai maks : " + max);
                    System.out.println();
                    break;
                case 2:
                    System.out.println("2. Stack");
                    System.out.println("Sekumpulan nilai yang terdiri dari urutan beberapa "
                            + "item, yang harus dianggap sebagai tumpukan satu diatas yang lain. Data yang dimasukkan kedalam "
                            + "sebuah stack akan tersusun mengikuti aturan Last In First Out (LIFO) atau "
                            + "yang berada pada akhir masukan (tumpukan teratas) akan dikeluarkan terlebih dahulu");
                    System.out.println("Fungsi-fungsi yang ada di Stack adalah \n"
                            + "- pop() : Remove element\n"
                            + "- push() : Add elements");
                    System.out.println();
                    Stack<String> dosen = new Stack<>();
                    for (int i = 0; i < 5; i++) {
                        System.out.print("Masukkan nama dosen : ");
                        dosen.push(br.readLine());
                    }
                    while (!dosen.empty()) {
                        System.out.println("Stack yang dihapus : " + dosen.pop());
                        System.out.println("Jumlah urutan sekarang : " + dosen.size());
                    }
                    System.out.println();
                    break;
                case 3:
                    System.out.println("3. Queue");
                    System.out.println("Secara konsep mirip dengan penggunaan Stack, hanya "
                            + "saja jika Stack berbasis LIFO, maka Queue berbasis FIFO (First "
                            + "in First Out).\n"
                            + "Queue memiliki 2 jenis class, yaitu LinkedList dan "
                            + "PriorityQueue");
                    System.out.println("Fungsi-fungsi yang ada di Queue adalah \n"
                            + "- add() : Tambah element\n"
                            + "- peek() : Mengakses elemen queue yang keluar pertama\n"
                            + "- poll() : Menghapus elemen");
                    System.out.println();
                    Queue queue = new LinkedList();
                    for (int i = 0; i < 5; i++) {
                        System.out.print("Masukkan angka : ");
                        queue.add(br.readLine());
                    }

                    System.out.println("Urutan queue : " + queue);
                    System.out.println("Elemen yang diakses pertama kali : " + queue.peek());
                    System.out.println("Elemen yang dihapus: " + queue.poll());
                    System.out.println("Urutan sekarang: " + queue);
                    System.out.println();
                    break;
            }
        } while (menu != 0);
        System.out.println();

    }
}
