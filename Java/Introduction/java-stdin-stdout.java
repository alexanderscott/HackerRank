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
        int c = 0;
        int i = 0;
        double d = 0.00; 
        String s = "";
        
        while(in.hasNext())
        {
            if (c == 0) { i = in.nextInt(); }
            if (c == 1) { d = in.nextDouble(); }
            if (c > 1) { s = in.nextLine(); }
            
            c++;
        }
        
        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}
