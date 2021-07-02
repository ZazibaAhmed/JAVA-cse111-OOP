import java.util.*;
public class StudentLab8{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of students");
        int n=sc.nextInt();
        Student []s=new Student[n];
        for(int i=0;i<s.length;i++)
        {
        s[i]=new Student();
        System.out.println("Enter the name");
        String x=sc.next();
        s[i].setName(x);
        System.out.println("Enter the ID");
        String y=sc.next();
        s[i].setID(y);
        }
        for(int j=0;j<s.length;j++){
            Student smallest=s[j];
            int smallestPosition=j;
            int i=smallestPosition+1;
            for(int index=i;index<s.length;index++)
            {
                String a=s[index].name; 
                String b=s[j].name;
                if(((a).compareTo(b))<0){
                    smallest=s[index];
                    smallestPosition=index;
                }
                s[smallestPosition]=s[j];
                s[j]=smallest;
            }
        }
        for(int i=0;i<s.length;i++){
            System.out.println("Student Name:"+s[i].getName()+",Student ID:"+s[i].getID());
        }
    }
}

            
            
            
            
            
            
            
        
            
            
            
            
            
            
                