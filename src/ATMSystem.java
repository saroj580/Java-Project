public class ATMSystem {
    public static void main(String[] args) {
        Account account = new Account("123456789", "1234", 1000.0);
        // It initializes the account with an account number ("123456789"), a PIN ("1234"), and an initial balance of 1000.0.

        ATM atm = new ATM();

        atm.insertCard(account); 
    }
}


/*This program essentially implements a simple menu-driven ATM interface, allowing users to check balance,
deposit, withdraw, or exit. The loop ensures that the menu continues to be displayed until the user
chooses to exit.*/
