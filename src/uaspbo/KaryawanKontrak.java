package uaspbo;

// Inheritance dari class Karyawan
public class KaryawanKontrak extends Karyawan {
    
    // Constructor
    public KaryawanKontrak(String nama, long id) {
        super(nama, id);
    }

    // Total gaji sama dengan gaji pokok
    public int getTotalGaji() {
        return getGaji();
    }
}