package basics;

import java.util.Scanner;

public class SwitchDemo {

 public static void main(String arg[]) {
  
  Scanner in = new Scanner(System.in);
  String dayOfWeek = in.next();
  
  switch(dayOfWeek) {
   case "Monday" -> {
    System.out.println("Office day today");
    System.out.println("Book office transport");
    System.out.println("Book office desk");
   }
   case "Tuesday" -> {
    System.out.println("Office day today");
    System.out.println("Book office transport");
    System.out.println("Book office desk");
   }
   
   case "Wednesday" -> System.out.println("Work from home");
   
   case "Thursday" -> System.out.println("Work from home");
   
   case "Friday" -> System.out.println("Work from home");
  }
 }
}