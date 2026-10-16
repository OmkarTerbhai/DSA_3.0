package arrays;

public class SecondMax {
 public static void main(String arg[]) {
  int[] arr = {1,2,4,7,7,5};
  
  solver(arr);
 }
 
 private static void solver(int[] arr) {
  int i = 0;
  int iMax = Integer.MIN_VALUE;
  int iMax2 = iMax;
  
  for(i=0; i < arr.length; i++) {
   if(arr[i] > iMax) {
    iMax2 = iMax;
    iMax = arr[i];
   }
   else if(arr[i] > iMax2 && arr[i] != iMax) {
    iMax2 = arr[i];
   }
  }
  
  System.out.println(iMax);
  System.out.println(iMax2);
 }
}