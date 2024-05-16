package Bit_manipulation;

public class Rightmost_set_bit_bruteforce {

	public static void main(String[] args) {
		
		int n = 40;
		int m = 1;
		int pos = 0;
		
		while( (n &m) == 0) //Bits 
		{
			m = m<<1;     //If bit is 0, move to the next previous position. 
			pos++;       //move to next  posotion
		}
		System.out.println(pos+1); //If 1 is found then print that posotion +1.
	}

}
