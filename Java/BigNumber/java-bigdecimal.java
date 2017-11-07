// https://www.hackerrank.com/challenges/java-bigdecimal

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numCases = in.nextInt();
        int i = 0;
        List<BigDecimal> list = new ArrayList<BigDecimal>();
        while(i < numCases)
        {
            list.add(new BigDecimal(in.next()));
            i++;
        }
        
        Collections.sort(list, Collections.reverseOrder());
        
        for(BigDecimal d : list){
            // remove leading zeros
            System.out.println(d.toString().replaceAll( "^0(\\..*)$", "$1" ));
        }
    }
}
