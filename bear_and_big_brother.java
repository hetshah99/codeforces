import java.util.*;

public class bear_and_big_brother{
  
   public static void main(String arg[]){
 
      Scanner sc = new Scanner(System.in);
      int l=sc.nextInt();
      int b=sc.nextInt();
      int c=0;

      while(l<=b){
             
            l=l*3;
            b=b*2;
             c++;     
       }
  
        System.out.print(c);
  }
}
