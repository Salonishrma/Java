public class Assignment_3 {
        public static void main(String[] args) {
            BankAccount obj = new BankAccount(100);
            System.out.println("Current balance: " + obj.getBalance());
            obj.deposit(20);
            obj.withdraw(40);
            obj.withdraw(300);
            System.out.println("Current balance: " + obj.getBalance());
        }
      
}
