import java.util.*;


public class Recurssion1{

 
 public static void PrintNumber1(int n){
     if(n== 0){
     	return ;
      } 

      	System.out.println(n);
      	PrintNumber1(n-1);
      
 }  
 public static void PrintNumber2(int n){
   
 	if(n == 6){
 		return;
 	}

 	System.out.println(n);
 	PrintNumber2(n+1);
 } public static void SumOfNum(int n, int sum){


   if(n == 0){
    return;
   }

   sum += n;
  System.out.println(sum);
  SumOfNum(n-1,sum);

  
   
 }  public static void Factorial(int n, int fact){
    if(n ==0){

        
        return;

    }

    fact *= n;


    System.out.println( fact);
    Factorial(n-1, fact);


 }   public static void Fibanacci(int a,int b,int c){
    if(c == 0){
        return;
    } System.out.println(a);
      Fibanacci( b, a+b, c-1);
 }   public static int PowerToX(int a,int b){

    if(a == 0){
        return 0;
    }
    if(b == 0){
        return 1;
    }

    int power = PowerToX(a, b-1);
    int xn  = a * power;
    return xn;
 }

public static void main(String[] args) {

   Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
   System.out.print("Print number from " + n + " to 1  : ");
   System.out.println();
   PrintNumber1(n);
  
   
System.out.println("_________________________________________________");

 PrintNumber2(1);
 System.out.println("_________________________________________________");
SumOfNum(5,0);
System.out.println("_________________________________________________");
Factorial(5,1);
System.out.println("_________________________________________________");
Fibanacci(0,1,n);
  System.out.println("__________________________________________________");
  System.out.println(PowerToX(10,2));


 
}

}