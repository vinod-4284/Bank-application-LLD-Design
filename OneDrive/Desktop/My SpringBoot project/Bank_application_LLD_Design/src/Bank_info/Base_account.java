package Bank_info;

public class Base_account implements Bank{
    int balance;
    public Base_account(){
        balance=0;
    }

    @Override
    public void Deposite(int amount) {
        balance += amount;
        System.out.println("Deposited "+amount+" Successfully");
    }

    @Override
    public void Withddraw(int amount) {
        if(amount>balance){
            System.out.println("Insufficient Balance");
            return;
        }
        balance -= amount;
        System.out.println("Withdrawal "+amount+" Successfully");
    }

    @Override
    public int balance() {
        return balance;
    }
}
