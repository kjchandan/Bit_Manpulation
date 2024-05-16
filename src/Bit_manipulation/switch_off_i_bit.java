package Bit_manipulation;

public class switch_off_i_bit {

	public static void main(String[] args) 
	{
		int  n = 36; 
		int i=5;
		
		int offmask = ~(1<<i);
		
		System.out.println(n & offmask);
 
	}

}
