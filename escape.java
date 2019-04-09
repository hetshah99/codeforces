import java.util.*;
import java.lang.*;

public class escape{

	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		double vp=sc.nextDouble();
		double vd=sc.nextDouble();
		double t=sc.nextDouble();
		double f=sc.nextDouble();
		double c=sc.nextDouble();
		
		double p=vp*t;
		double d=0;
		double b=0;
		
		while(p<c){
	//		System.out.print((vd*(p/(vd-vp)))+"* ");
			if((vd*(p/(vd-vp)))<c && (vd*(p/(vd-vp)))>0){
				b++;
				p=((vd*(p/(vd-vp)))+(((p/(vd-vp))+f)*vp));
	//			System.out.print(p+"# ");
			}
			else
				break;
		}
		
		System.out.print((int)b);
	}
}