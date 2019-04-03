import java.util.*;
import java.lang.*;

public class die_roll{

	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		int y=sc.nextInt();
		int w=sc.nextInt();
		int m=0;
		if(y<=w)
			m=w;
		else
			m=y;

		if((7-m)==1)
			System.out.print("1/6");
		else if((7-m)==2)
			System.out.print("1/3");
		else if((7-m)==3)
			System.out.print("1/2");
		else if((7-m)==4)
			System.out.print("2/3");
		else if((7-m)==5)
			System.out.print("5/6");
		else
			System.out.print("1/1");
	}
}