package com.blz.Algorithm;

import java.util.ArrayList;
import java.util.List;

public class MergeSort {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of("apple", "banana", "cherry", "dog", "elephant"));
        sort(list, 0, list.size());
        System.out.println(list);
    }

    private static void sort(List<String> list, int lo, int hi) {
        if (hi - lo < 2) {
            return;
        }
        int mid = lo + (hi - lo) / 2;
        sort(list, lo, mid);
        sort(list, mid, hi);
        merge(list, lo, mid, hi);
    }

    private static void merge(List<String> list, int lo, int mid, int hi) {
        List<String> temp = new ArrayList<>(hi - lo);
        int i = lo, j = mid;
        while (i < mid && j < hi) {
            if (list.get(i).compareTo(list.get(j)) < 0) {
                temp.add(list.get(i++));
            } else {
                temp.add(list.get(j++));
            }
        }
        while (i < mid) {
            temp.add(list.get(i++));
        }
        while (j < hi) {
            temp.add(list.get(j++));
        }
        for (i = lo, j = 0; i < hi; i++, j++) {
            list.set(i, temp.get(j));
        }
    }
}

