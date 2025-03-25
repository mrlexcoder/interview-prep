package modifiers;

abstract class AbstractClass {
    abstract void abstractMethod(); // Abstract method (must be implemented by subclasses)
}

// Main class demonstrating all modifiers
public class allmodifiertest extends AbstractClass {
    // Instance variables with different modifiers
    public int publicVar = 10;
    private int privateVar = 20;
    protected int protectedVar = 30;
    int defaultVar = 40; // Default access modifier
    
    // Static variable (shared among all instances)
    static int staticVar = 50;
    
    // Final variable (cannot be changed once assigned)
    final int finalVar = 60;
    
    // Transient variable (not serialized)
    transient int transientVar = 70;
    
    // Volatile variable (used in multithreading)
    volatile int volatileVar = 80;

    // Constructor
    public allmodifiertest() {
        System.out.println("Constructor executed");
    }

    // Method with different access modifiers
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
    
    // Static method
    static void staticMethod() {
        System.out.println("Static Method");
    }
    
    // Final method (cannot be overridden)
    final void finalMethod() {
        System.out.println("Final Method");
    }
    
    // Synchronized method (used in multithreading)
    synchronized void synchronizedMethod() {
        System.out.println("Synchronized Method");
    }
    
    // Implementation of abstract method
    @Override
    void abstractMethod() {
        System.out.println("Abstract Method Implemented");
    }
    
    // Main method to demonstrate all modifiers
    public static void main(String[] args) {
        allmodifiertest obj = new allmodifiertest();
        
        // Accessing variables
        System.out.println("Public Variable: " + obj.publicVar);
        System.out.println("Protected Variable: " + obj.protectedVar);
        System.out.println("Default Variable: " + obj.defaultVar);
        System.out.println("Static Variable: " + allmodifiertest.staticVar);
        System.out.println("Final Variable: " + obj.finalVar);
        System.out.println("Transient Variable: " + obj.transientVar);
        System.out.println("Volatile Variable: " + obj.volatileVar);
        
        // Accessing methods
        obj.publicMethod();
        obj.protectedMethod();
        obj.defaultMethod();
        obj.finalMethod();
        obj.synchronizedMethod();
        obj.abstractMethod();
        
        // Accessing static method
        staticMethod();
        
        // Private members are not accessible outside the class
        // obj.privateMethod(); // Uncommenting this line will cause an error
    }
}

