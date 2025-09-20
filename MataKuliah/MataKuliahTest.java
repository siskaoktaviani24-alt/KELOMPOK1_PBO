package MataKuliah;

public class MataKuliahTest {
    public static void main(String[] args) {
        MataKuliah mk1 = new MataKuliah("PBO12", "Pemrograman Berbasis Objek", 3);
        System.out.println("Mata Kuliah: " + mk1.nama + " (" + mk1.kode + "), SKS: " + mk1.sks);

        MataKuliah mk2 = new MataKuliah("PWL12", "Pemrograman Web Lanjut", 3);
        System.out.println("Mata Kuliah: " + mk2.nama + " (" + mk2.kode + "), SKS: " + mk2.sks);
    }
}
