package Composite;
import java.util.List;
import java.util.ArrayList;

abstract class Account{
    public abstract float getBalance();
}

class DepositAccount extends Account{
    private String accountno;
    private float accountbalance;

    public DepositAccount(String accountno, float accountbalance){
        super();
        this.accountno = accountno;
        this.accountbalance = accountbalance;
    }

    public float getBalance(){
        return accountbalance;
    }
}

class SavingsAccount extends Account{
    private String accountno;
    private float accountbalance;

    public SavingsAccount(String accountno, float accountbalance){
        super();
        this.accountno = accountno;
        this.accountbalance = accountbalance;
    }

    public float getBalance(){
        return accountbalance;
    }
}

class CompositeAccount extends Account{
    private float totalBalance;

    private List<Account> accountList = new ArrayList<Account>();

    public float getBalance(){
        totalBalance = 0;
        for(Account f : accountList){
            totalBalance = totalBalance + f.getBalance();
        }
        return totalBalance;
    }

    public void AddAccount(Account acc){
        accountList.add(acc);
    }

    public void RemoveAccount(Account acc){
        accountList.remove(acc);
    }
}


public class Client {
    public static void main(String args[]){

        CompositeAccount composite = new CompositeAccount();

        composite.AddAccount(new DepositAccount("DA001", 1000));
        composite.AddAccount(new DepositAccount("DA002", 2000));
        composite.AddAccount(new SavingsAccount("SA001", 3000));

        float totalBalance = composite.getBalance();
        System.out.println("Total Balance : "+totalBalance);
    }
}
