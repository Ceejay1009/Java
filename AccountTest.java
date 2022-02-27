import java.util.*;
public class AccountTest {
    public static void main(String[] args){
        //create 10 account objects
        boolean flag = true;
        Account[] account = new Account[10];
        for(int i = 0; i < 10; i++){
            account[i] = new Account(i, 100.0);
        }
        Scanner input = new Scanner(System.in);
        while(flag = true) {
            System.out.print("Enter your Account ID(1-10): ");
            int ID = input.nextInt();
            if (ID >= 1 && ID <= 10) {
                // loop though the menu
                while (flag = true) {
                    System.out.printf("%nMain menu%n");
                    System.out.println("1: check balance");
                    System.out.println("2: withdraw");
                    System.out.println("3: deposit");
                    System.out.println("4: exit");
                    //ask for choice input
                    System.out.print("Please Enter a choice: ");
                    int choice = input.nextInt();
                    //determine user choice
                    if (choice == 1) {
                        System.out.println("Your balance is: "+ account[ID].getBalance());
                    } else if (choice == 2) {
                        System.out.print("Please Enter the amount you want to withdraw: ");
                        account[ID].withdraw(input.nextDouble());
                    } else if (choice == 3) {
                        System.out.print("Please Enter the amount you want to deposit: ");
                        account[ID].deposit(input.nextDouble());
                    } else if (choice == 4) {
                        // break the loop
                        break;
                    }
                }
            }
        }

    }
}
