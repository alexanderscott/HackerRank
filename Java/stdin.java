// https://www.hackerrank.com/challenges/java-stdin

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i = in.nextInt();
        double d = in.nextDouble();
        String s = "";
        while(in.hasNext()) {
            s = s + in.next() + " ";
        }
        
        System.out.println("String: " + s.substring(0, s.length() - 1));
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}
