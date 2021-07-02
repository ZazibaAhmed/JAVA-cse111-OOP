import java.util.Scanner;
public class StringMethodsTest{
  String s;
  static char a,b;
 
  public StringMethodsTest(String s){
    this.s=s;
  }
  
  public static void main (String[]args){
    StringMethodsTest s1 = new StringMethodsTest("ABCDE");
    System.out.println(s1.length());
    System.out.println(s1.charAt());
    System.out.println(s1.startsWith());
    System.out.println(s1.endsWith());
    System.out.println(s1.replaceFirst(a,b));
    System.out.println(s1.replaceAll(a,b));
    System.out.println(s1.replaceLast(a,b));
  }
  public int length (){
  char [] array=s.toCharArray();
  return array.length;
  }
  public char charAt(){
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter a word");
  String word=sc.nextLine();
  System.out.println("Enter a position");
    int n=sc.nextInt();
  char [] a=word.toCharArray();
  if(n<0||n>=a.length)
  {
    System.out.println("Invalid Index");
    return ' ';
  }
  else
  {
      return a[n];
  }
  }
  public boolean startsWith()
  {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter a word");
     String w1=sc.nextLine();
     System.out.println("Enter a second word");
     String w2=sc.nextLine();
     char [] a=w1.toCharArray();
     char [] b=w2.toCharArray();
     if(b.length>a.length){
         return false;
     }
     else{
         if(b.length==0){
             return true;
         }
         else{
             boolean x=true;
             for(int i=0;i<b.length;i++)
             {
                 if(a[i]!=b[i]){
                     x=false;
                     break;
                 }
             }
             return x;
         }
     }
  }
  public boolean endsWith()
  {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter a word");
     String w1=sc.nextLine();
     System.out.println("Enter a second word");
     String w2=sc.nextLine();
     char [] a=w1.toCharArray();
     char [] b=w2.toCharArray();
     if(b.length>a.length){
         return false;
     }
     else{
         if(b.length==0){
             return true;
         }
         else{
             boolean x=true;
             int j=a.length-1;
             for(int i=b.length-1;i>=0;i--)
             {
                 if(a[j]!=b[i]){
                     x=false;
                     break;
                 }
                 j--;
             }
             return x;
         }
     }
  }
  public String replaceFirst(char oldchar,char newchar){
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter a word");
     String w1=sc.nextLine();
     System.out.println("Enter a character");
     String b1=sc.nextLine();
     System.out.println("Enter a second character");
     String b2=sc.nextLine();
     char [] a1=b1.toCharArray();
     char [] a2=b2.toCharArray();
     a=a1[0];
     b=a2[0];
     char [] array=w1.toCharArray();
     for(int i=0;i<array.length;i++){
         if(array[i]==a)
         {
             array[i]=b;
             break;
         }
     }
     for(int i=0;i<array.length;i++)
     {
         System.out.print(array[i]);
     }
     return " ";
  }
 public String replaceAll(char oldchar,char newchar){
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter a word");
     String w1=sc.nextLine();
     System.out.println("Enter a character");
     String b1=sc.nextLine();
     System.out.println("Enter a second character");
     String b2=sc.nextLine();
     char [] a1=b1.toCharArray();
     char [] a2=b2.toCharArray();
     a=a1[0];
     b=a2[0];
     char [] array=w1.toCharArray();
     for(int i=0;i<array.length;i++){
         if(array[i]==a)
         {
             array[i]=b;
             
         }
     }
     for(int i=0;i<array.length;i++)
     {
         System.out.print(array[i]);
     }
     return " ";
  }
   public String replaceLast(char oldchar,char newchar){
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter a word");
     String w1=sc.nextLine();
     System.out.println("Enter a character");
     String b1=sc.nextLine();
     System.out.println("Enter a second character");
     String b2=sc.nextLine();
     char [] a1=b1.toCharArray();
     char [] a2=b2.toCharArray();
     a=a1[0];
     b=a2[0];
     char [] array=w1.toCharArray();
     for(int i=array.length-1;i>=0;i--){
         if(array[i]==a)
         {
             array[i]=b;
             break;
             
         }
     }
     for(int i=0;i<array.length;i++)
     {
         System.out.print(array[i]);
     }
     return " ";
   }
}
     




     



     
      
      
  

         
  
  
  
  
  

  

  
      

  
  
      
      
      
      
      
      
      
      
  


    
  