package labreport.labreport2.q2;

public class q2 {
    public static void main(String[] args) {
        BankAccount a = new BankAccount("lebron","18102002",1000000);
        a.Withdraw(20000);
        System.out.println(a.toString());
        a.Deposit(10000);
        System.out.println(a.toString());
    }
}
