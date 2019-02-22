import java.util.*;
import java.lang.*;

public class buy_a_shovel{

	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		int k=sc.nextInt();
		int r=sc.nextInt();
		for(int i=1;i<11;i++){
			if((i*k)%10 == 0 ||((i*k)-r)%10 == 0){
				System.out.print(i);
				break;
			}
			else
				continue;
		}
	}
}