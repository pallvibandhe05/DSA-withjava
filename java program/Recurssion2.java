import java.util.*;
import java.util.Scanner;


public class Recurssion2 {
  
  public static String[] keyPad = {"." , "abc", "def","ghi","jkl","mno","pqrs","tu","vwx","yz"};

	public static int first = -1;
	public static int last = -1;

  public static void TowerOfHanoi(int n ,String start,String aux, String end){

if(n == 1){
	System.out.println("move disk " + n + " from " + start + " to " + end);
	return;
}



  	TowerOfHanoi(n-1,start,end,aux);
  	System.out.println("Move disk " + n + " from " + start + " to " + end);
  	TowerOfHanoi(n-1,aux,start,end);

  	  }

  	public static void ReverseString(String strings,int index){

        if(index == 0){


        	System.out.println(" " + strings.charAt(index) + " ");
        	return;
        }
     System.out.print(" " +strings.charAt(index) + " ");
     ReverseString(strings, index -1);

  	}


  	public static void CharAtString(String strings,char element,int index){
      if (index == strings.length()) {
      	return;
      }
      if(strings.charAt(index)== element){
      if(first == -1){
      	first = index;
      
      }else{
      	last = index;
     }
           
      }

      CharAtString(strings, element, index+1);

  		  	}


  		  	public static boolean CheckArray(int num[] , int idx){


  		  		  if(idx == num.length - 1){

  		  		  	return true;}

  		  		  	if(!CheckArray(num, idx + 1)){
  		  		  		return false;
  		  		  	}	  


  		  		  	return num[idx] < num[idx + 1];	  		  
  		  	}


        public static String CountX(int count){


         String newString = "x";
         for(int  i = 1;i<count;i++){
            newString +='x'; 
         }


         return newString;
        }


        public static String NewStr(String strings,int index,int count){
         if(index == strings.length()){

            return CountX(count);
         }


         if(strings.charAt(index)== 'x'){

            return NewStr(strings, index + 1,count + 1);


         }
         else {

            String nextString = NewStr(strings , index + 1,count);
            return strings.charAt(index) + nextString;
         }
        }
       
       
   public static boolean[] map = new boolean[100];


        public static void RemoveDuplicate(String str, int index, String newString){



         if(index == str.length()){
            System.out.println(newString); 
            return ;
         }


         char currChar = str.charAt(index); 
         if( map[currChar-'a'] == true){
         RemoveDuplicate(str , index + 1,newString);
         } else {

            newString += currChar; 
            map[currChar- 'a'] = true;
         RemoveDuplicate(str,index + 1, newString);
         }
      return;

        }  public static void CreateSubsequence(String strings,int index, String newString,HashSet<String> set){

          if(index == strings.length()){
            if(set.contains(newString)){

               return;
            }else{
               System.out.println(newString);
               set.add(newString);
               return;
            }
         }
            
          

         char currentChar  = strings.charAt(index);

        CreateSubsequence(strings, index + 1, newString  + currentChar,set);



        CreateSubsequence(strings, index + 1 , newString,set);


        } public static void KeyPadPrint(String str, int index, String combination){
if(index == str.length()){
   System.out.println(combination);
   return; 
}



 char currentChar = str.charAt(index);

 String mapping = keyPad[currentChar - '0'];


for(int i = 0;i<mapping.length() ;i++){

   KeyPadPrint(str,index + 1,combination + mapping.charAt(i));

}

}
	public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);

  		   
 System.out.println("Enter number of disk : " );
 int n = sc.nextInt();
  TowerOfHanoi(n,"start","aux","end");


 System.out.println("_______________________________________________________________________________");

  System.out.println("Enter you string to reverse : ");
  String strings= sc.next();
  ReverseString(strings, strings.length()-1);
 System.out.println("_______________________________________________________________________________");
 System.out.println("Enter your string to check character occurence ");

  String str = sc.next();
  System.out.println("Enter character you want to check ");
  char c = sc.next().charAt(0);

  CharAtString(str,c,0);
   System.out.println("First occurence is at : " + first);
            System.out.println("Last occurece is at  : " + last);

            System.out.println("_______________________________________________________________________________");
System.out.println("Enter your array to check if it is sorted or not?");
 int num[] =  new int[10];
 for(int i = 0; i<10;i++){

 	num[i]= sc.nextInt();

 }for(int i = 0; i<10;i++){

System.out.print(" " + num[i] + " "); 	
 	
 }
  System.out.println();
 if(CheckArray(num,0)){

 	System.out.println("Array is sorted ");
 }else{
 	System.out.println("Array is not sorted ");
 }

  System.out.println("_______________________________________________________________________________");



System.out.println("Enter your string to remake");


String aaaaaa = sc.next();

String newString = NewStr(aaaaaa,0,0);
System.out.println(newString);


 System.out.println("_______________________________________________________________________________");


System.out.println("Enter your string from which you want to replace duplicate characters");
 String  string1 = sc.next();

  
RemoveDuplicate(string1, 0,"");

 System.out.println("________________________________________________________________________________");


 System.out.println("Enter your String to count number of subsequences ");
 String string2 = sc.next();
 HashSet<String> set = new HashSet<>();
 CreateSubsequence(string2, 0,"" ,set);
 

  System.out.println("Enter keyPad number : ");


  String string3 = sc.next();

  KeyPadPrint(string3 , 0 , ""); 


	}
}

