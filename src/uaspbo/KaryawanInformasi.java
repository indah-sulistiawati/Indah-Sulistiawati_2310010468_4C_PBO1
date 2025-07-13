package uaspbo;

public class KaryawanInformasi {
    public static void tampilkanInfo(Karyawan k) {
        // IO Sederhana
        System.out.println("==== Data Karyawan ====");
        System.out.println("Nama\t: " + k.getNama());
        System.out.println("Id\t: " + k.getId());
        System.out.println("Divisi\t: " + k.getDivisi());
        System.out.println("Jabatan\t: " + k.getJabatan());

        // Polymorphism: pengecekan tipe objek
        if (k instanceof KaryawanTetap) {
            System.out.println("Gaji\t: Rp " + String.format("%,d", ((KaryawanTetap) k).getTotalGaji()).replace(",", "."));
        } else if (k instanceof KaryawanKontrak) {
            System.out.println("Gaji\t: Rp " + String.format("%,d", ((KaryawanKontrak) k).getTotalGaji()).replace(",", "."));
        } else {
            System.out.println("Gaji\t: Rp " + String.format("%,d", k.getGaji()).replace(",", "."));
        }
    }
}