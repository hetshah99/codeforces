import java.lang.*;
import java.util.*;

public class boy_or_girl{

    public static void main(String args[]){
       int c=0;
     Scanner sc = new Scanner(System.in);

      String s=sc.nextLine();
   
      char a[]=s.toCharArray();
 
      int b[] = new int[26];

      for(int i=0;i<a.length;i++){

          b[(int)a[i]-97]++;
       }

      for(int j=0;j<26;j++){
           if(b[j]!=0)
             c++;
           else;

        }
      
          if(c%2==0)
            System.out.print("CHAT WITH HER!");
          else
            System.out.print("IGNORE HIM!");
      }
}