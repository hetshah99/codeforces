import java.util.*;
import java.lang.*;

public class Cf40
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		int arr[] = new int[n+1];
		int i,j,k;
		for(i=0;i<n;i++)
		{
			int a=in.nextInt();
			arr[a]=i+1;
		}
		int m=in.nextInt();
		long count1=0,count2=0;
		while(m>0)
		{
			int q=in.nextInt();
			count1=count1+arr[q];
			count2=count2+n+1-arr[q];
			m--;
		}
		System.out.println(count1 + " " +count2);
	}
}			