import java.lang.*;
import java.util.*;

public class decoding{

	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		String s=sc.nextLine();
		s=sc.nextLine();
		char a[]=s.toCharArray();
		char b[]=new char[n];
		int c=((n-1)/2);

		for(int i=0;i<n;i++){
			
			if((n-i)%2==0){
				c=c-i;
				b[c]=a[i];			

			}
			else{
				c=c+i;
				b[c]=a[i];
			
			}
		}
		String t=String.valueOf(b);
		System.out.print(t);
	}
}

