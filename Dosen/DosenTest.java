package Dosen;

public class DosenTest {
 public static void main(String[] args) {
        // Membuat objek dosen
        Dosen d1 = new Dosen("000505902", "Muhamad Mustamiin, S.Pd.,M.Kom", "Proyek2");
        Dosen d2 = new Dosen("0018018910", "Moh.Ali Fikri, S.Kom., M.Kom ", "Pemograman Web");

        // Menampilkan data dosen
        d1.tampilData();
        d2.tampilData();

        // Contoh mengubah data
        d1.setMataKuliah("Proyek2");
        System.out.println("Setelah update mata kuliah:");
        d1.tampilData();
    }
}