package Queues;

// https://www.hackerrank.com/challenges/queue-using-two-stacks/problem

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


class QueueUsingTwoStacksSolution {
    static class QueueUsingTwoStacks {
        private Deque<Integer> inStack;
        private Deque<Integer> outStack;

        public QueueUsingTwoStacks() {
            this.inStack = new ArrayDeque<>();
            this.outStack = new ArrayDeque<>();
        }

        public void insert(Integer x) {
            // Insert element into inStack
            this.inStack.push(x);
        }

        public Integer remove() {
            if(this.outStack.isEmpty()) {
                while (!this.inStack.isEmpty()) {
                    this.outStack.push(this.inStack.pop());
                }
            }
            return this.outStack.pop();
        }

        public Integer peek() {
            if(this.outStack.isEmpty()) {
                while (!this.inStack.isEmpty()) {
                    this.outStack.push(this.inStack.pop());
                }
            }
            return this.outStack.peek();
        }
    }


    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int tests = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        QueueUsingTwoStacks queue = new QueueUsingTwoStacks();

        for (int testsItr = 0; testsItr < tests; testsItr++) {
            int typeInt = scanner.nextInt();

            if (typeInt == 1) {
                queue.insert(scanner.nextInt());
            } else if (typeInt == 2) {
                queue.remove();
            } else if (typeInt == 3) {
                System.out.println(queue.peek());
            }
        }

        scanner.close();
    }
}
