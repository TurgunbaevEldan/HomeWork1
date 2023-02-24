public class Account {
    double balance;
    public void deposit(int plus){
        System.out.println("replenishment:");
        System.out.println("balance:");
        System.out.println(balance+plus);
    }
    public void withdrawal( int minus){
        System.out.println("cash out:");
        System.out.println("balance:");
        System.out.println(balance-minus);
    }
    public void transfer (Account account3, int a){
        System.out.println("transfer: account1:");
        account3.balance+=3;
        System.out.println("balance:");
        System.out.println(account3.balance);
        Account account = new Account();
        System.out.println("transfer: account3");
        account.balance-=a;
        System.out.println(account.balance);
    }
}
