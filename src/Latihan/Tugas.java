package Latihan;

import java.util.Scanner;

public class Tugas {
    public static void main(String[] args) {
        Tugas2 tugas2 = new Tugas2();

        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan NISN : ");
        String nisn = input.nextLine();
        System.out.print("Masukkan Nama : ");
        String nama = input.nextLine();
        System.out.print("Masukkan Tanggal Lahir : ");
        String tgl = input.nextLine();
        System.out.print("Masukkan Tempat Lahir : ");
        String tl = input.nextLine();
        System.out.print("Masukkan Alamat : ");
        String alamat = input.nextLine();
        System.out.print("Masukkan Jurusan: ");
        String jurusan = input.nextLine();
        System.out.print("Masukkan Nama Ibu Kandung : ");
        String ibu = input.nextLine();
        System.out.print("Masukkan Nama Ayah Kandung : ");
        String ayah = input.nextLine();
        System.out.print("Pekerjaan Ayah : ");
        String pa = input.nextLine();
        System.out.print("Pekerjaan Ibu : ");
        String pi = input.nextLine();

        tugas2.setNisn("0063735576");
        tugas2.setNama("Nabil Mufti");
        tugas2.setTl("Payakumbuh");
        tugas2.setTgl("31 Januari 2006");
        tugas2.setAlamat("Harau");
        tugas2.setJurusan("RPL | Rekayasa Perangkat Lunak");
        tugas2.setIbu("-");
        tugas2.setAyah("-");
        tugas2.setPa("-");
        tugas2.setPi("-");

        System.out.println("------------------------------------");

        System.out.println("Masukkan NISN : " + tugas2.getNisn());
        System.out.println("Masukkan Nama : " + tugas2.getNama());
        System.out.println("Masukkan Tanggal Lahir : " + tugas2.getTgl());
        System.out.println("Masukkan Tempat Lahir : " + tugas2.getTl());
        System.out.println("Masukkan Alamat : " + tugas2.getAlamat());
        System.out.println("Masukkan Jurusan: " + tugas2.getJurusan());
        System.out.println("Masukkan Nama Ibu Kandung : " + tugas2.getIbu());
        System.out.println("Masukkan Nama Ayah Kandung : " + tugas2.getAyah());
        System.out.println("Pekerjaan Ayah : " + tugas2.getPa());
        System.out.println("Pekerjaan Ibu : " + tugas2.getPi());

    }
}
