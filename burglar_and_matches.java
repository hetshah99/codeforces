import java.util.*;
import java.lang.*;

public class burglar_and_matches{

	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int a[]=new int[m];
		int b[]=new int[m];
		int max=0;
		int pm=0;
		int total=0;
		int o=0;
		
		for(int j=0;j<m;j++){
			a[j]=sc.nextInt();
			b[j]=sc.nextInt();
		}
		while(n>0){
			max=0;
			for(int i=0;i<m;i++){
				if(b[i]>=max){
					max=b[i];
					pm=i;
					
			//		System.out.print("*"+pm);
				}
				else;
			}
			o++;
			if((n-a[pm])>0){
				total=total+(a[pm]*b[pm]);
			//	System.out.print("#"+total);
			}
			else{
				total=total+(n*b[pm]);	
			//	System.out.print("#"+total);		
			}
			n=n-a[pm];
			b[pm]=0;
			if(o<m)
				continue;
			else
				break;
			
		}
		System.out.print(total);
	}
}
				