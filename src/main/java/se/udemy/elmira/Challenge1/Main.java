package se.udemy.elmira.Challenge1;

public class Main {
    public static void main(String[] args) {
        //Created a new class for a bank account
        //Create fields for the account number, balance, customer name, email and phone number.
        //
        //Create getter and setter for each field
        //Create two additional methods
        //1. To allow the customer to deposit funds (this should increment the balance field.)
        //2. To allow the customer to withdraw founds. This should deduct from the balance field,
        //but now allow the withdrawal to complete if there are insufficient founds.
        //You will want to create various code in Main class(The one created by Intellij) to
        //confirm your code is working.
        //Add some System.out.println's in the two method above as well.

        /*
        Account bobsAccount = new Account("12345", 0.00 , "Bob Brown",
                "mtemail@gmail.com", "(087) 123_34567");

         */

        Account bobsAccount = new Account();
        System.out.println(bobsAccount.getNumber());
        System.out.println(bobsAccount.getBalance());


        bobsAccount.withdrawal(100.0);

        System.out.println("_____________________________");

        bobsAccount.deposit(50.0);
        bobsAccount.withdrawal(100.0);

        System.out.println("_____________________________");

        bobsAccount.deposit(51.0);
        bobsAccount.withdrawal(100.0);

    }

}
