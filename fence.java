import java.util.*;
import java.lang.*;

public class fence{
	
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int p=sc.nextInt();
		int a[]=new int[n];
		int sum=0;
		int b=0;
		int min=0;
		int index=0;
		  
		for(int j=0;j<n;j++){
			a[j]=sc.nextInt();
			if(j<p){
				sum=sum+a[j];
				min=sum;
				b=0;
				index=0;
			}
			else{
				sum=sum-a[b]+a[j];
				
				if(min>sum){
					index=(j-p)+1;
					min=sum;
				}
				else;
				b=(j-p)+1;	
			}
		}
		System.out.print((index+1));
	}
}
		
		