package User_info;

import java.util.HashMap;

public class user implements IUser {
    private final HashMap<String, String> UserDB = new HashMap<>();
    int account_count =0;

    @Override
    public void create_account(String UserName, String password) {
        if (UserDB.containsKey(UserName)) {
            System.out.println("Account already exists for " + UserName);
            account_count++;
            return;
        }
        UserDB.put(UserName, password);
        System.out.println("Account created for " + UserName);
    }

    @Override
    public void delete_account(String UserName) {
        if(UserDB.containsKey(UserName)) {
            UserDB.remove(UserName);
            System.out.println("Account deleted for " + UserName);
            account_count--;
            return;
        }
        System.out.println("Account not found for " + UserName);

    }

    @Override
    public void ATM(String UserName) {
        if(UserDB.containsKey(UserName)) {
            System.out.println("ATM found for " + UserName + " You can access ATM machine");
            return;
        }
        System.out.println("ATM NOT found for " + UserName + " You can't not  access ATM machine");
    }

    public int NumberofAccounts() {
        return account_count;
    }
}
