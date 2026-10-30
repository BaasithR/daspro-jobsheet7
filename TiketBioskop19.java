import java.util.Scanner;

public class TiketBioskop19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hargaTiket = 50000;
        int jumlahTiket, totalTiket = 0, totalPenjualan = 0;
        int totalAwal, persenDiskon, diskon, totalBayar;

        while (true) {
            System.out.print("Masukkan jumlah tiket (0 untuk selesai): ");
            jumlahTiket = sc.nextInt();

            if (jumlahTiket == 0) {
                break;
            }    
            if (jumlahTiket < 0) {
                System.out.println("Input tidak valid, silakan masukkan lagi!");
            }
            totalAwal = jumlahTiket*hargaTiket;

            if (jumlahTiket > 10) {
                persenDiskon = 15;
            } else if (jumlahTiket > 4 ) {
                persenDiskon = 10;
            } else {
                persenDiskon = 0;
            }
            diskon = totalAwal * persenDiskon/100;
            totalBayar = totalAwal - diskon;

            System.out.println("Harga awal  : Rp " + totalAwal);
            System.out.println("Diskon      : " + persenDiskon + "% (Rp " + diskon + ")");
            System.out.println("Total bayar : Rp " + totalBayar);

            totalTiket += jumlahTiket;
            totalPenjualan += totalBayar;
        }
        System.out.println("\n=== Rekap Penjualan Hari Ini ===");
        System.out.println("Total tiket terjual : " + totalTiket);
        System.out.println("Total penjualan     : Rp " + totalPenjualan);
        sc.close();
    }
}
