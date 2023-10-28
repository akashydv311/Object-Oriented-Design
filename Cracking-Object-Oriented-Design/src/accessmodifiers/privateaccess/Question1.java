package accessmodifiers.privateaccess;

// private access modifier is not used to declare classes but is used for class members (fields and methods) to restrict access to those members within the same class.

public class Question1 {
    public static void main(String[] args) {

    }
}

/*
 * Question Related To Private Access Modifiers?
 * 
 * 
 * - What is the purpose of the private access modifier in Java?
 * 
 * Answer: The private access modifier is used to restrict the visibility of
 * class members (fields and methods) to only within the class in which they are
 * defined. It enforces encapsulation and helps in hiding the internal
 * implementation details of a class from external access.
 * 
 * 
 * - Explain the concept of encapsulation and how private relates to it.
 * 
 * Answer: Encapsulation is one of the fundamental principles of object-oriented
 * programming. It involves bundling the data (fields) and methods that operate
 * on the data into a single unit (i.e., a class) and controlling access to that
 * unit. The private access modifier plays a crucial role in encapsulation by
 * ensuring that the internal state of a class (its fields) is hidden from
 * external access. Access to this internal state is provided through
 * well-defined public methods (getters and setters) that can apply validation
 * and business rules.
 * 
 * 
 * 
 * - Can you provide an example of when to use the private access modifier in a
 * real-world scenario?
 * 
 * Answer: Certainly. Consider a bank account class where the account balance is
 * stored as a private field. This is a good use of the private modifier because
 * the balance should not be directly accessible from external classes. Instead,
 * you provide public methods like getBalance(), deposit(), and withdraw() to
 * control access to and modification of the balance.
 * 
 * 
 * 
 * - What happens if you attempt to access a private field or method from
 * outside
 * the class?
 * 
 * Answer: Accessing a private field or method from outside the class results in
 * a compilation error. The compiler will not allow such access, and you'll
 * receive an error message indicating that the field or method is not visible.
 * 
 * 
 * 
 * - How can you test the functionality of a private method within a class?
 * 
 * Answer: To test a private method, you can use techniques such as reflection
 * or by writing unit tests within the same class. However, it's generally
 * recommended to design your classes in a way that the public methods, which
 * use the private methods, are tested. Direct testing of private methods is
 * discouraged to maintain encapsulation.
 * 
 * 
 * 
 * - Can you change the value of a private field from a subclass?
 * 
 * Answer: No, a private field is not accessible from a subclass. The private
 * modifier restricts access to the field to the class in which it's declared.
 * If you want to provide access to a field from subclasses, you can use the
 * protected or default (package-private) access modifiers instead.
 * 
 */
