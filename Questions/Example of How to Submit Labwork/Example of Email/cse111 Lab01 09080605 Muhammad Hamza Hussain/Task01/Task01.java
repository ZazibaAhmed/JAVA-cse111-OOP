import java.util.Scanner;
public class Task01{
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        int number1, number2, answer;
        
        number1 = keyboard.nextInt();
        number2 = keyboard.nextInt();
        
        answer = number1 + number2;
        System.out.println(answer);
    }
}