import java.lang.*;
import java.util.*;

public class fly{
		
	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		double f=sc.nextLong();
		double total=0;
		double t[]=new double[n];
		double l[]=new double[n];

		for(int i=0;i<(n);i++){
			t[i]=sc.nextDouble();
			if(t[i]==1){
				System.out.print("-1");
				return;
			}
		//	total=total+(f/(t-1));
		}

		for(int j=0;j<n;j++){
			l[j]=sc.nextDouble();
			if(l[j]==1){
				System.out.print("-1");
				return;
			}
		}
		
		total=f;
		for(int k=0;k<(n);k++){
			
				total=total+(total/(l[k]-1));
			
		
			
				total=total+(total/(t[(n-1)-k]-1));
	
			
		}
		total=total-f;
		System.out.print(total);
	}
}