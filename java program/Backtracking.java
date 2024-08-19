import java.util.*;


public class Backtracking{


   public static void PrintPermutation(String string1 , String permutation, int index){
     if(string1.length() == 0){
     	System.out.println(permutation);
     	return;
     }
     for(int i = 0;i<string1.length();i++){
     	char CurrentChar = string1.charAt(i);
     	String newString = string1.substring(0,i) + string1.substring(i+1);
     	PrintPermutation(newString , permutation + CurrentChar ,index + 1);     

     }
 }  

 public list<list<String>> solveNQueens(int n){
 	char [][] board = new char[n][n];
 	
 }


 public static void helper(char[][] board, list<list<String>> ChessBoard, int n){


 	if(n== board.length){

 	}
 }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		/*String string1 = sc.next();
		PrintPermutation(string1, "" ,0);

		*/
	}
}