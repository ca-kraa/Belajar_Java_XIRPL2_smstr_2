package Latihan3;

import java.util.Scanner;

public class ArrayFor2 {
    public static void main(String[] args) {

        String[] teman = new String[10];
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < teman.length; i++){
            System.out.print(i + ". Masukkan Nama Teman : ");
            teman[i] = scan.nextLine();
        }
        System.out.println("-------------------------");
        for (String t : teman){
            System.out.println("Nama : " + t);
        }
    }
}
