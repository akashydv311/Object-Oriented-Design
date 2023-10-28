package accessmodifiers.privateaccess;

/*
 In Java, access modifiers are keywords that determine the visibility and accessibility of classes, fields, methods, and other members within a class. The `private` access modifier is one of the four main access modifiers in Java, and it restricts the visibility of a member to within the class in which it is declared. Here are some key points about the `private` access modifier:

1. **Visibility:** Members (fields and methods) declared as `private` can only be accessed within the same class where they are defined. They are not visible or accessible from outside of that class.

2. **Encapsulation:** The `private` access modifier is closely related to the concept of encapsulation, which is one of the fundamental principles of object-oriented programming. It allows you to hide the internal implementation details of a class and only expose a well-defined interface to the outside world. This helps in controlling access to the data and behavior of a class.

3. **Security:** By making members `private`, you can protect sensitive or critical data from being manipulated or accessed in unintended ways. This is particularly important in ensuring the integrity of your class's internal state.

4. **Controlled Access:** With `private` members, you have fine-grained control over how they are accessed and modified. You can provide public methods (getters and setters) to interact with private fields in a controlled manner, allowing you to enforce business rules and validation.


In this example, the `balance` field of the `BankAccount` class is declared as `private`, which prevents direct access from outside the class. Instead, public methods (`getBalance`, `deposit`, and `withdraw`) are provided to interact with the `balance` field in a controlled manner.

By using the `private` access modifier, you ensure that the internal state of the `BankAccount` class is protected, and interactions with it occur through well-defined methods.
 */

class BankAccount {
    private double balance; // Private field

    public BankAccount(double initialBalance) {
        balance = initialBalance;
    }

    // Public method to get the balance
    public double getBalance() {
        return balance;
    }

    // Public method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    // Public method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }
}

public class Tester1 {
    public static void main(String[] args) {

        BankAccount account = new BankAccount(1000.0);
        double currentBalance = account.getBalance(); // Accessing a private field via a public method
        System.out.println("Current balance: " + currentBalance);

        account.deposit(500.0); // Modifying the private field through a public method
        double updatedBalance = account.getBalance();
        System.out.println("Updated balance after deposit: " + updatedBalance);

    }
}
