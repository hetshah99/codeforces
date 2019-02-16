import java.lang.*;
import java.util.*;

public class bear_and_finding_criminals{

	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int a=sc.nextInt();
		int s[]=new int[n];
		a=a-1;
		
		int t=0;
		
		for(int j=0;j<n;j++){
			s[j]=sc.nextInt();
		}
		for(int i=1;i<n;i++){

			int c=-1;

			if((a-i)>=0){
				if(s[(a-i)]==1)
					c=1;
				else if((a+i)<n)
					c=-1;
				else
					c=0;
			}
			else
				c=0;
			
			
			
			if((a+i)<n){
				if((s[(a+i)]==1) && c>-1){
					t=t+c+1;
				}
				else;
			}
			else
				t=t+c;
		}
		System.out.print(t+s[a]);
	}
}
				
							
			