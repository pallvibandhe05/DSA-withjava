import java.util.*;


public class BitManipulation{

  public static void GetBit(int n,int pos){

 
  	int bitMask = 1<<pos;

  	if((bitMask & n) == 0){
  		System.out.println("bit value is 0");
  	}else{
  		System.out.println("bit value is 1");
  	}


  }public static void SetBit(int n, int pos){
 int bitMask = 1<<pos;

 int newBit = bitMask | n;

 System.out.println("new number is : " + newBit);
  }

  public static void ClearBit(int n ,int pos){

     
       int bitMask = 1<<pos;

       int notBitMask = ~(bitMask);
       int newBit = notBitMask & n;
       System.out.println("new number is " + newBit);
     

         }


         public static void UpdateBit(int n,int pos){
         	 Scanner  sc = new Scanner(System.in);  
  	   System.out.println("Please specify what operation you want to perform "  + "Enter 1 for SET operation "  + " Enter 0 for CLEAR operation ");
      int operation = sc.nextInt();


         	 int bitMask = 1<<pos;
              if(operation == 1){
       	int newNumber = bitMask | n;
       	System.out.println("New number is : " + newNumber);       }

         else{
                 
          int notBitMask  = ~(bitMask);
          int newNumber = notBitMask & n;
          System.out.println("New number is : " + newNumber);

                 }

             }

     

	public static void main(String []args ){

		Scanner sc = new Scanner(System.in);
       System.out.println("Enter value of n : ");
       int n = sc.nextInt();
       System.out.println("Enter position you want to check : ");
       int pos = sc.nextInt();
       
       GetBit(n,pos);         

SetBit(n,pos);  
ClearBit(n,pos);
UpdateBit(n,pos);       



	}
		}
