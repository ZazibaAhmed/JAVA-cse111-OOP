import java.util.*;
public class Task1_Lab5{
  public static void main(String  []args){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter a sentence");
      String s=sc.nextLine();
      char []a=s.toCharArray();
      int l=0;
      for(int i=0;i<a.length;i++)
      {
          if((a[i]==' ')&&(a[i+1]==' '))
          {
          }
          else{
            l+=1;
          }
      }
      char []b=new char[l];
      int index=0;
      for(int i=0;i<a.length;i++)
      {
          if((a[i]==' ')&&(a[i+1]==' '))
          {
              index=index-1;
              
          }
          else{
            b[index]=a[i];
          }
          index++;
      }
      for(int j=0;j<b.length;j++){
          System.out.print(b[j]);
      }
  }
}
  

  


      
              
              
      
 
  
  
    