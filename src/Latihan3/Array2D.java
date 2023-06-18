package Latihan3;

public class Array2D {
    public static void main(String[] args) {
    String [] [] kontak = {
            {"Lili" , "08239000"},
            {"Leli" , "0823900"},
            {"Luli" , "08239001"},
    };
        for(int i =0; i < kontak.length; i++){
            System.out.println("Nama : " + kontak[i][0]);
            System.out.println("Kontak : " + kontak[i][1]);
            System.out.println("-------------------");
        }
    }
}
