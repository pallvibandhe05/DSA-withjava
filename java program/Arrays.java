import java.util.*;
import java.util.Scanner;
public class Arrays{

 public static int ArrayIndex( int num[]){

 Scanner sc = new Scanner(System.in);
 System.out.print("Enter element to be searched :");
  int item = sc.nextInt();
  int index = -1;

  for( int i = 0;i<num.length;i++){
  	if(num[i] == item){
  		index = i;
  		
  	  }
  	} 
     
 if(index == -1){
 	System.out.println("the element is not in list");
 }else{
 System.out.println("The element is in index : " + index);
}
 return index;
}  





 public static void ArrayName(String name[]){
	 for(int i = 0; i<name.length;i++){
		System.out.println("Name " + (i+1) + " is " + name[i]);
	}
	return;
}     


public static void ArrayMinMax(int num[]){

  int max = num[0];
  int min = num[0];

  for(int i = 0;i<num.length;i++){
  	if(num[i]>max){
  		max = num[i] ;
  	}

  }

  System.out.print("Maximum value in arrray is : " + max );
  System.out.println();

  for(int i = 0;i<num.length;i++){
  	if(num[i]<=min){
  		min =  num[i];
  	}
  } System.out.print("Minimum value in arrray is : " + min );
  System.out.println();
 return;
  
} public static boolean ArrayCheck(int num[]){
boolean isSorted = true;

for (int i = 0;i<num.length-1 ;i++ ) {
 	if(num[i]>num[i+1]){
 		isSorted = false;
 	}
 }  if (isSorted) {
 	System.out.print("Yes! Array is sorted");
 }else{
 	System.out.println("No! Array is not sorted");
 }

 return isSorted;
}




	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of array : ");
		int j = sc.nextInt();

		int []num = new int[j];

		for(int i = 0;i<j;i++){
			num[i] = sc.nextInt();
		}
		for(int i = 0;i<j;i++){
			System.out.print(" " + num[i]+ " ");
		}System.out.println();

		ArrayIndex(num);
		 System.out.println("______________________________________");

        System.out.print("Enter number of names : ");
        int size = sc.nextInt();
       String name[] = new String[size];
	for(int i = 0;i<name.length;i++){
		name[i] = sc.next();

	} 
       ArrayName(name);
       System.out.println("______________________________________");
       ArrayMinMax(num);
        System.out.println("______________________________________");
       ArrayCheck(num);
	}
} 