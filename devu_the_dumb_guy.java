import java.util.*;
import java.lang.*;

public class devu_the_dumb_guy{

	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);

		int n=sc.nextInt();
		long h=sc.nextLong();
		int a[]=new int[n];

		for(int j=0;j<n;j++){
			a[j]=sc.nextInt();
		}
		
		Arrays.sort(a);
		
		long total=0;
		for(int i=0;i<n;i++){
			
			
			if(h>1){
				total=total+(h*a[i]);
				h--;
			}
			else{
				total=total+(a[i]);
			}
		}
		
		System.out.print(total);
	}
}
				
