package com;

public class Test implements I1,I2{

	public static void main(String[] args) {
		
	/*	String str="hello";
		
		for(int i=str.length()-1;i>=0;i--)
		{
			System.out.print(str.charAt(i));
		}
		*/
		
		System.out.println('j'+'a'+'v'+'a');
	
	    System.out.println("j"+"a"+"v"+"a");
	    
	    System.out.println(15*30 + "CloudTech");
	    System.out.println("CloudTech" + 15*30);
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		I2.super.print();
	}

	
}
