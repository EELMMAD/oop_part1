package se.udemy.elmira.Challenge1;

import se.udemy.elmira.VipCustomer;

public class Main {
    public Main() {
    }

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

        /*
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

        System.out.println("_____________________________");

         */

        Account timsAccount = new Account("Tim", "tim@gmail.com ", "12345");
        System.out.println(timsAccount.getNumber() + " name " + timsAccount.getCustomerName());
        System.out.println("Current balance is " + timsAccount.getBalance());
        timsAccount.withdrawal(100.55);

        //Create a new class VipCustomer
        //It should have 3 fields name, credit limit, and email address.
        //Create 3 constructors
        //1st constructor empty should call the constructor with 3 parameters with default values
        //2nd constructor should pass on the 2 values it receives and add a default for the 3rd
        //3rd constructor should save all fields.
        //Create getters only for this using code generation of intellij as setters wont be needed
        //test and confirm it works

        /*
        VipCustomer person1 = new VipCustomer();
        System.out.println(person1.getName());
        System.out.println(person1.getEmailAddress());

        VipCustomer person2 = new VipCustomer("Bob", 25000.00);
        System.out.println(person2.getName());
        System.out.println(person2.getEmailAddress());

        VipCustomer person3 = new VipCustomer("Tim", 100.00, "tim@email.com");
        System.out.println(person3.getName());
        System.out.println(person3.getEmailAddress());

         */
    }
}
