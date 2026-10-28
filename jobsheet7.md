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

![Output Percobaan 1](<output ujian skripsi.png>)

#### 2.1.3 Jawaban Pertanyaan / Pertanyaan Refleksi
* **Pertanyaan 1:** Sebutkan dan tunjukkan masing-masing komponen perulangan FOR pada kode program Percobaan 1!
  * **Jawab:** .
* **Pertanyaan 2:** Mengapa variabel tertinggi diinisialisasi 0 dan terendah diinisialisasi 100? Apa yang terjadi jika variabel tertinggi diinisialisasi 100 dan terendah diinisialisasi 0?
  * **Jawab:** .
* **Pertanyaan 3:** Jelaskan fungsi dan alur kerja dari potongan kode berikut!
```
if (nilai > tertinggi) {
    tertinggi = nilai;
}
if (nilai < terendah) {
    terendah = nilai;
}
```
  * **Jawab:**
* **Pertanyaan 4:** Modifikasi kode program sehingga terdapat perhitungan untuk menentukan berapa mahasiswa yang lulus dan yang tidak lulus berdasarkan batas kelulusan (nilai minimal 60). Tampilkan jumlah mahasiswa lulus dan tidak lulus setelah menampilkan nilai tertinggi dan terendah!
  * **Jawab:**
* **Pertanyaan 5:** Commit dan push kode program ke Github
  * **Jawab**
    
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
                System.out.println("Nilai tidak valid, Masukkan lagi nilai yang valid!");
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

![Output Percobaan 2](<output akses WIFI.png>)

#### 2.2.3 Jawaban Pertanyaan / Pertanyaan Refleksi
* **Pertanyaan 1:** Pada potongan kode berikut, tentukan maksud dan kegunaan dari sintaks berikut:
```
if (nilai < 0 || nilai > 100) {
    System.out.println("Nilai tidak valid. Masukkan lagi nilai yang valid!");
    continue;
}
```
a. nilai < 0 || nilai > 100
b. continue
  * **Jawab:** 
* **Pertanyaan 2:** Mengapa sintaks i++ dituliskan di akhir perulangan WHILE? Apa yang terjadi jika posisinya dituliskan di awal perulangan WHILE?
  * **Jawab:**
* **Pertanyaan 3:** Apabila jumlah mahasiswa yang dimasukkan adalah 19, berapa kali perulangan WHILE akan berjalan?
  * **Jawab:**
* **Pertanyaan 4:** Modifikasi kode program sehingga apabila terdapat mahasiswa yang mendapat nilai A, program menampilkan pesan tambahan "Bagus, pertahankan nilainya"!
  * **Jawab:** 
* **Pertanyaan 5:** Commit dan push kode program ke Github
  * **Jawab:** 
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

![Output Percobaan 3](<output akses lab.png>)

#### 2.3.3 Jawaban Pertanyaan / Pertanyaan Refleksi
* **Pertanyaan 1:** Pada penggunaan DO-WHILE ini, apabila nama pelanggan yang dimasukkan pertama kali adalah “batal”, maka berapa kali perulangan dilakukan?
  * **Jawab:** 
* **Pertanyaan 2:**  Sebutkan kondisi berhenti yang digunakan pada perulangan DO-WHILE tersebut!
  * **Jawab:** 
* **Pertanyaan 3:** Apa fungsi dari penggunaan nilai true pada kondisi DO-WHILE?
  * **Jawab:** 
* **Pertanyaan 4:** Mengapa perulangan DO-WHILE tersebut tetap berjalan meskipun tidak ada komponen inisialisasi dan update?
  * **Jawab:** 


## 3: TUGAS MANDIRI
   1. Tugas 1: 
   * **Kode Program java**
```java
import java.util.Scanner;

public class tugas1diskonBuku19 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int diskon = 0; 
    String buku;
    int jumlah;

    System.out.print("Buku apa yg ingin kamu beli?  ");
    buku = sc.next();

    System.out.print("Berapa jumlah bukunya? ");
    jumlah = sc.nextInt();

    if (buku.equalsIgnoreCase("kamus")) {
      diskon = 10;
      if (jumlah > 2) {
        diskon += 0.02;
      }
    } else if (buku.equalsIgnoreCase("novel")) {
      diskon = 7;
      if (jumlah > 3) {
        diskon += 3;
      } else {
        diskon += 0.01;
      }
    } else {
      if (jumlah > 3) {
        diskon = 5;
      }

    }
    sc.close();
    System.out.println(String.format("Total diskonmu adalah %d%%",  diskon));
  }
}
```
   * **Hasil Running**

![Output Tugas 1](<output diskon buku.png>)

   2. Tugas 2:
   * **Kode Program Java**
```java
import java.util.Scanner;

public class tugas2SeleksiAsisten {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean isAktif;
        boolean sedangDisanksi;
        int nilaiDaspro,nilaiWawancara;
        boolean hasSertifikat;
        
        System.out.print("Apakah status mahasiswa aktif? ");
        isAktif = sc.nextBoolean();
        System.out.print("Apakah Mahasiswa mendapatkan sanksi akademik? ");
        sedangDisanksi = sc.nextBoolean();

        if (isAktif && !sedangDisanksi) {
            System.out.print("Berapa nilai Dasar Pemrograman? ");
            nilaiDaspro = sc.nextInt();
            System.out.print("Apakah memiliki sertifikat kompetensi pemrograman? ");
            hasSertifikat = sc.nextBoolean();
            if (nilaiDaspro >= 80 || hasSertifikat) {
                System.out.print("Berapa nilai wawancara? ");
                nilaiWawancara = sc.nextInt();
                if (nilaiWawancara >= 75) {
                    System.out.println("Mahasiswa diterima sebagai asisten");
                } else {
                    System.out.println("Ditolak sebagai asisten");
                }
            } else {
                System.out.println("Maaf syarat berkas tidak terpenuhi");
            } 
        } else {
            System.out.println("Maaf syaratmu tidak terpenuhi");
        }
        sc.close();
    }
}
```
   * **Hasil Running**

![Output Tugas 2](<output seleksi asisten.png>)
