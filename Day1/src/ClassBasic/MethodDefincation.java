package ClassBasic;

import java.util.Scanner;

public class MethodDefincation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*int a=5,b=10,c;
		c=a+b;
		System.out.println("Sum of a and b is "+c);
		
		a=10;b=100;
		c=a+b;
		System.out.println("Sum of a and b is "+c);
		
		
		a=100;b=300;
		c=a+b;
		System.out.println("Sum of a and b is "+c);*/
		
		//Scanner b= new Sc
		
		MethodDefincation abc = new MethodDefincation();   // intialize the class and class object name is abc
		abc.adding(10, 30);
		abc.adding(20,30);
/*		abc.adding(1,4);
		abc.adding(5,20);	*/
		abc.subtract(10, 30);
		abc.subtract(10, 50);
		abc.multiply(3, 8);
	}

	public void adding(int firstNumber,int secondNumber) {
		
		//int a=5,b=10,c;
		int c=firstNumber+secondNumber;
		System.out.println("Sum of a and b is "+c);
		
	}
	
	public void subtract(int a,int b) {
		int c =b-a;
		System.out.println("output is "+c);
	}
	
	public void multiply(int a,int b) {
		int c = a*b;
		System.out.println("Result is "+c);
		
	}
}
