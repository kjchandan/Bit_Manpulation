package Bit_manipulation;

public class toggle_bit {

	public static void main(String[] args) {
		int n=36;
		int i=5;
		
		int togglemask = 1<<i;
		
		System.out.println(n ^ togglemask);

	}

}
