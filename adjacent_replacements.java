import java.util.*;
import java.lang.*;

public class adjacent_replacements{

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();

		long a=0;
		for(int i=0;i<n;i++){
			a=sc.nextLong();
			if(a%2==0) System.out.print((a-1)+" "); 
			else System.out.print((a)+" ");
		}
	}
}	