package basics;

import java.io.*;
import java.math.BigInteger;

public class UserIO {

 public static void main(String arg[]) {
  int iNo;
  float fNo;
  double dNo;
  char c;
  String str;
  BigInteger bNo;
  
  InputStreamReader is = new InputStreamReader(System.in);
  
  try(BufferedReader br = new BufferedReader(is)) {
   iNo = Integer.parseInt(br.readLine()); 
   System.out.println("Integer Input is : " + iNo);
   
   fNo = Float.parseFloat(br.readLine());
   System.out.println(fNo);
   
   dNo = Double.parseDouble(br.readLine());
   System.out.println("Double value is : "+dNo);
   
   c = (char) br.read();
   System.out.println("Char is : " + c);
   br.readLine();
   str = br.readLine();
   System.out.println("String is : " + str);
   
   bNo = new BigInteger(br.readLine());
   System.out.println("BigInt is " + bNo);
   
  }
  catch(Exception e) {
   System.out.println(e.getMessage());
  } 
 }
}