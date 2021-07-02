import java.util.*;
public class Task1LAB5{
    public static void main(String [] args)
   {
      System.out.println("Enter a word");
       Scanner sc=new Scanner(System.in);
       String word=sc.nextLine();
       char []a=word.toCharArray();
      
        for(int count=0;count<a.length;count++)
       {
           char largest=a[count];
           int largestsource=count;
           for(int index=count;index<a.length;index++)
           {
               if(a[index]>largest)
               {
                   largest=a[index];
                   largestsource=index;
               }
           }
           
           a[largestsource]=a[count];
           a[count]=largest;
           
        }
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]);
        }
    }
}

        
  
       
                
        
        
        
        
           
           
           
           
           
       