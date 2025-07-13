package uaspbo;

// Inheritance dari Karyawan
public class KaryawanTetap extends Karyawan {
    private int tunjangan;

    public KaryawanTetap(String nama, long id) {
        super(nama, id);
        this.tunjangan = 1000000; // Tunjangan tetap
    }

    public int getTotalGaji() {
        return getGaji() + tunjangan;
    }
}