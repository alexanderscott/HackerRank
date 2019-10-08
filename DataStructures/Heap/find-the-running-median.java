package Heap;

// https://www.hackerrank.com/challenges/find-the-running-median/problem

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

class RunningMedianSolution {
    private static PriorityQueue<Integer> minRightHeap = new PriorityQueue<>();
    private static PriorityQueue<Integer> maxLeftHeap = new PriorityQueue<>(Comparator.reverseOrder());

    static void addNum(int num) {
        minRightHeap.offer(num);
        maxLeftHeap.offer(minRightHeap.poll());

        if(minRightHeap.size() < maxLeftHeap.size()){
            minRightHeap.offer(maxLeftHeap.poll());
        }
    }

    static double findMedian() {
        if(minRightHeap.size() > maxLeftHeap.size()){
            return minRightHeap.peek();
        } else {
            return (minRightHeap.peek()+maxLeftHeap.peek())/2.0;
        }
    }

    private static double round (double value, int precision) {
        int scale = (int) Math.pow(10, precision);
        return (double) Math.round(value * scale) / scale;
    }

    static double[] runningMedian(int[] a) {
        int aLength = a.length;
        double[] medians = new double[aLength];

        for (int i = 0; i < aLength; i++) {
            addNum(a[i]);
            medians[i] = round(findMedian(), 10);
        }

        return medians;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int aCount = Integer.parseInt(scanner.nextLine().trim());

        int[] a = new int[aCount];

        for (int aItr = 0; aItr < aCount; aItr++) {
            int aItem = Integer.parseInt(scanner.nextLine().trim());
            a[aItr] = aItem;
        }

        double[] result = runningMedian(a);

        for (int resultItr = 0; resultItr < result.length; resultItr++) {
            bufferedWriter.write(String.valueOf(result[resultItr]));

            if (resultItr != result.length - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();
    }
}
