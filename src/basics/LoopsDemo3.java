package basics;

import java.util.Scanner;

public class LoopsDemo3 {
 public static void main(String arg[]) {
  Scanner in = new Scanner(System.in);
  
  String str;
  
  do {
   str = in.next();
   System.out.println("You have entered " + str);
  }
  while(!"quit".equals(str));
  
  System.out.println("You have quit the game ");
 }
}