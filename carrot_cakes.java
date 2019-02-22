import java.lang.*;
import java.util.*;

public class carrot_cakes{

	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int t=sc.nextInt();
		int k=sc.nextInt();
		int d=sc.nextInt();
		int m=(d/t)*k;
//System.out.print("*"+(n-m));
		if((n-m)>k)
			System.out.print("YES");
		else
			System.out.print("NO");
	}
}