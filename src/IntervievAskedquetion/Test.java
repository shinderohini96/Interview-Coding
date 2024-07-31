package IntervievAskedquetion;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;

 public class Test {
	
 public static void main(String[] args) {

	 
	 
	 for(int i=1;i<=4;i++)
	 {
		 for(int j=1;j<=i;j++)
		 {
			 if((i+j)%2==0)
			 {
			 System.out.print(7+" ");
			 }
			 else
			 {
				 System.out.print(8+" ");
			 }
		 }
		 System.out.println(" ");
	 }
	 
	 System.out.println("**************");
	 
	 for(int i=1;i<=4;i++)
	 {
		 for(int j=1;j<=i;j++)
		 {
			 if(j%2==0)
			 {
			 System.out.print(8+" ");
			 }
			 else
			 {
				 System.out.print(7+" ");
			 }
		 }
		 System.out.println(" ");
	 }
}

}

 
 /*
  
 7
 8 7
 7 8 7
 8 7 8 7
 
 and 
 
 7
 7 8
 7 8 7
 7 8 7 8
 
 */