package Bit_manipulation;
import java.util.*;
public class count_of_no_of_1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n= scan.nextInt();
		int count = 0;
		while(n>0)
		{
			n = n & (n-1);  //count untill it becomes zero.
			count++;
		}
		System.out.println(count);
		
		scan.close();

	}

}
