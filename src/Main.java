import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //TODO HOME WORK #11
//        Account деген класс түзүңүз, анын сөзсүз double balance = 1000; деген полясы болсун
//        жана сиз каалагандай поля кошсоңуз болот.
//        deposit() - баланска акча кошот,
//        withdrawal() - баланстан акча алат
//        методдору болсун.
//        main методдон 2-3 account түзүп ар кандай операцияларды жасаңыз.

        Scanner sc = new Scanner(System.in);
        Account account = new Account();
        account.balance=5000;
        account.deposit(sc.nextInt());

        Account account1 = new Account();
        account1.balance=3000;
        account1.withdrawal(sc.nextInt());

        Account account2 = new Account();
        account2.balance= 2000;
        account2.deposit(sc.nextInt());

        Account account3 = new Account();
        account3.balance= 0;
        account1.transfer(account3, sc.nextInt());
        System.out.println(account1.balance);
    }
}