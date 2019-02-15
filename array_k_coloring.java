import java.lang.*;
import java.util.*;

public class array_k_coloring{

	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();

		int a[]=new int[n];
		int b[]=new int[5001];
		int c[]=new int[n];	
		int p=k-1;	

		for(int j=0;j<n;j++){
			a[j]=sc.nextInt();
		}

		int i=0;
		for(i=0;(n-i)!=p;i++){
		//	System.out.println("@"+i);
		//	if(k<1){
		//	System.out.print("NO");
		//	return;
		//	}
			if(b[a[i]]==0){
				b[a[i]]=k;
				c[i]=b[a[i]];
		//		System.out.println("#"+b[a[i]]+" "+k+" "+a[i]);
			}
			else{
			//	System.out.println("*"+b[a[i]]+" "+(b[a[i]]-1)+" "+a[i]);
				
				
					
					b[a[i]]=(b[a[i]]-1);
					c[i]=b[a[i]];
					if(p>(b[a[i]]-1))
						p=(b[a[i]]-1);
					
				
				if((p)<0){
					
					System.out.println("NO");
					return;
				}
				
			}
		//	System.out.println(p);
		}
		
		
		for(;i<n;i++){
		//	System.out.println("2@"+i);
			
			c[i]=p;
			p--;
				
			
		}
		System.out.println("YES");
		for(int t=0;t<n;t++){
			System.out.print(c[t]+" ");
		}
	}
}