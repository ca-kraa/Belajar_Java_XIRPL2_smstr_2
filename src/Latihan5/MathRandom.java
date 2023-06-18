package Latihan5;

import java.util.HashMap;

public class MathRandom {
    public static void main(String[] args) {
        HashMap<String, Double> nilaiSiswa = new HashMap<String, Double>();
        nilaiSiswa.put("Siswa A" , generateNilaiRandom());
        nilaiSiswa.put("Siswa B" , generateNilaiRandom());
        nilaiSiswa.put("Siswa C" , generateNilaiRandom());
        nilaiSiswa.put("Siswa D" , generateNilaiRandom());

        System.out.println("Daftar Nilai Siswa : ");
        for (String siswa : nilaiSiswa.keySet()) {
            System.out.println(siswa + " : " + nilaiSiswa.get(siswa));
        }
    }

    public static double generateNilaiRandom(){
        return Math.random() * 100;
    }
}
