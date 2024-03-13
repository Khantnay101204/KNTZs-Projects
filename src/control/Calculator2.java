package control;

import java.util.Scanner;

public class Calculator2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		
		Scanner sc=new Scanner (System.in);
		System.out.print("Enter equation: ");
		int fnum=sc.nextInt();
		char ch=sc.next().charAt(0);
		int snum=sc.nextInt();
		
		switch (ch) {
		case'+':
		System.out.println("answer :"+(fnum+snum));
		break;
		case'-':
			System.out.println("answer :"+(fnum-snum));
			break;
		case'*':
			System.out.println("answer :"+(fnum*snum));
			break;
		case'/':
			System.out.println("answer :"+(fnum/snum));
			break;
			default:System.out.println("Invalid operator");
		
		}
		

	}

}
