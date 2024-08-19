import java.util.*;


public class StringBuilderInJava{



 public static void ReverseString(String strings) {
   StringBuilder sb = new StringBuilder(strings);
     for (int i = 0;i<sb.length()/2; i++ ) {
       
     
       int front = i;
       int back = sb.length() -i - 1;
   

   char FrontChar = sb.charAt(front);
   char BackChar = sb.charAt(back);

   sb.setCharAt(front , BackChar);
   sb.setCharAt(back, FrontChar);

}
 System.out.println(sb);
  
  
 }
  
   public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter string to revese : ");
    String strings = sc.next();
    ReverseString(strings);
   
   
   }
}