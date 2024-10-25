package ru.job4j.array;

public class TwoNumberSum {
    public static int[] getIndexes(int[] array, int target) {
        int[] result = new int[2];
        boolean flag = false;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == target && i != j) {
                    result[0] = i;
                    result[1] = j;
                    flag = true;
                    break;
                }
            }
        }
        if (flag) {
            return result;
        } else {
            return new int[0];
        }
    }
}