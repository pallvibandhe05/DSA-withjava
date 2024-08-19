import java.util.*;



public class Recurssion3{

  public static void PrintPermutations(String string1, String permutation){
 if(string1.length()  == 0){
 	System.out.println(permutation);
 	return;
 }

  	for(int i = 0;i<string1.length();i++){
  		char CurrentChar = string1.charAt(i);



  		String newString1 = string1.substring(0 , i) + string1.substring(i+1); 
  		PrintPermutations(newString1, permutation + CurrentChar);
  	}
  }

  public static int TotalPaths(int i ,int j, int n,int m){


if(i == n || j == m){

	return 0;
}
if(i == n-1 &&  j == m-1){
	return 1;
}

int DownPath = TotalPaths(i+1, j , n , m);
int RightPath = TotalPaths(i,j+1,n,m);
return DownPath+RightPath;
  }

  public static int TotalTiles(int n,int m){
 if(n<m){
 	return 1;
 } if(n==m){
 	return 2;
 }
  	int VerticalPlacement = TotalTiles(n-m , m);


  	int HorizontalPlacement =  TotalTiles(n-1,m);


  	return VerticalPlacement + HorizontalPlacement;
  }

  public static int GuestInParty(int n){
   if(n <= 1){

   	return 1;
   }
  	int SingleGuest = GuestInParty(n - 1);

  	int PairGuest = (n-1) *  GuestInParty(n-2);

 return SingleGuest + PairGuest;
  	  }  public static void printSubset(ArrayList<Integer> subset){
  	  	for(int i = 0;i<subset.size();i++){
  	  		System.out.print(subset.get(i) + " ");
  	  	}
  	  	System.out.println();
  	  }

  	  public static void SubsetOfNums(int n, ArrayList<Integer> subset){
if(n == 0){

	printSubset(subset); 
	return;

}
  subset.add(n);
  SubsetOfNums(n-1,subset);




  subset.remove(subset.size()-1);
  SubsetOfNums(n-1,subset);  	  }

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);


		System.out.println("Enter your string to check permutations : ");
		String string1 = sc.next();
		PrintPermutations(string1 , "");
		System.out.println("___________________________________________________________");
 

 System.out.println("Enter Value of n and m for nxm maze : ");

 int n = sc.nextInt();
 int m = sc.nextInt();

System.out.println(TotalPaths(0,0,n,m));

 System.out.println("____________________________________________________________");
 System.out.println("Enter Value for nxm matrix : ");

 int i = sc.nextInt();
 int j = sc.nextInt();
System.out.println("in " + TotalTiles(i,j) + " " + "ways ");


		System.out.println("Enter number of guest :");
		int guest = sc.nextInt();

		System.out.println(" Guest can be invited in " + GuestInParty(guest) + " ways ");


 
 System.out.println("Enter natural number to make subsets : ");
 int NaturalNum = sc.nextInt();


 ArrayList<Integer> subset = new ArrayList<>();
 SubsetOfNums(NaturalNum, subset);

	}
}