package Latihan;

import java.util.Scanner;

public class Login2 {

    public static void main(String[] args) {
        Login login = new Login();

        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Username : ");
        String username = input.next();
        System.out.print("Masukkan Password : ");
        String password = input.next();

        login.setUsername("Anhay");
        login.setPassword("12345678");

        System.out.println("Username : " + login.getUsername());
        System.out.println("Password : " + login.getPassword());
    }
}
