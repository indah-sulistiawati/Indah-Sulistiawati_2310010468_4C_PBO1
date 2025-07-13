# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh aplikasi pengolahan data karyawan menggunakan Java sebagai tugas akhir dari mata kuliah Pemrograman Berbasis Objek 1.

## Deskripsi

Aplikasi ini menerima input berupa nama dan ID karyawan, serta status karyawan (Tetap/Kontrak), lalu menampilkan informasi seperti divisi, jabatan, dan total gaji berdasarkan ID.

Aplikasi ini menerapkan konsep-konsep utama dalam OOP (Object Oriented Programming) seperti Class, Object, Atribut, Method Constructor, Mutator, Accessor, Enkapsulasi, Inheritance, Polymorphism (Overriding), Seleksi, Perulangan, Input Output Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `Karyawan`, `KaryawanTetap`, `KaryawanKontrak`, `KaryawanInformasi`, dan `KaryawanMain` adalah class.

```bash
public class Karyawan {
    ...
}

public class KaryawanInformasi {
    ...
}

public class KaryawanTetap extends Karyawan {
    ...
}

public class KaryawanKontrak extends Karyawan {
    ...
}

public class KaryawanMain {
    ...
}

```

2. **Object** adalah instance dari class. Pada kode ini, `new KaryawanTetap(nama, id); dan new KaryawanKontrak(nama, id);` adalah pembuatan object.

```bash
Karyawan k;
                    if (status.equals("tetap")) {
                        k = new KaryawanTetap(nama, id);
                    } else {
                        k = new KaryawanKontrak(nama, id);
                    }
```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `nama` dan `id` adalah atribut.

```bash
String nama;
long id;
```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `Karyawan`.

```bash
public Karyawan(String nama, long id) {
        this.nama = nama;
        this.id = id;
}
```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setNama` dan `setId` adalah method mutator.

```bash
public void setNama(String nama) {
        this.nama = nama;
}

public void setId(long id) {
        this.id = id;
}
```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `getNama`, `getId`, `getDevisi`, `getJabatan`, dan `getGaji` adalah method accessor.

```bash
public String getNama() {
    return nama;
}

public long getId() {
    return id;
}

public String getDivisi() {
    ...
}

public String getJabatan() {
    ...
}

public int getGaji() {
    ...
}
```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut `nama` dan `id` dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

```bash
private String nama;
private long id;
```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, Class `KaryawanTetap`dan `KaryawanKontrak` mewarisi Class `Karyawan` dengan sintaks `extends`.

```bash
public class KaryawanTetap extends Karyawan {
    ...
}

public class KaryawanKontrak extends Karyawan {
    ...
}
```

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi, polymorphism bisa berbentuk Overloading ataupun Overriding. Pada kode ini, menggunakan method Overriding yang method di-ubah perilakunya di subclass.

```bash
// Di Class KaryawanTetap
public int getTotalGaji() {
    return getGaji() + tunjangan;
}

// Di Class KaryawanKontrak
public int getTotalGaji() {
    return getGaji();
}
```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, Menggunakan `switch` dan `if` untuk menentukan `divisi`, `jabatan`, dan `validasi ID`.

```bash
// Di Class Karyawan
public String getDivisi() {
    String kode = String.valueOf(id).substring(0, 4);
    switch (kode) {
        case "1011": return "Pemasaran";
        case "1012": return "Keuangan";
        case "1013": return "Produksi";
        case "1014": return "Logistik";
        default: return "Tidak Diketahui";
    }
}

public String getJabatan() {
    String kode = String.valueOf(id).substring(4);
    switch (kode) {
        case "0444": return "Kepala Bagian";
        case "0555": return "Wakil Kepala Bagian";
        case "0666": return "Staf";
        default: return "Tidak Diketahui";
    }
}

public int getGaji() {
    String kode = String.valueOf(id).substring(4);
    switch (kode) {
        case "0444": return 10000000;
        case "0555": return 8000000;
        case "0666": return 5000000;
        default: return 0;
    }
}

// Di Class KaryawanInformasi
if (k instanceof KaryawanTetap) {
            System.out.println("Gaji\t: Rp " + String.format("%,d", ((KaryawanTetap) k).getTotalGaji()).replace(",", "."));
        } else if (k instanceof KaryawanKontrak) {
            System.out.println("Gaji\t: Rp " + String.format("%,d", ((KaryawanKontrak) k).getTotalGaji()).replace(",", "."));
        } else {
            System.out.println("Gaji\t: Rp " + String.format("%,d", k.getGaji()).replace(",", "."));
        }

```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, perulangan menggunakan `do-while`.

```bash
do {
    // menu program
} while (pilihan != 4);

```

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan `Scanner` untuk menerima input dan method `System.out.println` untuk menampilkan output.

```bash
Scanner sc = new Scanner(System.in);
System.out.println("===== Tambahkan Data Karyawan =====");
                    System.out.print("Nama\t: ");
                    String nama = sc.nextLine();
		    .......
		    System.out.print("id\t: ");
                    id = Long.parseLong(sc.nextLine());
		    .......
		    System.out.print("Status (Tetap/Kontrak): ");
                    String status = sc.nextLine().toLowerCase();
```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, `Karyawan[] daftarKaryawan = new Karyawan[100];` adalah penggunaan array.

```bash
Karyawan[] daftarKaryawan = new Karyawan[100];
```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan `try catch` untuk menangani error.

```bash
try {
    // validasi id
} catch (NumberFormatException e) {
    ...
}
```

## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | **TOTAL**      | **100** |

## Pembuat

Nama: Indah Sulistiawati
NPM: 2310010468
