//1 enter 3 num from user anf calc avg
//2 write a fun to print the sum of all odd num from 1 to n
//3 write a fun which takes 2 num and return greater value
//4 write a fun wich takes radius as input and return circumference of circle
//5 write a fun that takes age as input and return eligibility if person is age of voting or not 
//6 write an infilnite loop using do while conditon
//7 write a program to enter the numbers till the user wants and at the end it should display count of positive num, negative num and zeros
//8 write a function that return value of one raised to the power of another x^n
//9 write a fun that returns greaeter common divisor of 2 nums
//10 write a function to print fibannaci series of n nums

  

  import java.util.*;
  import java.util.Scanner;
  import java.util.Arrays;
  import static java.lang.System.out;
  

  public class Function2{ 
    Scanner sc = new Scanner(System.in);
   
   public  static int FunAvg(int num1,int num2,int num3){
    
     int avg = (num1 + num2 + num3)/3;

     System.out.print("Average of given numvbers is : ");
     System.out.println(avg);

     return avg;

   } 
   
    public static int FunSum(int n){

   	   int sum = 0;
   	   for(int i = 1;i<=n;i++){
   	   	if(i % 2 == 1){
   	   		sum += i;
   	   	}
   	   }
   	   System.out.print("The sum of odd numbers from 1 to n =");
   	   System.out.println(sum);
   	   return sum;
   }
    

   public static int FunGreater(int a, int b){
   	 int great = 0;
   	 if(a!=b){
   	      if(a > b){
   	 	great = a;
   	      }else{
   	 	great = b;
   	      }   
       
   System.out.print("Greater value is :");
   	 System.out.println(great);
   	}
   	 else{
   	 	System.out.print("Both numbers are same");
   	 }
   	
   	
   	 return great;
   } 

   public static float FunCircle(float r){
   	   float circle = 2*r ;
   	   circle *= 3.14;

   	   System.out.print("Circumferene of given circle is :");
   	   System.out.println(circle);
   	   return circle;
    }

    public static void FunVoting(int age){
      if(age>18){
        System.out.println("The person is eligible for voting");

      } else{
        System.out.println("The person is not eligible for voting");
      }
      return;
    }
    public static void FunInfinite(int k){
      for(int i = k;i>=1;i++){
        System.out.print("*");
      }
      return;
    }

    public static void FunCount(int j){
      Scanner sc = new Scanner(System.in);
        int num[]= new int[j];
       
       for(int i = 0;i<j;i++){

       num[i]= sc.nextInt();

      }
      int count1 = 0;
       int count2 = 0;
       int count3 = 0;

      for(int k =0;k<num.length;k++){
       if(num[k] < 0){
        count1++;

       }if(num[k] == 0){
        count2++;
       }if(num[k] >0){
        count3++;
       }
       
    }
       System.out.print("Total positive numbers are = ");
       System.out.println(count3);
       System.out.print("Total negative numbers are = ");
       System.out.println(count1);
       System.out.print("Total number of zeros are = ");
       System.out.println(count2);

       return ;
    }   public static int FunPower(int x,int n){
    

      int power;
      power = (int)Math.pow(x,n);
      System.out.println("x to power n is = " + power);

      return power;


    } public static int FunComDiv(int num1 ,int num2){
     int div = 0;
     for(int i =2 ;i<=num1 && i<=num2;i++){
      if(num1 % i == 0 && num2 % i== 0){
        div = i;
      }else {
        div = 1;
      }
    }
      
       

      System.out.println("the greatest common divisor of both numbers is = " + div);

      return div;
    }

    public static void FunFib(int n){
    
      int fib, fib0=0,fib1=1;
      System.out.print(" "+fib0+"  "+fib1+" ");
      for(int i = 1;i<=n;i++){

        fib = fib0 + fib1;
        fib0 = fib1;
        fib1 = fib;
        System.out.print(" "+fib+" ");
     
       
      
    } 
  return;
      }
  
    



  	  public static void main(String []args){
  	 	Scanner sc = new Scanner(System.in); 
  		System.out.print("Enter first number : ");
  		int num1 = sc.nextInt();
 
  		 System.out.print("Enter second number : ");
  		 int num2 = sc.nextInt();
  		System.out.print("Enter third number : ");
  		int num3 = sc.nextInt();
        FunAvg(num1,num2,num3);
         System.out.println("____________________________________________________________________");
        System.out.print("enter value of n = ");
        int n = sc.nextInt();
        FunSum(n);
         System.out.println("____________________________________________________________________");
        System.out.print("Enter first value to compare : ");
        int a = sc.nextInt();
        System.out.print("Enter second vslue to compare : ");
        int b = sc.nextInt();
        FunGreater(a,b);
         System.out.println("____________________________________________________________________");

         System.out.print("Enter radius of the circle = ");
         float r = sc.nextFloat();
        FunCircle(r);
         System.out.println("____________________________________________________________________");
        System.out.print("Enter age of the person : ");
        int age = sc.nextInt();
        FunVoting(age);
      System.out.println("____________________________________________________________________");
       /*System.out.print("Emter value for k : ");
       int k = sc.nextInt();
       FunInfinite(k);
       System.out.println("____________________________________________________________________");*/

      System.out.print("Enter length of array :");
    
       int j = sc.nextInt();
      
           FunCount(j);
           System.out.println("____________________________________________________________________");
           System.out.print("Enter value of x :");
       int x = sc.nextInt();
      System.out.print("Enter value of n :");
      int y = sc.nextInt();
           FunPower(x,y);
           System.out.println("____________________________________________________________________");


        System.out.print("enter first divedent : ");
        int n1= sc.nextInt();
        System.out.print("enter second divident : ");
        int n2 = sc.nextInt();
        FunComDiv(n1,n2);
        System.out.println("____________________________________________________________________");

        System.out.print("Enter value of n for Fibannacci series : ");
        int m = sc.nextInt();
        FunFib(m);
         System.out.println("____________________________________________________________________");
  	}
  }