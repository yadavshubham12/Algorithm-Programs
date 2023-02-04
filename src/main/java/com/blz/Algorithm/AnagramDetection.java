package com.blz.Algorithm;
import java.util.Arrays;

public class AnagramDetection {
    public static void main(String[] args) {
        String first = "abcd";
        String second = "dcba";
        System.out.println(areAnagrams(first, second));
    }
    private static boolean areAnagrams(String first, String second) {
        if (first.length() != second.length()) {
            return false;
        }
        char[] firstArray = first.toCharArray();
        char[] secondArray = second.toCharArray();
        Arrays.sort(firstArray);
        Arrays.sort(secondArray);
        return Arrays.equals(firstArray, secondArray);
    }
}

