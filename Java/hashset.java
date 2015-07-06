import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        
        HashSet<String> hs = new HashSet<>();
        Scanner scan= new Scanner(System.in);

        int lineRead = 0;
        int numLines = 0;

        while(scan.hasNextLine()) {
            String input = scan.nextLine();
            lineRead++;
            if (lineRead == 1) {
                numLines = Integer.parseInt(input);
            } else {
                hs.add(input);
                System.out.println(hs.size());
            }
        }
    }
}
