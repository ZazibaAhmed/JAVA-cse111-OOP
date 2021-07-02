import java.io.*;
import java.util.Scanner;
public class task6_lab10{
  public static void main(String []args){
   
    try{
    String amarFileNameAndLocation  = "C:\\Users\\15201018\\Desktop\\a.txt";
    File amarFile = new File ( amarFileNameAndLocation );
    Scanner s=new Scanner (amarFile);
  String ektaLine;
   ektaLine = s.nextLine();
   int x = Integer.parseInt(ektaLine); 

   String Line;
   Line = s.nextLine();
   int y = Integer.parseInt(Line); 
   
   String tline;
   tline = s.nextLine();
   int z = Integer.parseInt(tline); 

    System.out.println(x+y+z);
    }
    catch(FileNotFoundException a){
      System.out.println(a);
    }
   
    }
}




   