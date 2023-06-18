package Latihan2;

import java.util.Scanner;

public class Refleksi {
    public static void main(String[] args) {

        Barang barang = new Barang();
        Scanner input = new Scanner(System.in);

        System.out.print("Masukan Harga Tango : ");
        int tango = input.nextInt();
        System.out.print("Masukan Harga Astor : ");
        int astor = input.nextInt();
        System.out.print("Masukan Harga Wafer : ");
        int wafer = input.nextInt();
        System.out.print("Masukan Harga Mie : ");
        int mie = input.nextInt();
        System.out.print("Masukan Harga Roti : ");
        int roti = input.nextInt();
        System.out.print("Masukan Harga Sayur : ");
        int sayur = input.nextInt();

        barang.setHrgAstor(astor);
        barang.setHrgTango(tango);
        barang.setHrgWafer(wafer);
        barang.setHrgMie(mie);
        barang.setHrgRoti(roti);
        barang.setHrgSayur(sayur);

        System.out.println(barang.getTotal());

    }
}
