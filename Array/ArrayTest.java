package Com.ptpl;

import java.util.Scanner;

public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner( System.in );
		int  i;
		int  a[ ] = new int[5];
		
		for( i=0 ; i<5 ; i++ )
		{
			System.out.print( "Enter Value : " );
			a[ i ] = sc.nextInt();
		}
		
		System.out.print("\n Array elements are : ");
		for( i=0 ; i<5 ; i++ )
		{
			System.out.print( " " + a[ i ] );
		}
	}

}
