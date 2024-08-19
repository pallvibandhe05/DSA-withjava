import java.util.*;
 //take a 2d array as input and search for x and return the index


public class TwoDArrays{


	public static void ArraySearch(int num[][]){
         Scanner sc = new Scanner(System.in);
          int item;
          System.out.print("Enter element to be searched :");
          item = sc.nextInt();
          
         for(int i = 0; i<num.length;i++){
         	for(int j = 0;j<num[0].length;j++){
         		if(num[i][j]==item)
         		System.out.println("The element is found at indice " + i + " " + j);
                
         	 
         	
         }

         
      }
  }

	

	 public static void SpiralArray(int num[][]){

      int row_start = 0;
      int column_start = 0;
      int row_end = num.length  - 1;

      int column_end  = num[0].length - 1;

      System.out.println("Elements in spiral order is");

      while(row_start<=row_end && column_start<=column_end){

      for(int i = column_start;i<=column_end;i++){
      	System.out.print(num[row_start][i] + ", ");
      }

      row_start++;


    for(int j = row_start;j<=row_end;j++){
    	System.out.print(num[j][column_end]+ " ,");
	 }
	 column_end--;

	 for(int i = column_end;i>=column_start;i--){
	 	System.out.print(num[row_end][i]+ " ,");
	 }row_end--;

	 for(int k = row_end;k>= row_start;k--){
	 	System.out.print(num[k][column_start] + ", ");

	 } column_start++;

 }


    }  public static void ArrayTranspose(int num[][]){


    	int temp;
        
    	for(int i = 0; i<num.length;i++){
    		for(int j = 0;j<num[0].length;j++){

    			temp = num[i][j];
    			num[i][j] = num[j][i];
    			num[j][i] = temp;
    		}
    	}
    	System.out.println("Transpose of given array is : ");
    	for(int i = 0 ;i<num.length;i++){
    		for(int j = 0;j<num[0].length;j++){
        System.out.print(" " + num[j][i] + " ");
    }
}
    }
  
	public static void main(String []args){

Scanner sc = new Scanner(System.in); 


   System.out.print("Enter number of rows : ");
   int row = sc.nextInt();
   System.out.println();
   System.out.print("Enter number of colums : ");
   int column = sc.nextInt();
   System.out.println();


   int num[][] = new int[row][column];
   System.out.println("Enter elements in array");
   for(int i = 0;i<row;i++){
   	for(int j = 0;j<column;j++){
   		num[i][j]=sc.nextInt();
   	}
   }


   for(int i =0;i<num.length;i++){
   	for(int j = 0;j<num.length;j++){
   		System.out.print( " " + num[i][j] + " ");
   		
   	}
   }
   System.out.println();
     ArraySearch(num);
     SpiralArray(num);
     ArrayTranspose(num);

	}
}