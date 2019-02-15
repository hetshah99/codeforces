import java.util.*;
import java.lang.*;

public class anton_and_letter{

	public static void main(String rgs[]){
		Scanner sc =new Scanner(System.in);

		String s=sc.nextLine();
		char a[]=s.toCharArray();

		int b[]=new int[26];
		int c=0;

		for(int i=0;i<a.length;i++){
			if((int)a[i]>=97 &&(int)a[i]<=122){
				if(b[((int)a[i]-97)]==0){
					b[((int)a[i]-97)]++;
					c++;
				}
			}
		}
		System.out.print(c);
	}
}
