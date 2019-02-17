import java.lang.*;
import java.util.*;

public class black_square{
   public static void main(String args[]){

      Scanner sc = new Scanner(System.in);
      int n[]= new int[4];
      int c=0;
     
      for(int i=0;i<4;i++){
          n[i]=sc.nextInt();
       }

       String s=sc.nextLine();
              s=sc.nextLine(); 
       
       char a[]=s.toCharArray();
 
       for(int j=0;j<a.length;j++){
          c=c+n[(int)a[j]-49];  
    }

      System.out.print(c);   
   }
}