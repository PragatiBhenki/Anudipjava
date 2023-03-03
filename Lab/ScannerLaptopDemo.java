package awt;

import java.util.Scanner;

public class ScannerLaptopDemo
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		System.out.println("Enter yuor choice");
		

		System.out.println("1-addition");

		System.out.println("2-substraction");

		System.out.println("3-Multiplication");

		System.out.println("4-Odd / Even Number");

		System.out.println("5-Exit");
		

		Scanner sc=new Scanner(System.in);
		int choice=sc.nextInt();
		
		switch(choice)
		{
		
		case 1 : 
			
			System.out.println("Enter A first Number");
			
			int n1=sc.nextInt();
			
	         System.out.println("Enter A second Number");
			
			int n2=sc.nextInt();
			
			int c=n1+n2;		
			

	         System.out.println("Addition ="+c);
	         
	         break;
	         
		case 2 : 
			
			System.out.println("Enter first Number");
			
			int n3=sc.nextInt();
			
	         System.out.println("Enter second Number");
			
			int n4=sc.nextInt();
			
			int sub=n3-n4;		
			

	         System.out.println("Subtraction ="+sub);
	         
	         break;
		
	         
		case 3 : 
			
			System.out.println("Enter first Number");
			
			int n5=sc.nextInt();
			
	         System.out.println("Enter second Number");
			
			int n6=sc.nextInt();
			
			int mul=n5*n6;		
			

	         System.out.println("Multiplication ="+mul);
	         
	         break;
	         
	         
		case 4 : 
			
			System.out.println("Enter first Number");
			
			int number=sc.nextInt();

			if(number%2==0)
			{
				System.out.println("Number is even");}
			else
			{
				System.out.println("number is odd");}
			
	         break;
		
		case 5:
			
	         break;
		
		}
		
		



	}

}
