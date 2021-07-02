import java.util.Scanner;
public class StringMethodsTest1{
  String s;
  
 
  public StringMethodsTest1(String s){
    this.s=s;
  }
  
  public static void main (String[]args){
    StringMethodsTest1 s1 = new StringMethodsTest1("ABCDE");
    System.out.println(s1.toLowerCase());
    System.out.println(s1.toUpperCase());
    System.out.println(s1.equals());
    System.out.println(s1.equalsIgnoreCase());
    System.out.println(s1.compareTo());
    System.out.println(s1.compareToIgnoreCase());
    
  }
  public String toLowerCase(){
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter a word");
     String w1=sc.nextLine();
     char []array=w1.toCharArray();
     for(int i=0;i<array.length;i++){
         if((int)array[i]>=65&&(int)array[i]<=90){
             int x=((int)array[i])+32;
             array[i]=(char)x;
         }
     }
     for(int j=0;j<array.length;j++)
     {
         System.out.print(array[j]);
     }
     return " ";
  }
  public String toUpperCase(){
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter a word");
     String w1=sc.nextLine();
     char []array=w1.toCharArray();
     for(int i=0;i<array.length;i++){
         if((int)array[i]>=97&&(int)array[i]<=122){
             int x=((int)array[i])-32;
             array[i]=(char)x;
         }
     }
     for(int j=0;j<array.length;j++)
     {
         System.out.print(array[j]);
     }
     return " ";
  }
  public boolean equals(){
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter a word");
     String w1=sc.nextLine();
     System.out.println("Enter a second word");
     String w2=sc.nextLine();
     char [] a=w1.toCharArray();
     char [] b=w2.toCharArray();
     if(b.length!=a.length){
         return false;
     }
     else
     {
         boolean x=true;
         for(int i=0;i<a.length;i++)
         {
             if(a[i]!=b[i])
             {
                 x=false;
                 break;
             }
         }
         return x;
     }
  }
  public boolean equalsIgnoreCase(){
      Scanner sc=new Scanner(System.in);
     System.out.println("Enter a word");
     String w1=sc.nextLine();
     System.out.println("Enter a second word");
     String w2=sc.nextLine();
     char [] a=w1.toCharArray();
     char [] b=w2.toCharArray();
     if(b.length!=a.length){
         return false;
     }
     else
     {
         boolean x=true;
         int y,z;
         for(int i=0;i<a.length;i++)
         {
             y=((int)a[i])+32;
             z=((int)a[i])-32;
             if((a[i]==b[i]||(char)y==b[i]||(char)z==b[i]))
             {
             }
             else
             {
                 x=false;
                 break;
             }
         }
         return x;
     }
  }

     public int compareTo(){
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter a word");
     String w1=sc.nextLine();
     System.out.println("Enter a second word");
     String w2=sc.nextLine();
     char [] a=w1.toCharArray();
     char [] b=w2.toCharArray();
     int x=0;
      if(b.length==a.length)
     {
         for(int i=0;i<b.length;i++)
         {
             if(a[i]!=b[i])
             {
                 x=((int)b[i])-((int)a[i]);
                 break;
             }
             else
             {
                 x=0;
             }
         }
        }
      else
      {
          if(b.length>a.length)
          {
              for(int i=0;i<a.length;i++)
              {
                  if(a[i]!=b[i])
               {
                 x=((int)b[i])-((int)a[i]);
                 break;
               }
                else
               {
                 x=b.length-a.length; 
               }
              }
              
          }
          else
           {
              for(int i=0;i<b.length;i++)
              {
                  if(a[i]!=b[i])
               {
                 x=((int)b[i])-((int)a[i]);
                 break;
               }
                else
               {
                 x=b.length-a.length;
                }
              }
          }
      }
      return x;
     }
     public int compareToIgnoreCase(){
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter a word");
     String w1=sc.nextLine();
     System.out.println("Enter a second word");
     String w2=sc.nextLine();
     char [] a=w1.toCharArray();
     char [] b=w2.toCharArray();
     int x=0;
      if(b.length==a.length)
     {
         for(int i=0;i<b.length;i++)
         {
             int m=((int)b[i])+32;
             int n=((int)b[i])-32;
             if(!(a[i]==b[i]||a[i]==(char)m||a[i]==(char)n))
             {
                 x=((int)b[i])-((int)a[i]);
                 break;
                 
             }
             else
             {
                 x=0;
             }
         }
        }
      else
      {
          if(b.length>a.length)
          {
              for(int i=0;i<a.length;i++)
              {
                  int m=((int)b[i])+32;
                  int n=((int)b[i])-32;
                  if(!(a[i]==b[i]||a[i]==(char)m||a[i]==(char)n))
               {
                 x=((int)b[i])-((int)a[i]);
                 break;
               }
                else
               {
                 x=b.length-a.length; 
               }
              }
              
          }
          else
           {
              for(int i=0;i<b.length;i++)
              {
                   int m=((int)b[i])+32;
                  int n=((int)b[i])-32;
                  if(!(a[i]==b[i]||a[i]==(char)m||a[i]==(char)n))
               {
                 x=((int)b[i])-((int)a[i]);
                 break;
               }
                else
               {
                 x=b.length-a.length;
                }
              }
          }
      }
      return x;
     }
}

                 
              
          
          
          
          
          
          
        



                 
         
      



             
  


      
      
      
      
      
      
      
      
      
      