import java.util.*;
import java.lang.*;

public class free_ice_cream{

	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		long x=sc.nextLong();
	//	System.out.print(x);
		int c=0;	
				
		for(int j=0;j<n;j++){
			
			String s=sc.next();
			long i=sc.nextLong();
	//		System.out.print(s+i);
			if(s.equals("+")){
				x=x+i;
			}
			else{
				if(x<i)
					c++;
				else
					x=x-i;
			}
	//	System.out.print(x+" "+c);
		}
		System.out.print(x+" "+c);
	}
}