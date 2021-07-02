public class SavingsAccount extends Account{
    public double computeInterest(){
        double interest=balance*(5/100);
    }
    public void withdraw(double x){
        if( x>500){
            System.out.println("Withdrawal is no t allowed.");
        }
        else{
            balance-=x;
        }
    }
}
            
   

    