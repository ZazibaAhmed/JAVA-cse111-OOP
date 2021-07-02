import java.util.Scanner;
public class Myclass{
  public int readInteger() throws  EitaIntegerNoiException{
     Scanner k = new Scanner(System.in);
      
        int answer;
        
        String s=k.nextLine();
        if (s.contains("."))
        {
          throw new EitaIntegerNoiException();
         
        }
        else{ 
          answer=Integer.parseInt(s);
          return answer;
          
        }
    }
}
    
    