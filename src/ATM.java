
import java.util.*;
class ATM {
    private Account currentAccount; //This line declares a private instance variable named currentAccount of type Account.

    public void insertCard(Account account) {
        System.out.println("\t*******Wel-Come to the ATM Machine*******");
        System.out.println("Card inserted. Please enter your PIN:");
        Scanner scanner = new Scanner(System.in);
        String enteredPin = scanner.nextLine();

        if (account.validatePin(enteredPin)) {       
            currentAccount = account;
            showMenu();
        } else {
            System.out.println("Incorrect PIN. Card ejected.");
        }
    }
        /*
            This block of code checks If the PIN is
            valid, it sets the currentAccount to the provided account and calls 
            the showMenu method, which displays the main menu of the
            ATM. If the PIN is incorrect, it prints an error message and does not
            proceed with the account. */
    


    private void showMenu() {
        Scanner scanner = new Scanner(System.in);
        int choice;
        
       do{
            System.out.println("1. Display Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    currentAccount.displayBalance();
                    break;
                case 2:
                    System.out.print("-------Enter deposit amount: $");
                    double depositAmount = scanner.nextDouble();
                    currentAccount.deposit(depositAmount);
                    break;
                case 3:
                    System.out.print("-------Enter withdrawal amount: $");
                    double withdrawAmount = scanner.nextDouble();
                    currentAccount.withdraw(withdrawAmount);
                    break;
                case 4:
                    System.out.println("_________Thank you for using the ATM. Card ejected_________.");
                    break;
                    
                default:
                System.out.println("________Invalid Choice! Sorry!________");

            }
            System.out.println("\t\t____________________________________");
        }while(choice!=4);  //The do-while loop ensures that the menu is repeatedly displayed until the user chooses to exit (option 4).
    }
}