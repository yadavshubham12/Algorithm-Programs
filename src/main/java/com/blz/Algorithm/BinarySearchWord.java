package com.blz.Algorithm;

import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchWord {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner fileScanner = new Scanner(new File("Word.txt"));
        String[] words = fileScanner.nextLine().split(",");
        Arrays.sort(words);

        Scanner userScanner = new Scanner(System.in);
        System.out.println(" Enter the word to search: ");
        String searchWord = userScanner.nextLine();
        int result = Arrays.binarySearch(words, searchWord);

        if (result >= 0){
        System.out.println("Word found at index " + result);
    }
        else {
            System.out.println(" Word not found ");
        }
    }
}
