import java.util.*;
import java.lang.*;

public class caisa_and_pylons{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int a=0;
		int c=0;

		for(int j=0;j<n;j++){
			a=sc.nextInt();
			if(a>c)
				c=a;
			else
				continue;
		}
		System.out.print(c);
	}
}

			
					
				