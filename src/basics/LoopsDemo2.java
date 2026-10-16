package basics;

import java.util.Scanner;

public class LoopsDemo2 {

 
 public static void main(String arg[]) {
  Scanner in = new Scanner(System.in);
    
  int iNo = 1;
  
  while(iNo % 2 != 0) {
   System.out.println("Odd Number " + iNo + " entered");
   iNo = in.nextInt();
  }
  System.out.println("Even Number " + iNo + " entered");
 }
}