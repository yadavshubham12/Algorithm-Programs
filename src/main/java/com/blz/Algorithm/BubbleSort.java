package com.blz.Algorithm;
import java.util.Scanner;

    public class BubbleSort {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number of integers: ");
            int n = sc.nextInt();
            int[] ints = new int[n];

            System.out.println("Enter the integers: ");
            for (int i = 0; i < n; i++) {
                ints[i] = sc.nextInt();
            }

            sortIntegers(ints);

            System.out.println("The sorted integers are: ");
            for (int i : ints) {
                System.out.println(i);
            }
        }

        public static void sortIntegers(int[] ints) {
            int n = ints.length;
            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - i - 1; j++) {
                    if (ints[j] > ints[j + 1]) {
                        int temp = ints[j];
                        ints[j] = ints[j + 1];
                        ints[j + 1] = temp;
                    }
                }
            }
        }
    }
