package uaspbo;

import java.util.Scanner;

public class KaryawanMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // IO sederhana

        // Array 
        Karyawan[] daftarKaryawan = new Karyawan[100];
        int jumlahKaryawan = 0;
        int pilihan;

        // Perulangan menu 
        do {
            // Menu
            System.out.println("===== MENU =====");
            System.out.println("1. Tambahkan Data Karyawan");
            System.out.println("2. Tampilkan Semua Data Karyawan");
            System.out.println("3. Cek Data Karyawan");
            System.out.println("4. Keluar");
            System.out.println("===== >>o<< =====");
            System.out.print("Pilih menu (1-4) : ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.println("===== Tambahkan Data Karyawan =====");
                    System.out.print("Nama\t: ");
                    String nama = sc.nextLine();

                    long id = 0;
                    boolean idValid = false;

                    // Error Handling
                    while (!idValid) {
                        try {
                            System.out.print("id\t: ");
                            id = Long.parseLong(sc.nextLine());

                            String idStr = String.valueOf(id);
                            if (idStr.length() != 8) {
                                throw new IllegalArgumentException("ID harus 8 digit!");
                            }

                            String kodeDivisi = idStr.substring(0, 4);
                            String kodeJabatan = idStr.substring(4);

                            if (!(kodeDivisi.equals("1011") || kodeDivisi.equals("1012") ||
                                  kodeDivisi.equals("1013") || kodeDivisi.equals("1014"))) {
                                throw new IllegalArgumentException("Kode divisi tidak valid!");
                            }

                            if (!(kodeJabatan.equals("0444") || kodeJabatan.equals("0555") ||
                                  kodeJabatan.equals("0666"))) {
                                throw new IllegalArgumentException("Kode jabatan tidak valid!");
                            }

                            idValid = true;
                        } catch (NumberFormatException e) {
                            System.out.println("Format ID harus berupa angka!");
                        } catch (IllegalArgumentException e) {
                            System.out.println("Error: " + e.getMessage());
                        }
                    }

                    System.out.print("Status (Tetap/Kontrak): ");
                    String status = sc.nextLine().toLowerCase();

                    Karyawan k;
                    if (status.equals("tetap")) {
                        k = new KaryawanTetap(nama, id);
                    } else {
                        k = new KaryawanKontrak(nama, id);
                    }

                    
                    if (jumlahKaryawan < daftarKaryawan.length) {
                        daftarKaryawan[jumlahKaryawan] = k;
                        jumlahKaryawan++;
                        System.out.println("[Data Berhasil Disimpan !!]");
                    } else {
                        System.out.println("[Kapasitas data penuh!]");
                    }
                    break;

                case 2:
                    for (int i = 0; i < jumlahKaryawan; i++) {
                        KaryawanInformasi.tampilkanInfo(daftarKaryawan[i]);
                        System.out.println("Status\t: " + (daftarKaryawan[i] instanceof KaryawanTetap ? "Tetap" : "Kontrak"));
                        System.out.println("----------------------------------------");
                    }
                    System.out.println("Total Karyawan = " + jumlahKaryawan);
                    break;

                case 3:
                    System.out.println("==== Cek Data Karyawan ====");
                    System.out.print("Masukkan Nama Karyawan : ");
                    String cariNama = sc.nextLine();
                    System.out.print("Masukkan id Karyawan   : ");
                    long cariId = sc.nextLong();
                    boolean ditemukan = false;

                    for (int i = 0; i < jumlahKaryawan; i++) {
                        if (daftarKaryawan[i].getNama().equalsIgnoreCase(cariNama) &&
                            daftarKaryawan[i].getId() == cariId) {
                            KaryawanInformasi.tampilkanInfo(daftarKaryawan[i]);
                            System.out.println("Status\t: " + (daftarKaryawan[i] instanceof KaryawanTetap ? "Tetap" : "Kontrak"));
                            ditemukan = true;
                            break;
                        }
                    }

                    if (!ditemukan) {
                        System.out.println("[...Data tidak ditemukan !!!]");
                        System.out.println("[...Silahkan cek kembali !!]");
                    }
                    sc.nextLine(); 
                    break;

                case 4:
                    System.out.println("Keluar/Selesai...");
                    break;
            }

        } while (pilihan != 4); 

        sc.close(); 
    }
}