package org.example.learning.utils;

import java.util.List;

/**
 * Created by User on 19.05.2025
 */
public class ListUtils {

    public static void printList(List<?> list) {
        for (Object item : list) {
            System.out.print(item + " ");
        }
        System.out.println();
    }

    public static int sumList(List<Integer> list) {
        return list.stream().mapToInt(Integer::intValue).sum();
    }
}