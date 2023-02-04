package com.blz.Algorithm;
import java.util.Scanner;

    public class InsertionSorting {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number of words: ");
            int n = sc.nextInt();
            String[] words = new String[n];
            sc.nextLine();

            System.out.println("Enter the words: ");
            for (int i = 0; i < n; i++) {
                words[i] = sc.nextLine();
            }
            sortWords(words);
            System.out.println("The sorted words are: ");
            for (String word : words) {
                System.out.println(word);
            }
        }
        public static void sortWords(String[] words) {
            int n = words.length;
            for (int i = 1; i < n; i++) {
                String key = words[i];
                int j = i - 1;
                while (j >= 0 && key.compareTo(words[j]) < 0) {
                    words[j + 1] = words[j];
                    j--;
                }
                words[j + 1] = key;
            }
        }
    }

