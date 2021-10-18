package JavaConceptsAssignment.GettersAndSetters;

import lombok.Getter;
import lombok.Setter;

public class Customer {
    public @Setter@Getter String Name;
    private int AccountNumber=112233;
    private int Balance;


    public int getAccountNumber(int password) {
        if(password==124) {
            return AccountNumber;
        }
        System.out.println("InvalidUser");
        return 0;
    }


    public int getBalance(int password) {
        if(password==124) {
            return Balance;
        }
        System.out.println("Invalid user");
        return 0;
    }

    public boolean setBalance(int balance,int password) {
        if(password==124) {
            Balance = balance;
            return true;
        }
      return false;
    }
}
