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
// Contoh kode program dummy Percobaan 1
import java.util.Scanner;

public class nestedUjianSkripsi19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String pesan;
        System.out.print("Apakah mahasiswa sudah bebas kompen? (Ya/Tidak): ");
        String bebasKompen = sc.nextLine().trim();

        System.out.print("Masukkan jumlah log bimbingan Pembimbing 1: ");
        int bimbinganP1 = sc.nextInt();
        System.out.print("Masukkan jumlah log bimbingan Pembimbing 2: ");
        int bimbinganP2 = sc.nextInt();

        if (bebasKompen.equalsIgnoreCase("Ya")) {
            if (bimbinganP1 >= 8 && bimbinganP2 >= 4) {
                pesan = "Semua syarat terpenuhi. Mahasiswa boleh mendaftar ujian skripsi";
            } else if (bimbinganP1 < 8 && bimbinganP2 < 4){
                pesan = "Gagal! Log bimbingan P1 kurang dari 8 kali dan P2 kurang dari 4 kali";
            } else if(bimbinganP1 < 8){
                pesan = "Gagal! Log bimbingan P1 belum mencapai 8 kali";
            } else {
                pesan = "Gagal! Log bimbingan P2 belum mencapai 4 kali";
            }
        } else {
            pesan = "Gagal! Mahasiswa masih memiliki tanggungan kompen";
        }
        System.out.println(pesan);
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

public class operatorLogikaWifi19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean mahasiswa, dosen, akunDiblokir;

        System.out.println("Apakah pengguna mahasiswa (true/false): ");
        mahasiswa = sc.nextBoolean();
        System.out.println("Apakah pengguna dosen (true/false): ");
        dosen = sc.nextBoolean();
        System.out.println("Apakah akun sedang diblokir? (true/false): ");
        akunDiblokir = sc.nextBoolean();
        
        if ((mahasiswa || dosen) && !akunDiblokir) {
            System.out.println("Akses WIFI diberikan");
        } else {
            System.out.println("Akses WIFI ditolak");
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

public class nestedAksesLab19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Apakah status mahasiswa aktif? (true/false): ");
        boolean mahasiswaAktif = sc.nextBoolean();
        System.out.println("Apakah dikenakan sanksi? (true/false): ");
        boolean sedangDisanksi = sc.nextBoolean();
        System.out.println("Apakah punya izin dari dosen? (true/false): ");
        boolean punyaIzinDosen = sc.nextBoolean();
        System.out.println("Apakah merupakan asisten lab? (true/false): ");
        boolean asistenLab = sc.nextBoolean();

        if (mahasiswaAktif && !sedangDisanksi) {
            if (punyaIzinDosen || asistenLab) {
                System.out.println("Akses laboratorium diberikan");
            } else {
                System.out.println("Akses ditolak: membutuhkan izin dosen atau status asisten lab");
            }
        } else {
            System.out.println("Akses ditolak: status mahasiswa tidak memenuhi syarat");
        }
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
