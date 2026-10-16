package arrays;

import java.util.Arrays;

/**
 * Iterate at each index(i) (n-1)
 * At each index, go till non-equal element(j)
 * Array is sorted
 * once non equal is found, put arr[i+1] == arr[j]
 */
public class RemoveDuplicatesOptimal {
 public static void main(String[] arg) {
  int[] arr = {1,1,1,2};
  System.out.println(Arrays.toString(solve(arr)));
 }
 
 private static int[] solve(int[] arr) {
  int n = arr.length;
  if(arr == null) return new int[] {};
  if(arr.length == 1) return arr;
  
  int i = 0, j = 1;
  while(i < n - 1) {
   while(j < n-1 && arr[i] == arr[j]) {
    j++;
   }
   arr[i+1] = arr[j];
   i++;
  }
  return arr;
 }
}