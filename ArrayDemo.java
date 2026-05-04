package com.core;

import java.util.Scanner;

public class ArrayDemo 
{
	public static void main(String[] args) {
		int a[]=new int[5];
		int i,j,temp;
		int sum=0;
		Scanner sc=new Scanner(System.in);
		
		for (i=0;i<a.length;i++)
		{
			System.out.print("Enter "+i+" Element : ");
			a[i]=sc.nextInt();
			sum=sum+i;
		}
		System.out.println("Sum : "+sum);
		System.out.println("Array Elements are");
		for(i=0;i<a.length;i++)
		{
			System.out.println("A["+i+"] = "+a[i]);
		
		}
	
		
		for(i=0;i<a.length;j++)
		{
			for(j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
						temp=a[i];
						a[i]=a[j];
						a[j]=temp;
				}
			}
		}
		System.out.println("Array elemnts are in ascending order");
		for(i=0;i<a.length;i++) {
			System.out.println("A[" +i+"]="+a[i]);
		}
		for(i=0;i<a.length;i++)
		{
			for(j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
						temp=a[i];
						a[i]=a[j];
						a[j]=temp;
				}
			}
		}
		System.out.println("Array Elements are in Disceding Order");
		for(i=0;i>a.length;i++)
		{
			System.out.println("A["+i+"] = "+a[i]);
		
		}
	}
		
}
	