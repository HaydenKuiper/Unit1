package app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        Account account1 = new Account();

        System.out.println("what is your name");
        account1.name = input.nextLine();

        System.out.println("what is your starting balance");
        account1.startingbalance = input.nextInt();

        System.out.println("please enter a numbered password");
        account1.password = input.nextInt();

        System.out.println("account created, please log in.");

        System.out.println("what is your name");
        input.nextLine();
        String nameReal = input.nextLine();

        if (nameReal.equals(account1.name)) {
            System.out.println("enter your passcode");
            int passcodeReal = input.nextInt();

            if (passcodeReal == account1.password) {
                System.out.println("Access granted, welcome " + account1.name + ".");
                System.out.println(
                        "what would you like to do? check your balance by pressing 1, withdraw money by pressing 2, change password by pressing 3, or you can exit by pressing 4");
                account1.operator = input.nextInt();
                while (account1.operator <= 3){
                    if (account1.operator == 1) {
                        System.out.println("you have $" + account1.startingbalance + " in your account.");
                        System.out.println(
                                "what would you like to do? check your balance by pressing 1, wihdraw money by pressing 2, change passcode by pressing 3, or you can exit by pressing 4.");
                        account1.operator = input.nextInt();
                    }
                if (account1.operator == 2){
                    System.out.println("enter amount you want to subtract.");
                    int withdrawl = input.nextInt();
                    System.out.println("your balance is $" + (account1.startingbalance - withdrawl));
                    System.out.println("what would you like to do? check your balance by pressing 1, wihdraw money by pressing 2, change passcode by pressing 3, or you can exit by pressing 4.");
                    account1.operator = input.nextInt();
                }
                if (account1.operator == 3) {
                    System.out.println("what passcode do you want?");
                    account1.password = input.nextInt();
                    System.out.println("passcode changed, please reenter passcode");
                    int passcode = input.nextInt();
                    if (passcode == account1.password) {
                        System.out.println("passcode changed");
                        System.out.println("what would you like to do? check your balance by pressing 1, wihdraw money by pressing 2, change passcode by pressing 3, or you can exit by pressing 4.");
                        account1.operator = input.nextInt();
                    }else {
                        System.out.println("access denied");
                    }
                if (account1.operator == 4) {
                        System.out.println("thankyou and have a nice day!");
                    }
                }
             }
        
        
        
        }else {System.out.println("Access denied");
            }
             
    }
}
}

