package basics;

import java.util.Scanner;

public class ConditionsDemo {
 public static void main(String arg[]) {
  Scanner in = new Scanner(System.in);

  System.out.println("Enter your age : ");
  int age = in.nextInt();
  
  if(age >= 18 && age < 60) {
   System.out.println("You are an adult");
  }
  else if(age >= 75) {
   System.out.println("How are you even alive!");
  }
  else if(age >= 60) {
   System.out.println("You are a senior citizen!");
  }
 }
}