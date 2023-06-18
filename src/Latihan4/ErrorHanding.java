package Latihan4;

public class ErrorHanding {

    public static void main(String[] args) {
        try {
            int [] angka = {
                    1,2,3,4
            };
            System.out.println(angka[1]);
        } catch (Exception e) {
            System.out.println("Terjadi Error -> " + e);
        }
    }
}
