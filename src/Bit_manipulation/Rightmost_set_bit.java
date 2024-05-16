package Bit_manipulation;
import java.util.*;

public class Rightmost_set_bit {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n= scan.nextInt();
		
		System.out.println((int)(Math.log10(n ^ (n &(n-1))) / Math.log10(2))+1);
		// (log  (n XOR (n AND n-1)  )
		// Find the position Soo find the 2 pow value and add 1 to it for the position.  //2 pow n => log2 n.
		//log2 N =>  log10 N/ log10 2.
		scan.close();
	}

}
