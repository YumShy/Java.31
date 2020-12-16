package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {


        int rSize = 1 + (int) (Math.random() * 9);

        int[][] arr = new int[rSize][rSize];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = 1 + (int) (Math.random() * 9);
            }
        }

        printArr(arr);
        System.out.println();
        printArrPair(arr);
        System.out.println();

        int[] _arrStep = fillArr(0, 10, 2);
        System.out.println(Arrays.toString(_arrStep));
    }

    private static void printArr(int[][] arr) {
        for (int[] _someArr : arr) {
            for (int _somethingArray : _someArr) {
                System.out.print( _somethingArray + " ");
            }
            System.out.println();
        }
    }

    private static void printArrPair(int[][] arr) {
        for (int[] _someArr : arr) {
            for (int _somethingArray : _someArr) {
                if (_somethingArray % 2 == 0) {
                    System.out.print(_somethingArray + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    private static int[] fillArr(int begin, int end, int step) {
        int[] arr = new int[end / step + 1];

        int n = begin;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = n;
            n = n + step;
        }

        return arr;
    }
}