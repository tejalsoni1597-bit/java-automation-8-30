package com.core;
import java.util.Scanner; 
public class WhileDemo {
	public static void main(String[] args) {
		int n,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter N : ");
		n=sc.nextInt();
		while(n>0)
		{
			/*System.out.println("Tops Technologies");*/
			sum=sum+n;
			n--;
		}
		System.out.println("Sum : "+sum);
	}

}
