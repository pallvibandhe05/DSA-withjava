import java.util.*;

public class Sorting{




	public static void BubbleSort(int[] num){

                   
     
		for(int i = 0;i<num.length-1;i++){
			for(int j = 0;j<num.length -i -1 ;j++){
				if(num[j]>num[j+1]){
					int temp = num[j];
					num[j] = num[j+1];
					num[j+1] = temp;
						
		}
	}
} 
 System.out.println("___________________________________________________");

System.out.println("Sorted array as Bubble Sort is : ");
for(int i = 0 ; i<num.length;i++){
	System.out.print(" " + num[i] + " ");
}
 
		
	}

	public static void SelectionSort(int[] num){
   
   for(int i = 0;i<num.length -1;i++){

   	int min = i;
   	for(int j = i+1;j<num.length ;j++){
   		if(num[j] < num[min]){
   			min = j;
   		}
   	}
   	int temp = num[min];
   	num[min] = num[i];
   	num[i] = temp;
   }
 System.out.println("Sorted array as Slection sort is : ");
 for(int i = 0;i<num.length;i++){
 	System.out.print(" " + num[i] + " ");
 }

	}
	public static void InsertionSort(int[] num ){


		for(int i =0;i<num.length;i++){
			int Curr = num[i];
			int j = i-1;
			while(j>=0 && num[j]>Curr){
         num[j+1] = num[j];
         j--;
			}
			num[j+1] = Curr;
		}

          System.out.println("Sorted array as Insertion Sort is : ");
		for(int i = 0;i<num.length;i++){
			System.out.print(" " + num[i] + " ");
		}

	} 
	public static void conquer(int[] num, int lb, int mid, int ub){

		int merged[] = new int[ub - lb + 1];

		int index1 = lb;
		int index2 = mid+1;
		int x = 0;


		while(index1<= mid && index2<=ub){
			if(num[index1] <= num[index2]){
				merged[x++] = num[index1++];
			}else{
				merged[x++] = num[index2++];

			}
		}
         while(index2<= ub){
         	merged[x++] = num[index2++];
         }

         while(index1<= mid){
         	merged[x++] = num[index1++];
         }

         for(int i = 0,j = lb;i<merged.length ; i++,j++){
    num[j] = merged[i];
         }
	} 



public static void  divide(int[] num, int lb, int ub){
    if(lb>= ub){
  	 return;
    }

    int mid = lb + (ub - lb)/2;
    divide(num, lb, mid);
    divide(num,mid+1, ub);
    conquer(num,lb,mid,ub);


	} public static int partition(int[]num, int low,int high ){
		int pivot = num[high];

		int i = low-1;
     for(int j = low;j<high;j++){
     	if(num[j]<pivot){
     		i++;
       
       int temp = num[i];
       num[i] = num[j];
      num[j] = temp;

     	}
     }

     i++;
     int temp = num[i];
     num[i] =pivot;
    num[high] = temp;
return i;


	}
           

	public static void QuickSort(int []num,int low,int high ){

		if(low<high){
			int pivot = partition(num, low,high);


			QuickSort(num,low,pivot-1);
			QuickSort(num,pivot + 1,high);
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter size of your array : ");
          int n = sc.nextInt();
        
        int [] num = new int[n];
        for(int i = 0;i<num.length;i++){
        	
        		num[i] = sc.nextInt();
        	
        }

 BubbleSort(num);
 System.out.println();
 System.out.println("___________________________________________________");
		 SelectionSort(num);
		 System.out.println();
 System.out.println("___________________________________________________");
 InsertionSort(num);
 System.out.println();
 System.out.println("___________________________________________________");
divide(num,0,num.length-1);
   System.out.println("Sorted array as Merge Sort is : ");
	for(int i = 0;i<num.length;i++){
		System.out.print(" " + num[i] + " ");
		
	}System.out.println();
 System.out.println("___________________________________________________");
 System.out.println("Sorted array as Quick Sort is : ");

 QuickSort(num, 0 ,num.length-1);
	for(int i = 0;i<num.length;i++){
		System.out.print(" " + num[i] + " ");
	}

}
}