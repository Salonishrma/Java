public class BankAccount{
    private double balance;
    //constructor 
    public BankAccount(double startingBalance){
        if(startingBalance>=0){
            this.balance=startingBalance;
        }
        else{
            System.out.println("negative balance is not Possible");
        }
    }
    //method for deposit
    public void deposit(double money){
        if(money>0){
            this.balance+=money;
        }
        else{
            System.out.println("Sorry! Deposite amount should be positive.");
        }
    }
    public void withdraw(double money){
        if(money>0 && money<=balance){
            this.balance-=money;
            System.out.println("Your "+ money +" rupees withdrawn successfully.");
        }
        else{
            System.out.println("Sorry! invalid withdraw amount.");
        }
    }
    public double getBalance() {
        return balance;
    }
}
