package arrays;

public class IsArraySorted {
 public static void main(String arg[]) {
  int[] arr = {23, 45, 67, 91};
  
  System.out.println(solver(arr));
 }
 
 private static boolean solver(int[] arr) {
  if(arr == null || arr.length == 1) return true;
  int n = arr.length;
  for(int i = 1; i < n; i++) {
   if(arr[i] < arr[i-1])
    return false;
  }
  return true;
 }
}