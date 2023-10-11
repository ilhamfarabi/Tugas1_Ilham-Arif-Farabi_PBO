package Tugas1_mahasiswa;

public class nilai {
    float Nilai(float absennya, float tugasnya, float utsnya, float uasnya){
            float nilaiAkhir = (absennya * 10 / 100) + (tugasnya * 20 / 100) + (utsnya * 30 / 100) + (uasnya * 40 / 100);
        return nilaiAkhir;
    }
    void CetakNilai(String nim, String nama, float absen, float tugas, float uts, float uas){
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Nilai Absen[10%]: " + absen);
        System.out.println("Nilai Tugas[20%]: " + tugas);
        System.out.println("Nilai UTS[30%]: " + uts);
        System.out.println("Nilai UAS[40%]: " + uas);
        System.out.println("Nilai Akhir: " + Nilai(absen, tugas, uts, uas));
    }
}
