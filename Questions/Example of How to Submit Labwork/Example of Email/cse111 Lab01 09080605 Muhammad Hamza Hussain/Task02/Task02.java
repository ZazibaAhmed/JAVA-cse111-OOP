import java.util.Scanner;
public class Task02{
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        int number1, number2, number3, answer;
        
        number1 = keyboard.nextInt();
        number2 = keyboard.nextInt();
        number3 = keyboard.nextInt();
        answer = number1 * number2 * number3;
        
        System.out.println(answer);
    }
}
