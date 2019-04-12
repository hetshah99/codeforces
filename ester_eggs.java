import java.lang.*;
import java.util.*;

public class ester_eggs{

	public static void main(String args[]){

	Scanner sc = new Scanner(System.in);
	int n=sc.nextInt();
	char ar[]={'R','O','Y','G','B','I','V'};
	int m=(n/7);
	int r=(n%7);
	
	for(int i=0;i<m;i++){
		int p=0;	
		while(p!=7){
			System.out.print(ar[p]);
			p=1+p;
		}
	}
	if(r>3){
		for(int j=0;j<r;j++){
			System.out.print(ar[j]);
		}
	}
	else{
		int x=4-r;
		for(int k=x;(k-x)<r;k++){
			System.out.print(ar[k]);
		}
	}
	}
}