package com.example.homework4;

import java.util.Arrays;

public class HomeWork_9 {

    public static void main(String[] args) {
// Task_1
        System.out.println("Task_1");
        int[] massive = new int[]{2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        for (int i = 0; i < massive.length; i++) {
            System.out.print(massive[i] + "  ");
        }
        System.out.println();
        for (int i = 0; i < massive.length; i++) {
            System.out.println(massive[i]);
        }

//  Task_2
        System.out.println("Task_2");
        int[] massive2 = new int[50];
        for (int i = 0, n = 1; i < massive2.length; n = n + 2, i++) {
            massive2[i] = n;
            System.out.print(massive2[i] + " ");
        }
        System.out.println();
        for (int i = massive2.length - 1; i >= 0; i--) {
            System.out.print(massive2[i] + " ");
        }
        System.out.println();

// Task_3
        System.out.println("Task_3");
        int[] massive3 = new int[15];
        int x =0;
        for (int i = 0; i < massive3.length; i++) {
            massive3[i] = (int) (Math.random() * 100);
            if (massive3[i] % 2 == 0 && massive3[i] !=0) {
                x++;
            }
            System.out.print(massive3[i] + " ");
        }
        System.out.println();
        System.out.println("In an array of even elements- "+x);

// Task_4
        System.out.println("Task_4");
        int[] massive4 = new int[20];
        for (int i = 0; i < massive4.length; i++) {
            massive4[i] = (int) (Math.random() * 21);
            System.out.print(massive4[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < massive4.length; i++) {
            if (massive4[i] % 2 != 0)
                massive4[i] = 0;
            System.out.print(massive4[i] + " ");
        }
        System.out.println();

// Task_5
        System.out.println("Task_5");
        int maxValue = 0;
        int y = 0;
        int[] massive5 = new int[12];
        for (int i = 0; i < massive5.length; i++) {
            massive5[i] = (int) (Math.random() * 16);
            System.out.print(massive5[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < massive5.length; i++) {
            if (massive5[i] >= maxValue) {
                maxValue = massive5[i];
                y = i;
            }
        }
        System.out.println("Maximum element in array " + massive5[y]);
        System.out.println("The index of its last occurrence in the array " + y);

// Task_6
        System.out.println("Task_6 - sorting an array by bubble method");

        int massive6[] = {21, 71, 55, 20, 29, 5, 7, 10, 19, 18, 23, 70};
        boolean isSorted = false;
        int buffer;
        System.out.println(Arrays.toString(massive6));
        while ((isSorted == false)) {
            isSorted = true;
            for (int i = 0; i < massive6.length - 1; i++) {
                if (massive6[i] > massive6[i + 1]) {
                    isSorted = false;

                    buffer = massive6[i];
                    massive6[i] = massive6[i + 1];
                    massive6[i + 1] = buffer;

                }

            }
            System.out.println(Arrays.toString(massive6));
        }

// Task_7
        System.out.println("Task_7 - sorting an array by insertion method");
        int massive7[] = {88, 39, 22, 44, 65, 1, 12, 54, 67, 20, 2, 9, 39};
        for (int i = 1; i < massive7.length; i++) {
            int current = massive7[i];
            int newValue = i - 1;
            while (newValue >= 0 && current < massive7[newValue]) {
                massive7[newValue + 1] = massive7[newValue];
                newValue--;

            }
            massive7[newValue + 1] = current;
            System.out.println(Arrays.toString(massive7));
        }

    }
}