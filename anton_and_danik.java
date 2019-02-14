import java.util.*;

public class anton_and_danik{
  
   public static void main(String arg[]){
 
      Scanner sc = new Scanner(System.in);
      int n=sc.nextInt();
      int c=0;

      String s=sc.nextLine();
      s=sc.nextLine();

      char a[]=s.toCharArray();
   
      for(int i=0;i<n;i++){
        
          if(a[i]=='A')
             c++;
          else
             c--;
       }
  
      if(c>0)
        System.out.print("Anton");
      else if(c<0)
        System.out.print("Danik");
      else
        System.out.print("Friendship");
  }
}
          