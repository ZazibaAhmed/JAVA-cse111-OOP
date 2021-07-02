import java.util.Scanner;
public class HappppyNumber {
  public static void main(String [] args) {
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    int j=100;
    while(j>=10) {
      int sum=0;
      for(int i=0;i<s.length();i++){
        int n=s.codePointAt(i)-48;
        sum=sum+(n*n);
      }
      s=sum+"";
      j=sum;
    }
    if(j==1) {
      System.out.println("HAPPY NUMBER :)");
    }
    else  {
      System.out.println("UNHAPPY :(");
    }
  }
}