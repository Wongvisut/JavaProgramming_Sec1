import java.util.*;
public class ATMData {
	
	    private String accountNumber;
	    private int money;
	    private String password;

	    public ATMData(String accountNumber, String password) {
	        this.accountNumber = accountNumber;
	        this.password = password;
	    }
	    public String getID() {
	        return accountNumber;
	    }
	    public String getPass() {
	        return password;
	    }
	    public boolean checkBookBank() {
	    	return true;
	    }
}
