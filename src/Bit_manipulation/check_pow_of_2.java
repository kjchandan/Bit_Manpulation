package Bit_manipulation;

import java.util.Scanner;

public class check_pow_of_2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n= scan.nextInt();
		
		if(n==0) {
			System.out.println("falsez");
		} 
		else if(( n & n-1)==0) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		
		
		scan.nextInt();
	}

}
