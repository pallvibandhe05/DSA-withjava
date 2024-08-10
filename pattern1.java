
import java.util.Scanner;


public class pattern1{
  
  
 public static void main(String args[]){
    int i, j , n,m;
    Scanner sc = new Scanner(System.in);
    n = sc.nextInt();

		//pattern  ****
		//          ****
		//          ****
		//          ****
         for( i = 1; i<= n ; i++){
         	for( j = 1; j<=n ; j++){
         		System.out.print(" * ");
         	
         } System.out.print("\n");
	}
    System.out.println("----------------------------------------------------------------");

  //pattern2 
  //*****
  //*   *
  //*   *
  //*   *
  //*****
   m= sc.nextInt();

   for(i = 1;i<= n;i++){
    for(j = 1; j<=m;j++){
        if( i == 1 || j==1|| j == m || i == n){
            System.out.print("*");
        }else {
            System.out.print(" ");
        }
    } System.out.println();
   }
   System.out.println("----------------------------------------------------------------");


   //pattern3
   //*
   //**
   //***
   //****
    for(i = 1; i<=n;i++){
        for(j = 1; j<=i;j++){
            System.out.print(" * ");
        }
    System.out.print("\n");
}
System.out.println("----------------------------------------------------------------");

 //pattern4
//*****
//****
//***
//**
//*


   for(i = n; i>=1;i--){
    for(j=1 ; j<=i; j++){
        System.out.print(" * ");
    }
   System.out.println();
}
System.out.println("----------------------------------------------------------------");

//pattern5
//    *
//   **
//  ***
// ****
//*****


 for(i = 1; i<=n ; i++){
 for(j = 1; j<=n-i;j++){
    System.out.print(" ");
 } for(j= 1; j<=i;j++){
 System.out.print("*");
 }
 System.out.println();
}
System.out.println("------------------------------------------------------------------");

//pattern6
//1
//12
//123
//1234


 for(i= 1;i<=n ; i++){
    for(j = 1; j<=i;j++){
        
        System.out.print(j);
    }
    System.out.println();
    
 }

 System.out.println("----------------------------------------------------------------");
//pattern7
 //12345
 //1234
 //123
 //12
 //1


   for (i = n; i>=1;i--){
    for(j = 1; j<=i;j++){
        System.out.print(j);
    } System.out.println();
 }

System.out.println("----------------------------------------------------------------");

//pattern8
//1
//23
//456
//78910



int count=1;
for(i=1;i<=n;i++){
    for(j=1;j<=i;j++){
        System.out.print(count);
        count++;
    }System.out.println();
}

System.out.println("----------------------------------------------------------------");



//pattern9
//1
//o1
//101
//0101
//10101



for(i=1;i<=n;i++){
    for(j=1;j<=i;j++){
        int sum = i + j;
        if(sum % 2 == 0)
        System.out.print("1");
       else 
        System.out.print("0");
    }System.out.println();
}
System.out.println("----------------------------------------------------------------");
  
  //pattern10
//*       *
//**     **
//***   ***
//**** ****
//*********
//*********
//**** ****
//***   ***
//**     **
//*       *



for(i = 1 ;i<=n;i++){
    for(j = 1 ; j<=i ;j++){
        System.out.print("*");

    }
    int spaces = 2 * (n -i);
    for(j = 1; j<=spaces; j++){
        System.out.print(" ");
    }
    
    for(j = 1; j<=i  ;j++  ){

        System.out.print("*");

    } 
  

System.out.println();
} for(i =n ;i>=1;i--){
 for(j = 1; j<=i ;j++){
        System.out.print("*");

    }
    int spaces = 2 * (n -i);
    for(j = 1; j<=spaces; j++){
        System.out.print(" ");
    }
    
    for(j = 1; j<=i  ;j++ ){

        System.out.print("*");

    } 
  

System.out.println();
}
 
 System.out.println("----------------------------------------------------------------");

  //pattern11
 //        ****
 //       ****
 //      ****
 //     ****
 //    ****

   for(i = n; i>=1;i--){
    for(j=1 ; j<=i; j++){
        System.out.print(" ");
    } for(j= 1;j<=n;j++){
   System.out.print("*");
}
System.out.println();
}
System.out.println("----------------------------------------------------------------");

//pattern12
//    1
//   2 2
//  3 3 3
// 4 4 4 4
//5 5 5 5 5


for(i =1;i<=n;i++){
    for(j=1;j<n-i;j++){
        System.out.print(" ");
    }
   for(j = 1;j<=i;j++){
    System.out.print( i +" ");
   }
    System.out.println();
} 
System.out.println("----------------------------------------------------------------");

//pattern13
//     1
//    212
//   32123
//  4321234
//543212345


for(i =1;i<=n;i++){
    for(j=1;j<n-i;j++){
        System.out.print(" ");
    }
    for(j=i;j>=1;j--){
        System.out.print(j);

    } 
    for(j=2;j<=i;j++){
        System.out.print(j);
    } 

    System.out.println();

}
System.out.println("----------------------------------------------------------------");

//pattern14
//    *
//   ***
//  *****
// *******
//*********
// *******
//  *****
//   ***
//    *


for(i = 1; i<=n;i++){
    for(j=1; j<=n-i;j++){
        System.out.print(" ");
    }
    for(j =1; j<= 2*i-1; j++){
        System.out.print("*");

    }

    System.out.println();
}for(i = n; i>=1;i--){
    for(j=1; j<=n-i;j++){
        System.out.print(" ");
    }
    for(j =1; j<= 2*i-1; j++){
        System.out.print("*");

    }

    System.out.println();
}


System.out.println("----------------------------------------------------------------");


}
}