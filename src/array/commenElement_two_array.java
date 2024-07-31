package array;

import java.util.HashSet;
import java.util.Set;

public class commenElement_two_array {

	//find commen element of two array
	
	static void printCommen(int arr1[],int arr2[])
	{
		Set<Integer> set=new HashSet<>();
		
		for(int i=0;i<arr1.length;i++)
		{
			set.add(arr1[i]);
		}
		
		for(int i=0;i<arr2.length;i++)
		{
			if(set.contains(arr2[i]))
			{
				System.out.println(arr2[i]);
			}	
		}
		
	}
	
	
	public static void main(String[] args) {
		
		int arr1[]= {80,10,15,2,35,60};
				
		int arr2[]= {35,80,60,20,75};
		
		printCommen(arr1, arr2);
	}
}
