import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Array data karakter dengan nama dan deskripsi
        String[][] karakterData = {
                { "Knight",
                        "Knight adalah pejuang yang ulung dengan kemampuan bertahan yang hebat. "
                                + "Dia membawa perisai besar dan pedang berat untuk melindungi diri dan rekan-rekannya dalam pertempuran." },
                { "Mage",
                        "Mage adalah penyihir kuat dengan kemampuan sihir yang luar biasa. "
                                + "Dia dapat melempar mantra untuk menghancurkan musuhnya dari jarak jauh. "
                                + "Meskipun dia lemah dalam pertempuran fisik, kekuatannya dalam sihir menjadikannya pilihan yang bijaksana dalam tim." },
                { "Archer",
                        "Archer adalah penembak jitu yang sangat terampil. Dia menggunakan busur panjang "
                                + "untuk menyerang musuh dari jarak jauh dengan tepat. Kecepatan dan ketepatan adalah kekuatannya dalam pertempuran." },
                { "Berserker",
                        "Berserker adalah pejuang berani yang mengandalkan kekuatan dan kemarahan dalam pertempuran. "
                                + "Dia bergerak cepat dan menyerang musuhnya dengan kemarahan yang tak terbendung. "
                                + "Meskipun dia kuat dalam serangan, kekurangan pertahanan membuatnya harus berhati-hati dalam pertempuran."}
        };

        System.out.println("Selamat datang di pemilihan Karakter Fantasy!");
        System.out.println("Berikut adalah pilihan karakter yang tersedia : ");

        // Menampilkan pilihan karakter yang tersedia
        for(int indeks = 1; indeks <= karakterData.length; indeks++){
            System.out.println(indeks + ". " + karakterData[indeks - 1][0]);
        }

        int choose;

        // Perulangan validasi input
        while (true) {
            System.out.print("Masukkan nomor karakter yang Anda pilih (1-4) : ");

            // Validasi input: harus berupa angka (integer)
            if (input.hasNextInt()) {
                choose = input.nextInt(); // Mendapatkan input sebagai integer

                // Validasi angka yang dipilih berada dalam rentang yang valid (1-4)
                if (choose >= 1 && choose <= karakterData.length) {
                    break; // Input valid, keluar dari perulangan
                } else {
                    System.out.println("Inputan salah, inputan harus antara angka 1 sampai dengan 4");
                    // Lanjut ke iterasi berikutnya untuk meminta input kembali
                    continue;
                }
            } else {
                System.out.println("Inputan harus angka");
                input.next(); // Mengonsumsi input yang tidak valid untuk menghindari perulangan tak terbatas
                // Lanjut ke iterasi berikutnya untuk meminta input kembali
                continue;
            }
        }

        // Mendapatkan nama dan deskripsi karakter yang dipilih
        String karakter = karakterData[choose - 1][0];
        String job = karakterData[choose - 1][1];

        // Menampilkan nama dan deskripsi karakter yang dipilih
        System.out.println("Anda memilih karakter " + karakter);
        System.out.println(job);

        input.close();

    }
}