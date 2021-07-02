import java.util.Scanner;
public class Task2_Lab5
{
  public static void main (String [] args)
  {
    Scanner sc=new Scanner (System.in);
    System.out.println ("Enter a word");
    String s=sc.nextLine();
    char [] a = s.toCharArray();
    char []b=new char[26];
    for (int i=0; i<a.length; i++)
    {
        for(int j=65; j<=90;j++){
            int x=(int)a[i];
            if(x==j){
                b[j-65]+=1;
            }
        }
    }
   
      char max=b[0];
      int position=0;
      for (int j=0; j<b.length; j++)
      {
          if (b[j]>max)
          {
            max=b[j];
            position=j;
            
          }
      }
      int max2,position2;
      if(b[0]==max){
      max2=b[1];
      position2=1;
      }
      else{
      max2=b[0];
      position2=0;
      }    
      for (int j=0; j<b.length; j++)
      {
          //if(!(b[j]==max)){
              
          if ((b[j]>max2)&&(!(b[j]==max)))
          {
            max2=b[j];
            position2=j;
            
          }
     // }
      }
      int h=position2 +65;
      int p=max2;
      System.out.println(p+" "+(char)h);
  }
}

      
    
      