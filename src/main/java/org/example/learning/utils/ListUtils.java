package org.example.learning.utils;

import java.util.List;

/**
 * Created by User on 19.05.2025
 */
@SuppressWarnings("unused")
public class ListUtils {

    @SuppressWarnings("unused")
    public static void printList(List<?> list) {
        for (Object item : list) {
            PrintUtils.printLine(item+" ");
        }
        PrintUtils.printEmptyLine();
    }

    @SuppressWarnings("unused")
    public static int sumList(List<Integer> list) {
        return list.stream().mapToInt(Integer::intValue).sum();
    }
}