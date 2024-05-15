package Bit_manipulation;
import java.util.*;
public class Decimal_to_binary {
	
	public static String decimal_to_binary(int n)  //Decimal_to_binary
	{ 
		String b ="";

			while(n>=1) 
			{	
				int x=n%2;
				n=n/2;
				b=x+b;
			}
			return b;
	}
	
	public static int binary_to_decimal(String b)  //Binary_to_decimal
	{
		
		int result = 0;
		int powof2 = 1;

		for(int i=b.length()-1;i>=0;i--)
		{
			if(b.charAt(i) == '1')  	    //if 1 go inside  or else mmove to previous backwords.
			{
				result = result + powof2;   //1)0+1 =1(1)  //2)0+2=2  //3)0+4
			}
			powof2 = powof2 * 2;            // 1*2=2         //2*2=4    //4*2=8
		}
		return result;
	}
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n= scan.nextInt();
		
		String b =decimal_to_binary(n);
		System.out.println(b);
		
		System.out.println(binary_to_decimal(b));
		
		
		

		scan.close();
	}

}
