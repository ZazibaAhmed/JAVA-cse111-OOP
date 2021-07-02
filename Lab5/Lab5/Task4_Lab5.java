import java.util.*;
public class Task4_Lab5{
  public static void main(String  []args){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the size the array");
      int s=sc.nextInt();
      int []a=new int[s];
      System.out.println("Enter all the values");
      for(int i=0;i<a.length;i++){
          a[i]=sc.nextInt();
      }
      int l=0;
      for(int i=0;i<a.length;i++)
      {
          if(a[i]%2!=0)
          {
          }
          else{
            l+=1;
          }
      }
      int []b=new int[l];
      int index=0;
      for(int i=0;i<a.length;i++)
      {
          if(a[i]%2!=0)
          {
              index=index-1;
              
          }
          else{
            b[index]=a[i];
          }
          index++;
      }
      System.out.println("new length: "+b.length);
      for(int j=0;j<b.length;j++){
         
          System.out.println(b[j]);
      }
  }
}