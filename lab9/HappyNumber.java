import java.util.Scanner;
public class HappyNumber {
  public static void main(String [] args) {
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    long j=0;
    int sum=0;
    while(j<1000000) {
       sum=0;
      for(int i=0;i<s.length();i++){
        int n=s.codePointAt(i)-48;
        sum=sum+(n*n);
      }
      s=sum+"";
      if(sum==1||sum==4) {
        break;
      }
    }
    if(sum==1) {
      System.out.println("HAPPY NUMBER :)");
    }
    else  {
      System.out.println("UNHAPPY :(");
    }
  }
}