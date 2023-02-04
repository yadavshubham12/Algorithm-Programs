package com.blz.Algorithm;
    import java.util.Scanner;

    public class GuessNumber {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the number N: ");
            int n = sc.nextInt();
            int low = 0, high = n - 1;
            System.out.println("Think of a number between 0 and " + (n - 1) + " inclusive.");
            while (low <= high) {
                int mid = (low + high) / 2;
                System.out.print("Is your number less than or equal to " + mid + "? (yes/no): ");
                String answer = sc.next();
                if (answer.equalsIgnoreCase("yes")) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
            System.out.println("Your number is: " + low);
        }
    }