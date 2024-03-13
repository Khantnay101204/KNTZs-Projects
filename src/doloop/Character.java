package doloop;

import java.util.Scanner;

public class Character {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner (System.in);
	
		char ch;
		do {
			System.out.print("enter a character:");
			ch=sc.next().charAt(0);
			
			if(ch=='?')continue ;
			System.out.println(ch);
			
		}while(ch!='#');
		
		
			
			
		

	}

}
