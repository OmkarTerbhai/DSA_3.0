package arrays;

public class ArraysDemo {
 public static void main(String arg[]) {
  int[] arr = {12, 34, 56, 34};
  
  int i = arr.length - 1;
  
  System.out.println("Printing Array in Reverse");
  while(i >= 0) {
   System.out.print(arr[i] + " ");
   i--;
  }
 }
}