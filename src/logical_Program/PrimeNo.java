package logical_Program;

import java.util.Scanner;

public class PrimeNo {
	public static void main(String[] args) {
		
	//	int no = 4;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int no=sc.nextInt();
		
		int pflag=0;
		for(int i=2;i<=no/2;i++)
		{
		int p=no%i;
		if(p==0)
		{
			pflag=1;
		}
		}
		
		if(pflag==0)
		{
			System.out.println("Number is Prime");
		}
		else
		{
			System.out.println("Number is not Prime");
		}
		
		
	/*	for(int no=1;no<=100;no++)
		{
			int pflag=0;
			for(int i=2;i<=no/2;i++)
			{
				int rem=no%i;
				if(rem==0)
				{
					pflag=1;
				}
			}

			if(pflag==0)
			{
				System.out.println(+no+"  =  number is Prime");
			}
			else
			{
				System.out.println(+no+" = number is not Prime");
			}
			 
		} */
			
	}

}
