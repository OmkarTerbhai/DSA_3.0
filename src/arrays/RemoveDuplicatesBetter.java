package arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesBetter {
 public static void main(String[] arg) {
  int[] arr = {1,1,1,2,3,3,4};
  
  System.out.println(removeDuplicates(arr));
  System.out.println(Arrays.toString(arr));
 }
 
 private static int removeDuplicates(int[] arr) {
  Set<Integer> st = new HashSet<>();
  
  for(int ele : arr) {
   st.add(ele);
  }
  return st.size();
 }
}