// https://www.hackerrank.com/challenges/java-generics

class Printer {
   <T> void printArray(T[] arr){
       for (T item : arr){
           System.out.println(item);
       }
   }
}
