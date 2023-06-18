package Latihan4;

public class ErrorHanding3 {
    static void checkUmur(int umur) {
        if (umur > 18) {
            throw new ArithmeticException("Kamu dizinkan masuk , umur kamu telah mencukupi");
        } else {
            System.out.println("Kamu tidak dizinkan masuk, Karena Umur Belum Cukup");
        }
    }

    public static void main(String[] args) {
        checkUmur(12);
    }
}