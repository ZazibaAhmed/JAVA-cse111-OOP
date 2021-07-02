import java.util.Scanner;
public class task2_Lab5{
    public static void main(String []args){
        System.out.println("Enter a word");
        Scanner sc=new Scanner(System.in);
        String w=sc.nextLine();
        char []a=w.toCharArray();
        int []b=new int[26];
        
        for(int i=0;i<a.length;i++)
        {
            b[((int)a[i])-65]=[((int)a[i])-65]+1;
            
        }
            
         for(int i=0;i<b.length;i++)
        {
            int min=b[i];
            int minPosition=i;
            
            for(int j=i+1;j<b.length;j++)
            {
                if(b[j]<min)
                {
                    min=a[j];
                    minPosition=j;
                }
            }
            b[minPosition]=a[i];
            b[i]=min;
        }
         
        