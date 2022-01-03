package labreport.labreport2.q2;

public class BankAccount {
    private String name, ic;
    private float balance;

    public BankAccount() {
        this.name = "";
        this.ic = "";
        this.balance = 0;
    }

    public BankAccount(String name, String ic, float balance) {
        this.name = name;
        this.ic = ic;
        this.balance = balance;
    }

    public float Balance(){
        return balance;
    }

    public void Withdraw(float x){
        balance-=x;
    }
    public void Deposit(float x){
        balance+=x;
    }

    public String toString() {
        return "BankAccount{" +
                "name='" + name + '\'' +
                ", ic='" + ic + '\'' +
                ", balance=" + balance +
                '}';
    }

}
