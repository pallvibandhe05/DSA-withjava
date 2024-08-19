import java.util.*;
import java.util.ArrayList;


public class ArrayListInJava{

public static void main(String[] args) {
	

 ArrayList<Integer> list = new ArrayList<Integer>();
 
  list.add(10);
  list.add(5);
  list.add(50);
  list.add(7);
  list.add(78);
  list.add(4);
  list.add(67);
  list.add(9);
 
  
System.out.println(list);

list.add(3,30);
System.out.println(list);



list.set(4,8);
System.out.println(list);
list.remove(3);
System.out.println(list);
int n = list.size();
System.out.println("Size of the ArrayList is :" + n );
Collections.sort(list);
System.out.println(list);
}
}