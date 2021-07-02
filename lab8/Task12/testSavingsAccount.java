public class testSavingsAccount{
    public static void main(String []args){
        SavingsAccount saver1=new SavingsAccount(20000);
        SavingsAccount saver2=new SavingsAccount(30000);
        SavingsAccount.modifyInterestRate(4.2);
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();
        saver1.printSavingsBalance();
        saver2.printSavingsBalance();
        SavingsAccount.modifyInterestRate(5.5);
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();
        saver1.printSavingsBalance();
        saver2.printSavingsBalance();
    }
}
        