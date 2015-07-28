// https://www.hackerrank.com/challenges/phone-book

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        HashMap<String, Integer> phoneBook = new HashMap<String, Integer>();
        Scanner in = new Scanner(System.in);

        int entries = 0;
        int i = 0;
        
        while(in.hasNextLine()) {
            if (i == 0) {
                entries = Integer.parseInt(in.nextLine());
            } else if (i <= entries) {
                String key = in.nextLine();
                int num = Integer.parseInt(in.nextLine());
                phoneBook.put(key, num);
            } else {
                String key = in.nextLine();
                if (phoneBook.containsKey(key)) {
                    System.out.println(key + "=" + phoneBook.get(key));
                } else {
                    System.out.println("Not found");
                }
            }

            i += 1;
        }
    }
}

