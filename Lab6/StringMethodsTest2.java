import java.util.Scanner;
public class StringMethodsTest2{
  String s;
  static int a,b;
  static char c1;
  
 
  public StringMethodsTest2(String s){
    this.s=s;
  }
  
  public static void main (String[]args){
    StringMethodsTest2 s1 = new StringMethodsTest2("ABCDE");
    Scanner sc=new Scanner(System.in);
    System.out.println(s1.substring(a));
    System.out.println(s1.substring(a,b));
    System.out.println(s1.indexOf(c1));
    System.out.println(s1.lastIndexOf(c1));
    System.out.println(s1.indexOf(c1,a));
    System.out.println(s1.lastIndexOf(c1,a));
    System.out.println(s1.concat());
    
  }
  public String substring(int x){
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter a word");
     String w1=sc.nextLine();
     System.out.println("Enter a number");
     //x=sc.nextInt();
     char [] array=w1.toCharArray();
     if(x>=0&&x<array.length)
     {
         for(int i=x;i<array.length;i++)
         {
             System.out.print(array[i]);
         }
     }
     return " ";
  }
  public String substring(int x,int y){
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter a word");
     String w1=sc.nextLine();
     System.out.println("Enter first number");
     x=sc.nextInt();
     System.out.println("Enter second number");
     y=sc.nextInt();
     char [] array=w1.toCharArray();
     if((x>=0&&x<y)&&(y>a&&y<array.length))
     {
         for(int i=x;i<=y;i++)
         {
             System.out.print(array[i]);
         }
     }
     return " ";
  }
  public int indexOf(char c){
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter a word");
     String w1=sc.nextLine();
     System.out.println("Enter a character");
     String w2=sc.nextLine();
     char [] a=w1.toCharArray();
     char [] b=w2.toCharArray();
     c=b[0];
     int x=-1;
     for(int i=0;i<a.length;i++)
     {
         if(a[i]==c)
         {
             x=i;
             break;
         }
     }
     return x;
  }
  public int lastIndexOf(char c){
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter a word");
     String w1=sc.nextLine();
     System.out.println("Enter a character");
     String w2=sc.nextLine();
     char [] a1=w1.toCharArray();
     char [] a2=w2.toCharArray();
     c=a2[0];
     int x=-1;
     for(int i=a1.length-1;i>=0;i--)
     {
         if(a1[i]==c)
         {
             x=i;
             break;
         }
     }
     return x;
  }
  public int indexOf(char m,int n){
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter a word");
     String w1=sc.nextLine();
     System.out.println("Enter a character");
     String w2=sc.nextLine();
     System.out.println("Enter a number");
     a=sc.nextInt();
     char [] a1=w1.toCharArray();
     char [] a2=w2.toCharArray();
     c1=a2[0];
     int x=-1;
     for(int i=a;i<a1.length;i++)
     {
         if(a1[i]==c1)
         {
             x=i;
             break;
         }
     }
     return x;
  }
 public int lastIndexOf(char m,int n){
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter a word");
     String w1=sc.nextLine();
     System.out.println("Enter a character");
     String w2=sc.nextLine();
     System.out.println("Enter a number");
     a=sc.nextInt();
     char [] a1=w1.toCharArray();
     char [] a2=w2.toCharArray();
     c1=a2[0];
     int x=-1;
     for(int i=a1.length-1;i>=a;i--)
     {
         if(a1[i]==c1)
         {
             x=i;
             break;
         }
     }
     return x;
  }
  public char concat(){
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter a word");
     String w1=sc.nextLine();
     System.out.println("Enter a second word");
     String w2=sc.nextLine();
     char [] a1=w1.toCharArray();
     char [] b1=w2.toCharArray();
     char [] c1=new char[a1.length+b1.length];
     for(int i=0;i<a1.length;i++)
     {
         c1[i]=a1[i];
     }
     int x=0;
     for(int j=a1.length;j<c1.length;j++)
     {
         c1[j]=b1[x];
         x++;
     }
     for(int k=0;k<c1.length;k++)
     {
         System.out.print(c1[k]);
     }
     return ' ';
  }
}

             
      

      
      
      
      
      
      
      
      