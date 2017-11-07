// https://www.hackerrank.com/challenges/java-md5

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Scanner;
import java.security.*;

public class Solution {

    public static void main(String[] args) throws NoSuchAlgorithmException {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        MessageDigest md = MessageDigest.getInstance("MD5");
        md.update(str.getBytes(), 0, str.length());
        System.out.println(new BigInteger(1, md.digest()).toString(16));
        return;
    }
}
