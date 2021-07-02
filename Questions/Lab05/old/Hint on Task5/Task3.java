import java.util.Scanner;
class Task3{
    public static void main(String[]args){
        
      try{
        Scanner sc=new Scanner(System.in);
        int x,n=sc.nextInt();
        int a[]=new int[n];
        
        a[5]=99;
        x=n/0;
      }
      catch(ArrayIndexofBoundException e)
      {
      
        System.out.println(e);
      }
      finally
      {
        System.out.println("The End");
      }
    }
}
