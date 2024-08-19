import java.lang.String;
import java.util.*;
import java.util.Arrays;

//take an array of strings input from the user and find thr cumulative(combined) length of all those strings
//input a string and create another string called 'result' and repl;ace every 'e' by'i
//input an email and create a username from the email by deleting @gmail.com and display only username


public class Strings{ 

public static int StringsLength(String array[]){
   int totallength = 0;
	 for (int i =0 ;i<array.length ;i++ ) {
	   totallength += array[i].length(); 	
	 }

	 System.out.println("Total length of all strings in array is : " + totallength);
	 return totallength;
}   
  public static String ReplaceE(String strings){
   
   String result = "";
   for(int i = 0;i< strings.length();i++){
     if(strings.charAt(i) == 'e'){
     	result += 'i';
     }else{
     	result += strings.charAt(i);
     }
   }

   System.out.print(result);

   return result;
  } public static String UserName(String email){

  	String UserName = "";
  	for (int i = 0;i<email.length() ;i++ ) {
  		if(email.charAt(i) == '@'){
  			break;
  		
  	}else 
  	UserName += email.charAt(i);}

  	System.out.print("New User name is : " + UserName);

  	return UserName;
  } 

 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 System.out.print("Enter number of strings in array : " );
 int size = sc.nextInt();
 String []array = new String[size];
 System.out.println("Enter strings in array : ");
 for(int i = 0;i< size;i++){
 	array[i] = sc.next();
 }

 for (int i = 0;i<array.length ;i++ ) {
 	System.out.print(" " + array[i] + " ");
 } System.out.println();





 StringsLength(array);
 System.out.println("______________________________________________");
 System.out.print("Enter string : ");
 String strings = sc.next();
 ReplaceE(strings);
 System.out.println("_______________________________________________");
 System.out.println("Enter your email id : ");
 String email = sc.next();
 UserName(email);
 	

 	}
}
