import java.util.*;
import java.lang.*;

public class colorful_stones{

	public static void main(String args[]){

		Scanner sc= new Scanner(System.in);
		String s=sc.nextLine();
		char a[]=s.toCharArray();
		s=sc.nextLine();
		char b[]=s.toCharArray();
		int p=0;

		for(int i=0;i<b.length;i++){
			if((int)a[p]==(int)b[i])
				p++;
			else
				continue;
		}
		System.out.print(p+1);
	}
}