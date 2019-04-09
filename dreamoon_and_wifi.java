import java.util.*;
import java.lang.*;

public class dreamoon_and_wifi{

	public static void main(String args[]){
	
		Scanner sc  = new Scanner(System.in);

		String x=sc.nextLine();
		int n=x.length();
		char a[]= x.toCharArray();

		x=sc.nextLine();
		x=sc.nextLine();
		char b[]= x.toCharArray();

		

		int g=0;
		int f=0;
		int u=0;

		for(int i=0;i<n;i++){
			if(a[i]=='+')
				g++;
			else
				g--;
			if(b[i]=='+')
				f++;
			else if(b[i]=='-')
				f--;
			else
				u++;
		}

		int t=Math.pow(2,u);
		int p=0;

		for(int j=0;j<t;j++){
			