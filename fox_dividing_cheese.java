import java.lang.*;
import java.util.*;

public class fox_dividing_cheese{

	public static void main(String args[]){

		Scanner in = new Scanner(System.in);
		int a=in.nextInt();
		int b=in.nextInt();
		int count1=0,count2=0,count3=0,count21=0,count22=0,count23=0;
		if(a==b)
		{
			System.out.println("0");
			return;
		}
		while(a%2==0)
		{
			count1++;
			a=a/2;
		}
		while(a%3==0)
		{
			count2++;
			a=a/3;
		}
		while(a%5==0)
		{
			count3++;
			a=a/5;
		}
		while(b%2==0)
		{
			count21++;
			b=b/2;
		}
		while(b%3==0)
		{
			count22++;
			b=b/3;
		}
		while(b%5==0)
		{
			count23++;
			b=b/5;
		}
		if(a==b)
		{
			System.out.println((Math.abs(count1-count21)+Math.abs(count2-count22)+Math.abs(count3-count23)));
		}
		else
		{
			System.out.println("-1");
		}
	}
}