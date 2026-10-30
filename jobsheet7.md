# JOBSHEET 7 - PERULANGAN 1

**Identitas Mahasiswa:**
* **Nama:** Mochamad Razan Al Baasith
* **NIM:** 264107020145
* **Kelas / No. Presensi:** TI-1D / 19

---

## 1: TUJUAN PRAKTIKUM

1. Mahasiswa dapat menjelaskan format penulisan program perulangan (for, while,
dan do-while)
2. Mahasiswa dapat mengimplementasikan flowchart perulangan menggunakan
bahasa pemrograman Java

---

## 2: Praktikum

### 2.1 Percobaan 1: Studi Kasus Nilai Mahasiswa di SIAKAD – Perulangan FOR

#### 2.1.1 Kode Program Java
```java
import java.util.Scanner;

public class SiakadFor19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double nilai, tertinggi = 0, terendah = 100;
        for (int i = 1; i <= 10; i++) {
            System.out.print("Masukkan nilai mahasiswa ke- " + i + ": ");
            nilai = sc.nextDouble();
            if (nilai > tertinggi) {
                tertinggi = nilai;
            }
            if (nilai < terendah) {
                terendah = nilai;
            }   
        }
        System.out.println("Nilai tertinggi : " + tertinggi);
        System.out.println("Nilai terendah : " + terendah);
    }
}

```

#### 2.1.2 Hasil Running / Screenshot Output

![Output Percobaan 1](<Output Siakad For.png>)

#### 2.1.3 Jawaban Pertanyaan / Pertanyaan Refleksi
* **Pertanyaan 1:** Sebutkan dan tunjukkan masing-masing komponen perulangan FOR pada kode program Percobaan 1!
  * **Jawab:** Dalam perulangan for terdiri dari beberapa komponen “for (int i = 1; i <= 10; i++)” int = 1 ini sebagai inisiasi atau tahapan awal dimana variable control dalam perulangan pertamakali dibuat.
i <= 10 ini bertindak sebagai kondisi dari variable i nya dimana i ini menetukan akan dikerjakan tidaknya sebuah program.
i++ ini bertindak sebagai update dari nilai variable i pada setiap perulangan.
* **Pertanyaan 2:** Mengapa variabel tertinggi diinisialisasi 0 dan terendah diinisialisasi 100? Apa yang terjadi jika variabel tertinggi diinisialisasi 100 dan terendah diinisialisasi 0?
  * **Jawab:** Kenapa tinggi = 0 dan rendah =100, agar nilai yang diinput dapat dibandingkan dan acuannya ga ngawur. Misal kita input angka 60 trus acuan tinggi = 100 nanti nilai yang diproses bukan 60 malah 100 nya begitupun sebaliknya.
* **Pertanyaan 3:** Jelaskan fungsi dan alur kerja dari potongan kode berikut!
```
if (nilai > tertinggi) {
    tertinggi = nilai;
}
if (nilai < terendah) {
    terendah = nilai;
}
```
  * **Jawab:** Program if tersebut digunakan untuk seleksi nilai yang diinput oleh user. If ini mencari mana nilai tertinggi dan nilai terendah sampai sebanyak i , setelah perulangan sudah sama dengan i atau sebanyak i maka kedua variabel akan mendapatkan nilainya.
* **Pertanyaan 4:** Modifikasi kode program sehingga terdapat perhitungan untuk menentukan berapa mahasiswa yang lulus dan yang tidak lulus berdasarkan batas kelulusan (nilai minimal 60). Tampilkan jumlah mahasiswa lulus dan tidak lulus setelah menampilkan nilai tertinggi dan terendah!
  * **Jawab:**
```java
import java.util.Scanner;

public class SiakadFor19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double nilai, tertinggi = 0, terendah = 100;
        int jmlLulus = 0, jmlTidak = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Masukkan nilai mahasiswa ke- " + i + ": ");
            nilai = sc.nextDouble();
            if (nilai > tertinggi) {
                tertinggi = nilai;
            }
            if (nilai < terendah) {
                terendah = nilai;
            }
            if (nilai >= 60) {
                jmlLulus++;
            } else {
                jmlTidak++;
            }   
        }
        System.out.println("Nilai tertinggi : " + tertinggi);
        System.out.println("Nilai terendah : " + terendah);
        System.out.println("Jumlah mahasiswa yang lulus : " + jmlLulus);
        System.out.println("Jumlah mahasiswa yang tidak lulus : " + jmlTidak);          
    }
}
```
#### Hasil Running
![Output Percobaan](<Output Modif Siakad For.png>)

* **Pertanyaan 5:** Commit dan push kode program ke Github
  * **Jawab:** Sudah
    
---

### 2.2 Percobaan 2: Studi Kasus Nilai Mahasiswa di SIAKAD – Perulangan WHILE

#### 2.2.1 Kode Program
```java
import java.util.Scanner;

public class SiakadWhile19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nilai, jml, i = 0;
        System.out.println("Masukkan jumlah mahasiswa: ");
        jml = sc.nextInt();

        while (i < jml){
            System.out.print("Masukkan nilai mahasiswa ke- " + (i + 1) + ": ");
            nilai = sc.nextInt();

            if (nilai < 0 || nilai > 100){
                System.out.println("Nilai tidak valid, Masukkan lagi nilai yang  valid!");
                continue;
            }

            if (nilai > 80 && nilai <= 100) {
                System.out.println("Nilai mahasiswa ke-" + (i+1) + " adalah A");
            } else if (nilai > 73 && nilai <= 80) {
                System.out.println("Nilai mahasiswa ke-" + (i+1) + " adalah B+");
            } else if (nilai > 65 && nilai <= 73) {
                System.out.println("Nilai mahasiswa ke-" + (i+1) + " adalah B");
            } else if (nilai > 60 && nilai <= 65) {
                System.out.println("Nilai mahasiswa ke-" + (i+1) + " adalah C+");
            } else if (nilai > 50 && nilai <= 60) {
                System.out.println("Nilai mahasiswa ke-" + (i+1) + " adalah C");
            } else if (nilai > 39 && nilai <= 50) {
                System.out.println("Nilai mahasiswa ke-" + (i+1) + " adalah D");
            } else {
                System.out.println("Nilai mahasiswa ke-" + (i+1) + " adalah E");
            }
            i++;
        }
    }    
}

```

#### 2.2.2 Hasil Running

![Output Percobaan 2](<Output Siakad While.png>)

#### 2.2.3 Jawaban Pertanyaan / Pertanyaan Refleksi
* **Pertanyaan 1:** Pada potongan kode berikut, tentukan maksud dan kegunaan dari sintaks berikut:
```
if (nilai < 0 || nilai > 100) {
    System.out.println("Nilai tidak valid. Masukkan lagi nilai yang valid!");
    continue;
}
```
a. nilai < 0 || nilai > 100
   Kegunaannya adalah sebagai batasan agar tidak ada nilai yang lebih kecil dari 0 dan lebih besar dari 100, jadi nilai yang dianggap sah hanya antara 0-100 saja 
b. continue
   Digunakan untuk mengulang ke input sebelumnya karena input yang baru saja dilakukan tidak valid. Dengan adanya continue ini program setelahnya tidak akan dijalankan melainkan ia akan mengulang lagi ke angka yang sama, misal dipercobaan itu orang ke 3 tidak valid maka program setelahnya tidak akan jalan atau i tidak akan bertambah melainkan mengulang lagi ke 3. 
* **Pertanyaan 2:** Mengapa sintaks i++ dituliskan di akhir perulangan WHILE? Apa yang terjadi jika posisinya dituliskan di awal perulangan WHILE?
  * **Jawab:** i++ ditulis diakhir while agar setelah program dalam while dijalankan variable i nya bertambah, jika kita menaruh i++ di atas katakanlah setelah continue maka nilai i akan bertambah meskipun nilainya nanti tidak valid karena i tidak melewati seleksi while, jadi mau input valid atau tidak ya tetap dihitung 1 mahasiswa.
* **Pertanyaan 3:** Apabila jumlah mahasiswa yang dimasukkan adalah 19, berapa kali perulangan WHILE akan berjalan?
  * **Jawab:** While akan berulang sebanyak 19 kali.
* **Pertanyaan 4:** Modifikasi kode program sehingga apabila terdapat mahasiswa yang mendapat nilai A, program menampilkan pesan tambahan "Bagus, pertahankan nilainya"!
  * **Jawab:**
```java
import java.util.Scanner;

public class SiakadWhile19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nilai, jml, i = 0;
        System.out.println("Masukkan jumlah mahasiswa: ");
        jml = sc.nextInt();

        while (i < jml){
            System.out.print("Masukkan nilai mahasiswa ke- " + (i + 1) + ": ");
            nilai = sc.nextInt();

            if (nilai < 0 || nilai > 100){
                System.out.println("Nilai tidak valid, Masukkan lagi nilai yang  valid!");
                continue;
            }

            if (nilai > 80 && nilai <= 100) {
                System.out.println("Nilai mahasiswa ke-" + (i+1) + " adalah A");
                System.out.println("Bagus, pertahankan nilainya!!");
            } else if (nilai > 73 && nilai <= 80) {
                System.out.println("Nilai mahasiswa ke-" + (i+1) + " adalah B+");
            } else if (nilai > 65 && nilai <= 73) {
                System.out.println("Nilai mahasiswa ke-" + (i+1) + " adalah B");
            } else if (nilai > 60 && nilai <= 65) {
                System.out.println("Nilai mahasiswa ke-" + (i+1) + " adalah C+");
            } else if (nilai > 50 && nilai <= 60) {
                System.out.println("Nilai mahasiswa ke-" + (i+1) + " adalah C");
            } else if (nilai > 39 && nilai <= 50) {
                System.out.println("Nilai mahasiswa ke-" + (i+1) + " adalah D");
            } else {
                System.out.println("Nilai mahasiswa ke-" + (i+1) + " adalah E");
            }
            i++;
        }
    }    
}
```
#### Hasil Running
![Output Percobaan](<Output Modif Siakad While.png>)

* **Pertanyaan 5:** Commit dan push kode program ke Github
  * **Jawab:** Sudah
---

### 2.3 Percobaan 3: Studi Kasus Transaksi di Kafe – Perulangan DO-WHILE
#### 2.3.1 Kode Program Java
 ```java
import java.util.Scanner;

public class KafeDoWhile19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int kopi, teh, roti;
        String namaPelanggan;
        int hargaKopi = 12000, hargaTeh = 7000, hargaRoti = 20000;

        do {
            System.out.print("Masukkan nama pelanggan (ketik 'batal' untuk keluar): ");
            namaPelanggan = sc.nextLine();
            if (namaPelanggan.equalsIgnoreCase("batal")) {
                System.out.println("Transaksi dibatalkan");
                break;
            }
            System.out.print("Jumlah kopi: ");
            kopi = sc.nextInt();
            System.out.print("Jumlah teh: ");
            teh = sc.nextInt();
            System.out.print("Jumlah roti: ");
            roti = sc.nextInt();
            int totalHarga = (kopi * hargaKopi) + (teh * hargaTeh) + (roti * hargaRoti);
            System.out.println("Total yang harus dibayar: Rp " + totalHarga);
            sc.nextLine();
        } while (true);
        System.out.println("Semua transaksi selesai.");
        sc.close();
    }
}

```
#### 2.3.2 Hasil Running

![Output Percobaan 3](<Output Kafe Do While.png>)

#### 2.3.3 Jawaban Pertanyaan / Pertanyaan Refleksi
* **Pertanyaan 1:** Pada penggunaan DO-WHILE ini, apabila nama pelanggan yang dimasukkan pertama kali adalah “batal”, maka berapa kali perulangan dilakukan?
  * **Jawab:** Jika kita input batal maka program akan memicu break atau berhenti saat itu juga, jadi tidak ada transaksi yang diproses. 
* **Pertanyaan 2:** Sebutkan kondisi berhenti yang digunakan pada perulangan DO-WHILE tersebut!
  * **Jawab:** kondisi berhenti yang digunakan pada program diatas adalah “namaPelanggan.equalsIgnoreCase("batal")”. Karena ada equalsIgnoreCase mau kita nulis huruf besar atau kecil tidak akan berpengaruh, dengan kita input batal maka program akan mencetak “Transaksi dibatalkan” dan memicu break sehingga program berhenti saat itu juga dan tidak akan dilanjutkan.
* **Pertanyaan 3:** Apa fungsi dari penggunaan nilai true pada kondisi DO-WHILE?
  * **Jawab:** Artinya sama aja kayak ulangi terus selamanya sampai ada break yang membuatnya berhenti. JIkalau while biasa tanpa true, yaudah bener dan tetap berjalan, sedangkan false ya berhenti tapi kalau dari awal sudah ada true maka nilainya ga pernah salah dan ga pernah berhenti kecuali ketemu break.
* **Pertanyaan 4:** Mengapa perulangan DO-WHILE tersebut tetap berjalan meskipun tidak ada komponen inisialisasi dan update?
  * **Jawab:** Karena nilainya konstan true terus, bukan hasil dari perbandingan variabel. Jadi dari awal pun gaada nilai yang perlu diganti. Jadi ketika berhenti di break ini, disebabkan karena input pengguna bukan dari perbandingan variabel. 


## 3: TUGAS MANDIRI
   1. Tugas 1:
       Seorang pengelola bioskop ingin membuat program untuk menghitung total penjualan tiket dalam satu hari. Tiket dijual dengan harga Rp 50.000 per tiket. Program harus menghitung total tiket yang terjual dan total harga penjualan tiket selama satu hari dengan ketentuan sebagai berikut: 
   * **Kode Program java**
```java
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

```
   * **Hasil Running**

![Output Tugas 1](<Output Tiket Bioskop.png>)

   2. Tugas 2:
      Sebuah tempat parkir ingin membuat program untuk menghitung total pembayaran parkir dari beberapa kendaraan. Tarif parkir adalah Rp 3.000 per jam untuk mobil dan Rp 2.000 per jam untuk motor. Program akan terus meminta masukan selama input bukan 0. Implementasikan flowchart tersebut ke dalam bentuk kode program Java!
   * **Kode Program Java**
```java
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

```
   * **Hasil Running**

![Output Tugas 2](<Output Parkir.png>)
