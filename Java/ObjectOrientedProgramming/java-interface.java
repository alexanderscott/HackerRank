// https://www.hackerrank.com/challenges/java-interface

class MyCalculator implements AdvancedArithmetic {
    public int divisorSum(int n) {
        int sum = 1;  
        if (n != 1) sum += n; // since we know divisible by 1 and itself (unless 1)
        for(int i = 2; i <= (int)Math.sqrt(n); i++) {
            if(n % i == 0) {
                sum += i;
                int d = n/i;
                if(d != i) sum+=d;
            }
        }
        return sum;
    }
} 
