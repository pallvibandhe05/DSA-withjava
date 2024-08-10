import java.util.*;


public class Function1{//functon to print name
   public static void PrintMyName(String name,String surname){
    System.out.print("My name is : ");
    System.out.println(name +" "+ surname);
    return;
   } //fun to add two nums
  public static int  AddNum(int num1, int num2){
    int sum = num1 + num2;
      
      System.out.print("sum = ");
      System.out.println(sum);
      return sum;-

  }
   public static int MultiplyNum(int num1, int num2){
    int product = num1*num2;
    System.out.print("product = ");
    System.out.println(product);
    return product;


   }

   public static int Factorial(int j){

   int fact= 1;
    if(j == 0 || j == 1){
        return 1;
    } for(int i = j; i>=1;i--){
       fact = fact*i;
    }
    System.out.print("Factorial of given numbver is :");
    System.out.print(fact);
    return fact;

    }
   
   

    public static void main(String []args){
       Scanner sc = new Scanner(System.in);
       String name = sc.next();
       String surname = sc.next();

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int j = sc.nextInt();
     PrintMyName(name , surname);
     AddNum(num1,num2);
     MultiplyNum(num1,num2);
     Factorial(j);



    }
}