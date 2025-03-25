Java Modifiers Explained for Beginners
In Java, modifiers are keywords that change the behavior of variables, methods, and classes. Modifiers are classified into Access Modifiers and Non-Access Modifiers.

1. Access Modifiers (Control Visibility)
Access modifiers define who can access a variable, method, or class.

Modifier	Applicable To	Accessibility
public	Class, Methods, Variables	Accessible from anywhere in the program.
private	Methods, Variables	Accessible only within the same class.
protected	Methods, Variables	Accessible within the same package and by subclasses.
(default)	Class, Methods, Variables	Accessible only within the same package (No keyword needed).
Example of Access Modifiers
java
Copy
Edit
class Example {
    public int publicVar = 10;  // Accessible anywhere
    private int privateVar = 20; // Only accessible within this class
    protected int protectedVar = 30; // Accessible within the same package and subclasses
    int defaultVar = 40; // No modifier (default), accessible within the package

    public void publicMethod() {
        System.out.println("Public Method");
    }
    
    private void privateMethod() {
        System.out.println("Private Method");
    }
    
    protected void protectedMethod() {
        System.out.println("Protected Method");
    }
    
    void defaultMethod() {
        System.out.println("Default Method");
    }
}

public class AccessModifierDemo {
    public static void main(String[] args) {
        Example obj = new Example();
        
        System.out.println(obj.publicVar);  // ✅ Accessible
        // System.out.println(obj.privateVar);  // ❌ Error: privateVar is private
        System.out.println(obj.protectedVar); // ✅ Accessible within the same package
        System.out.println(obj.defaultVar);   // ✅ Accessible within the same package
        
        obj.publicMethod();  // ✅ Accessible
        // obj.privateMethod();  // ❌ Error: privateMethod() is private
        obj.protectedMethod(); // ✅ Accessible within the same package
        obj.defaultMethod();   // ✅ Accessible within the same package
    }
}
2. Non-Access Modifiers (Modify Behavior)
Non-access modifiers control how variables, methods, or classes behave.

Modifier	Applicable To	Purpose
static	Methods, Variables	Belongs to the class rather than objects.
final	Variables, Methods, Classes	Prevents modification (constant variable, non-overridable method, non-inheritable class).
abstract	Classes, Methods	Defines an incomplete class/method to be implemented later.
synchronized	Methods	Allows only one thread to access at a time (for multithreading).
volatile	Variables	Ensures visibility in multithreading (always reads latest value).
transient	Variables	Prevents a variable from being serialized (not saved in files).
Example of Non-Access Modifiers
java
Copy
Edit
// Final Class: Cannot be inherited
final class FinalClass {
    final int finalVar = 100; // Final variable (cannot be changed)
    
    // Final method: Cannot be overridden
    final void finalMethod() {
        System.out.println("Final Method - Cannot be overridden");
    }
}

// Abstract class: Must be inherited and implemented
abstract class AbstractExample {
    abstract void abstractMethod(); // Abstract method (must be implemented by a subclass)
}

// Main class demonstrating non-access modifiers
class NonAccessModifiers extends AbstractExample {
    static int staticVar = 50; // Shared across all instances
    transient int transientVar = 60; // Not serialized
    volatile int volatileVar = 70; // Used in multithreading
    
    // Overriding the abstract method
    @Override
    void abstractMethod() {
        System.out.println("Abstract Method Implemented");
    }
    
    // Synchronized method: Only one thread can access it at a time
    synchronized void synchronizedMethod() {
        System.out.println("Synchronized Method - Only one thread at a time");
    }
    
    public static void main(String[] args) {
        NonAccessModifiers obj = new NonAccessModifiers();
        
        System.out.println("Static Variable: " + staticVar); // Accessible without object
        System.out.println("Transient Variable: " + obj.transientVar);
        System.out.println("Volatile Variable: " + obj.volatileVar);
        
        obj.abstractMethod();
        obj.synchronizedMethod();
    }
}
Quick Summary
Access Modifiers

public: Accessible anywhere.

private: Accessible only within the same class.

protected: Accessible in the same package + subclasses.

(default): Accessible within the same package.

Non-Access Modifiers

static: Belongs to class, shared across objects.

final: Prevents modification (constant variable, method, or class).

abstract: Defines an incomplete class or method.

synchronized: Controls access by multiple threads.

volatile: Ensures the latest variable value is always read in multithreading.

transient: Prevents variable from being saved during serialization.

