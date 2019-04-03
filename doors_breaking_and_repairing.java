import java.lang.*;
import java.util.*;

public class  doors_breaking_and_repairing{
	
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int x=sc.nextInt();
		int y=sc.nextInt();
		int c=0;
		
		for(int i=0;i<n;i++){
			int t=sc.nextInt();
			if(t<=x)
				c++;
		//	System.out.print(c);
		}

		if(x>y)
			System.out.print(n);
		else if(c%2==0)
			System.out.print((c/2));
		else
			System.out.print(((c/2)+1));
	}
}