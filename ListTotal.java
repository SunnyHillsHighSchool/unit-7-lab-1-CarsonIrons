//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.List;
import java.util.ArrayList;

public class ListTotal
{
 //Method for adding the elements of the arraylist
 //By Carson Irons
 //P2
//Method header with integer arrayList parameter and int return type
public static int total( List<Integer> ray )
 {
//Declare and initialize int sum
int sum =0;
//loop through the elements of the code with a for each (or for) loop
for(int i=0; i<ray.size();i++){
//add current element to sum
sum+=ray.get(i);
//end loop
}
//return sum
return sum;  
 }
}