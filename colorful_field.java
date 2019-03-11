import java.util.*;
import java.lang.*;

public class colorful_field{

	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);

		int n=sc.nextInt();
		int m=sc.nextInt();
		int k=sc.nextInt();
		int t=sc.nextInt();
		int p=0;
		int h=1;

		int s[]=new int[k+1];
	
		p=0;
		for(int j=0;j<k;j++){

			s[j]=(((sc.nextInt()-1)*m)+((sc.nextInt()-1)));
	//		System.out.println(s[j]);
		}
		s[k]=(n*m)+1;
		
		Arrays.sort(s);
		

		int c=0;
		for(int l=0;l<t;l++){
			p=(((sc.nextInt()-1)*m)+((sc.nextInt()-1)));
			c=p;
			h=1;
		//	System.out.println("#"+c);
			for(int i=0;i<(k+1);i++){
				if(p==s[i]){
					System.out.println("Waste");
					h=-1;
					break;
				}
			}
			if(h!=-1){
			for(int y=0;y<(k+1);y++){
				if(s[y]<p){
					c=c-1;
					h=1;
				//	System.out.println("*"+s[y]+" "+c+" ");
					continue;
					
				}
				else break;
				
			}}
			if(h==1){
				if(c%3==0)
					System.out.println("Carrots");
				else if(c%3==1)
					System.out.println("Kiwis");
				else
					System.out.println("Grapes");
			}
		

		}

	}
}
