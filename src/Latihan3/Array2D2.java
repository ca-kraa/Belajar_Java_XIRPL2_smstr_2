package Latihan3;

import java.util.Scanner;

public class Array2D2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter The Number Of Rows : ");
        int rows = input.nextInt();
        System.out.print("Enter The Number Of Columns : ");
        int columns = input.nextInt();

        String[][] data = new String[rows][columns];
        for (int i = 0; i < data.length; i++){
            for (int j = 0; j <data[i].length; j++){
                System.out.println("Enter Data For Row " + (i+1) + " column " + (j+1) + " : ");
                data[i][j] = input.next();
            }
        }
        for (int i = 0; i < data.length; i++){
            for (int j = 0; j < data[i].length; j++){
                System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }
    }
}