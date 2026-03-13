package org.example;

public class Question1 {

    public static int longestIncreasingSequencep(int[] arr) {
        if (arr == null || arr.length == 0) {
            return 0;
        }

        int current = 1;
        int max = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i - 1]) {
                current++;
                if (current > max) {
                    max = current;
                }
            } else {
                current = 1;
            }
        }

        return max;

    }

    // סעיף ב

    public static int maxSubArraySum(int[] arr) {
        if (arr == null || arr.length == 0) {
            return 0;
        }

        int maxSum = 0;
        int currentSum = 0;

        for (int i = 1; i < arr.length; i++) {

            currentSum = currentSum + arr[i];
            if (currentSum > maxSum) {
                maxSum = currentSum;
            }

            if (currentSum < 0) {
                currentSum = 0;
            }
        }

        return maxSum;
    }
}