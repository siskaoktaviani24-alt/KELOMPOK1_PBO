package Dosen;

public class Dosen {
    // Atribut
    private String nidn;
    private String nama;
    private String mataKuliah;

    // Constructor
    public Dosen(String nidn, String nama, String mataKuliah) {
        this.nidn = nidn;
        this.nama = nama;
        this.mataKuliah = mataKuliah;
    }

    // Getter dan Setter
    public String getNidn() {
        return nidn;
    }

    public void setNidn(String nidn) {
        this.nidn = nidn;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getMataKuliah() {
        return mataKuliah;
    }

    public void setMataKuliah(String mataKuliah) {
        this.mataKuliah = mataKuliah;
    }

    // Method tampil data
    public void tampilData() {
        System.out.println("NIDN       : " + nidn);
        System.out.println("Nama       : " + nama);
        System.out.println("Mata Kuliah: " + mataKuliah);
        System.out.println("---------------------------");
    }

}
