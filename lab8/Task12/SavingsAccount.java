public class SavingsAccount{
    public static double annualInterestRate;
    private double savingsBalance;
    public SavingsAccount(double x){
        savingsBalance=x;
    }
    public void printSavingsBalance(){
        System.out.println(savingsBalance);
    }
    public static void modifyInterestRate(double y){
        annualInterestRate=y;
    }
    public void calculateMonthlyInterest(){
        double monthlyRate;
        monthlyRate=(savingsBalance*(annualInterestRate/100))/12;
        savingsBalance+=monthlyRate;
    }
}