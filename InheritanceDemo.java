/*single inheritance*/
package com.core;

import java.util.Scanner;

class E
{
	int e;
	void getE()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter E: ");
		e=sc.nextInt();
	}
	void putE()
	{
		System.out.println("E : "+e);
	}
}
class F extends E
{
	int f;
	void getF()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter F: ");
		f=sc.nextInt();
	}
	void putF()
	{
		System.out.println("F: "+f);
	}
	
}

public class InheritanceDemo {
	public static void main(String[] args) {
		F f1=new F();
		f1.getE();
		f1.getF();
		f1.putE();
		f1.putF();
	}

}
