import java.util.Scanner;
public class Task6_lab9{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        String s=sc.nextLine();
        int sum=0,j=0;
        while(j<50){
        sum=0;
        for(int i=0;i<s.length();i++){
        int x=s.codePointAt(i)-48;
        int n=x*x;
        sum+=n;
        }
        s=sum+"";
        if(sum==1)
        {
            break;
        }
        j++;
        }
        if(sum==1){
        System.out.println("Happy Number");
        }
        else{
        System.out.println("Unhappy Number");
        }
    }
}
            

        