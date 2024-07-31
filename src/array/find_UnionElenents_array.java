package array;

import java.util.HashSet;
import java.util.Set;

public class find_UnionElenents_array {

	//find Union(uniqe) element of two array
	
	static void printUnion(int arr1[],int arr2[])
	{
		Set<Integer> set=new HashSet<>();
		
		for(int i=0;i<arr1.length;i++)
		{
			set.add(arr1[i]);
		}
		
		for(int i=0;i<arr2.length;i++)
		{
			set.add(arr2[i]);
		}
		
		System.out.println(set);
	}
	
	
	public static void main(String[] args) {
		
		int arr1[]= {80,10,15,2,35,60};
				
		int arr2[]= {35,80,60,20,75};
		
		printUnion(arr1, arr2);
	}
}
