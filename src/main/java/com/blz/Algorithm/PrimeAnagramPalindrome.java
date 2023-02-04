package com.blz.Algorithm;
import java.util.Arrays;


public class PrimeAnagramPalindrome {

        public static void main(String[] args) {
            for (int i = 2; i <= 1000; i++) {
                if (isPrime(i)) {
                    String str = Integer.toString(i);
                    if (isPalindrome(str) && isAnagram(str, reverseString(str))) {
                        System.out.println(i);
                    }
                }
            }
        }

        private static boolean isPrime(int num) {
            if (num < 2) {
                return false;
            }
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    return false;
                }
            }
            return true;
        }

        private static boolean isPalindrome(String str) {
            int length = str.length();
            for (int i = 0; i < length / 2; i++) {
                if (str.charAt(i) != str.charAt(length - i - 1)) {
                    return false;
                }
            }
            return true;
        }
        private static boolean isAnagram(String first, String second) {
            char[] firstArray = first.toCharArray();
            char[] secondArray = second.toCharArray();
            Arrays.sort(firstArray);
            Arrays.sort(secondArray);
            return Arrays.equals(firstArray, secondArray);
        }
        private static String reverseString(String str) {
            return new StringBuilder(str).reverse().toString();
        }
    }
