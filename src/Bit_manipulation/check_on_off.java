package Bit_manipulation;

public class check_on_off {

	public static void main(String[] args) {
		int n= 36;
		int i=5;
		
		int cmask = 1<<i;
		
		if((n & cmask) == 0) {
			System.out.println("OFF");
		} else {
			System.out.println("ON");
		}

	}

}
