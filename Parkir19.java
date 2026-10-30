import java.util.Scanner;

public class Parkir19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jenis, waktu, total = 0;
        do {
            System.out.print("Masukkan jenis kendaraan ( 1 = Mobil, 2 = Motor, 0 = keluar): ");
            jenis = sc.nextInt();

            if (jenis == 1 || jenis == 2) {
                System.out.print("Masukkan durasi waktu: ");
                waktu = sc.nextInt();
                if (jenis == 1) {
                    total += waktu * 3000;
                } else {
                    total += waktu * 2000;
                }
            } else if (jenis > 2){
                System.out.println("Jenis kendaraan tidak tersedia");
            }
        } while (jenis != 0);

        System.out.println("Total pembayaran parkir: Rp " + total);
        sc.close();
    }
}
