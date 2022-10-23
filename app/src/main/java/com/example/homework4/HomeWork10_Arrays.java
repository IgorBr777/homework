package com.example.homework4;

import java.util.Arrays;

public class HomeWork10_Arrays {

    public static void main(String[] args) {
        int [] [] numbers = {{3,1,4}, {6,2,5}, {7,9,8}};

        for (int[] number1D:numbers){
            Arrays.sort(number1D);
            for ( int number:number1D){
                System.out.print(number+ "");
            }

        }

        System.out.println();

        for (int[] number1D:numbers) {
            for (int number =0; number<number1D.length; number++){
                System.out.print(number1D[number1D.length-1-number] + "");

            }
        }

    }
}
