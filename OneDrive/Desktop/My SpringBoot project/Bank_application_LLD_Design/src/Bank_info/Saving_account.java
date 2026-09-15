package Bank_info;

public class Saving_account extends Base_account {
    private static final int MIN_BALANCE = 500;

    public Saving_account() {
        super();
    }

    @Override
    public void Withddraw(int amount) {
        if (balance() - amount < MIN_BALANCE) {
            System.out.println("Cannot withdraw. Minimum balance of " + MIN_BALANCE + " must be maintained.");
            return;
        }
        super.Withddraw(amount);
    }
}
