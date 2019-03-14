import java.lang.*;
import java.util.*;

public class commentary_boxes{
	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);
		long n=sc.nextLong();
		long m=sc.nextLong();
		long a=sc.nextLong();
		long b=sc.nextLong();
	
		if((m-(n%m))*a<=(n%m)*b)
			System.out.print((m-(n%m))*a);
		else
			System.out.print((n%m)*b);
	}
}