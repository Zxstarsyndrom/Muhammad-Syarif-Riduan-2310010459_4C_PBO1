package UAS;
import java.util.InputMismatchException;
import java.util.Scanner;

public class PeternakanAyamBanjarmasin {
    public static void main(String[] args) {
        // IO sederhana
        Scanner scanner = new Scanner(System.in);
        // Array
        JenisAyam[] ayamArray = new JenisAyam[2];

        // Perulangan untuk menginput data ayam
        for (int i = 0; i < ayamArray.length; i++) {
            System.out.println("Masukkan data ayam ke-" + (i + 1));

            // Input Jenis Ayam 
            System.out.print("Jenis Ayam (Petelur/Pedaging): ");
            String jenis = scanner.nextLine().trim();

            System.out.print("Kelamin (Betina/Jantan): ");
            String kelamin = scanner.nextLine().trim();

            // Error handling untuk input umur
            int umur = 0;
            boolean validUmur = false;
            while (!validUmur) {
                try {
                    System.out.print("Umur (dalam minggu): ");
                    umur = scanner.nextInt();
                    scanner.nextLine(); // Clear newline character
                    if (umur <= 0) {
                        System.out.println("Umur tidak bisa kurang dari 1 minggu.");
                    } else {
                        validUmur = true; // Umur valid
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Input tidak valid! Silakan masukkan angka untuk umur.");
                    scanner.nextLine(); 
                }
            }

            // objek 
            ayamArray[i] = new JenisAyam(jenis, kelamin, umur);
        }

        // Pengulangan untuk menampilkan data
        System.out.println("\nInformasi Ayam yang dimasukkan:");
        for (int i = 0; i < ayamArray.length; i++) {
            System.out.println("Ayam ke-" + (i + 1));
            ayamArray[i].infoAyam();
            ayamArray[i].seleksiJenisAyam();
            System.out.println("==================="); 
        }

        scanner.close();
    }
}
