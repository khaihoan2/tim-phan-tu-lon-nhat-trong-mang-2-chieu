package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào số dòng của mảng 2 chiều: ");
        int sizeRow = scanner.nextInt();
        System.out.print("Nhập vào số cột của mảng 2 chiều:");
        int sizeCol = scanner.nextInt();

        int arr[][] = new int[sizeRow][sizeCol];
        for (int i = 0; i < sizeRow; i++) {
            for (int j = 0; j < sizeCol; j++) {
                System.out.print("Phần tử thứ [" + i + "][" + j + "] :");
                arr[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Mảng 2 chiều vừa nhập là");

        for (int i = 0; i < sizeRow; i++) {
            for (int j = 0; j < sizeCol; j++) {
                System.out.println("Phần tử thứ [" + i + "][" + j + "] : " + arr[i][j]);
            }
        }

        int max = arr[0][0];
        for (int i = 0; i < sizeRow; i++) {
            for (int j = 0; j < sizeCol; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }

        System.out.println(max);

    }
}
