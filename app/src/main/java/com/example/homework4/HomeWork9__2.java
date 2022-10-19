package com.example.homework4;

import java.util.Arrays;
import java.util.Random;

public class HomeWork9__2 {

    public static void main(String[] args) {
        Task_1();
        Task_2();
        Task_3();
        Task_4();
    }

    public static void Task_1() {
        System.out.println("Task_1");
        int[][] massive2D = new int[4][3];
        massive2D[0][0] = 1;
        massive2D[0][1] = 2;
        massive2D[0][2] = 3;
        massive2D[1][0] = 4;
        massive2D[1][1] = 5;
        massive2D[1][2] = 6;
        massive2D[2][0] = 7;
        massive2D[2][1] = 8;
        massive2D[2][2] = 9;
        massive2D[3][0] = 10;
        massive2D[3][1] = 11;
        massive2D[3][2] = 12;

        for (int i = 0; i < massive2D.length; i++) {
            for (int j = 0; j < massive2D[i].length; j++) {
                System.out.print(massive2D[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void Task_2() {
        System.out.println("Task_2");
        int[][][] massive3D = {
                {{2, 4, 6, 8},
                        {1, 3, 6, 9, 12, 15}
                },
                {
                        {5, 10, 15}
                }
        };
        for (int i = 0; i < massive3D.length; i++) {
            for (int j = 0; j < massive3D[i].length; j++) {
                for (int x = 0; x < massive3D[i][j].length; x++) {
                    System.out.print(massive3D[i][j][x] + "\t");
                }
                System.out.println();
            }

        }
        for (int i = 0; i < massive3D.length; i++) {
            for (int j = 0; j < massive3D[i].length; j++) {
                for (int x = 0; x < massive3D[i][j].length; x++) {
                    System.out.print(massive3D[i][j][x] + "\t");
                }

            }

        }

    }

    public static void Task_3() {
        System.out.println();
        System.out.println("Task_3");
        int[][] numbers = new int[][]{{5, 6, 3, 8}, {1, 4, 2, 8}};
        Arrays.sort(numbers[0]);
        {
            System.out.println(Arrays.toString(numbers[0]));
        }
        for (int i = 0; i < numbers.length; i++) {

            for (int j = numbers.length - 1; j >= 1; j--) {
                System.out.print(Arrays.toString(numbers[j]) + " \t");
            }
            System.out.println();
        }

    }

    public static void Task_4() {
        System.out.println("Task_4");

        int[][][] mass3D = new int[4][4][4];
        Random random = new Random();

        for (int i = 0; i < mass3D.length; i++) {
            for (int j = 0; j < mass3D[i].length; j++) {
                for (int x = 0; x < mass3D[i][j].length; x++) {
                    mass3D[i][j][x] = random.nextInt(10);
                    System.out.print(mass3D[i][j][x] + "\t");
                }
                System.out.println();
            }
            System.out.println();
        }
    }


}
