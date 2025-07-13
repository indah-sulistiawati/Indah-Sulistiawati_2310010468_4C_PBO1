package uaspbo;

public class Karyawan {
    
    // Atribut private untuk enkapsulasi
    private String nama;
    private long id;

    // Constructor 
    public Karyawan(String nama, long id) {
        this.nama = nama;
        this.id = id;
    }

    // Mutator 
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setId(long id) {
        this.id = id;
    }

    // Accessor
    public String getNama() {
        return nama;
    }

    public long getId() {
        return id;
    }

    // Mengidentifikasi divisi berdasarkan ID
    public String getDivisi() {
        String kode = String.valueOf(id).substring(0, 4);
        switch (kode) { //Seleksi
            case "1011": return "Pemasaran";
            case "1012": return "Keuangan";
            case "1013": return "Produksi";
            case "1014": return "Logistik";
            default: return "Tidak Diketahui";
        }
    }

    //Mengidentifikasi jabatan dari ID
    public String getJabatan() {
        String kode = String.valueOf(id).substring(4);
        switch (kode) {
            case "0444": return "Kepala Bagian";
            case "0555": return "Wakil Kepala Bagian";
            case "0666": return "Staf";
            default: return "Tidak Diketahui";
        }
    }

    // Menentukan gaji dari jabatan
    public int getGaji() {
        String kode = String.valueOf(id).substring(4);
        switch (kode) {
            case "0444": return 10000000;
            case "0555": return 8000000;
            case "0666": return 5000000;
            default: return 0;
        }
    }
}
