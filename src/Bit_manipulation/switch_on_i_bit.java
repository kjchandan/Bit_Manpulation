package Bit_manipulation;

public class switch_on_i_bit {
	public static void main(String args[]) {
		int n =36;
		int i=3;
		
		int onmask = 1<<i;
		System.out.println(n | onmask);
	}
}
