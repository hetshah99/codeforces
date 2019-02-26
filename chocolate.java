import java.lang.*;
import java.util.*;

public class chocolate{

	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int t=0;
		long p=0;
		int a=0;
		long s=1;
		
		
		
		for(int i=1;i<n+1;i++){
			t=sc.nextInt();

			if(t==1 && p>0){
				p++;
				s=(s*(i-a));
				a=i;
			//	System.out.println("*"+s+" "+a);
				
			}
			else if(t==1){
				a=i;
				p=1;
			}
		}
		if(p==1)
			System.out.print("1");
		else if(p==0)
			System.out.print("0");
		else
			System.out.print(s);
	}
}	