package logical_Program;

import java.util.Scanner;

public class FactorialNo {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the  Number");
		int no=sc.nextInt();
		
		int fact=1;
		for(int i=no;i>=1;i--)
		//for(int i=1;i<=no;i++)
		{
			fact=fact*i;
		}
		System.out.println("Factorial no "+no+" is = "+fact);
	}
}
