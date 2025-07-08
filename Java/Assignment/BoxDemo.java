// BoxDemo.java - Demonstrating Different Types of Constructors in Java

class Box {
    private double length;
    private double width;
    private double height;
    
    // 1. Default Constructor (No-argument constructor)
    public Box() {
        System.out.println("Default constructor called");
        length = 1.0;
        width = 1.0;
        height = 1.0;
    }
    
    // 2. Parameterized Constructor with all parameters
    public Box(double length, double width, double height) {
        System.out.println("Parameterized constructor with all parameters called");
        this.length = length;
        this.width = width;
        this.height = height;
    }
    
    // 3. Parameterized Constructor with one parameter (cube)
    public Box(double side) {
        System.out.println("Parameterized constructor for cube called");
        this.length = side;
        this.width = side;
        this.height = side;
    }
    
    // 4. Parameterized Constructor with two parameters
    public Box(double length, double width) {
        System.out.println("Parameterized constructor with length and width called");
        this.length = length;
        this.width = width;
        this.height = 1.0; // Default height
    }
    
    // 5. Copy Constructor
    public Box(Box other) {
        System.out.println("Copy constructor called");
        this.length = other.length;
        this.width = other.width;
        this.height = other.height;
    }
    
    // Constructor chaining - using this() to call another constructor
    public Box(double length, double width, double height, String description) {
        this(length, width, height); // Calls the 3-parameter constructor
        System.out.println("Constructor with description called: " + description);
    }
    
    // Method to calculate volume
    public double calculateVolume() {
        return length * width * height;
    }
    
    // Method to display box dimensions
    public void displayDimensions() {
        System.out.println("Box dimensions: " + length + " x " + width + " x " + height);
        System.out.println("Volume: " + calculateVolume());
        System.out.println();
    }
    
    // Getter methods
    public double getLength() { return length; }
    public double getWidth() { return width; }
    public double getHeight() { return height; }
    
    // Setter methods
    public void setLength(double length) { this.length = length; }
    public void setWidth(double width) { this.width = width; }
    public void setHeight(double height) { this.height = height; }
}

public class BoxDemo {
    public static void main(String[] args) {
        System.out.println("=== Demonstrating Different Types of Constructors ===\n");
        
        // 1. Using Default Constructor
        System.out.println("1. Creating box with default constructor:");
        Box box1 = new Box();
        box1.displayDimensions();
        
        // 2. Using Parameterized Constructor (all parameters)
        System.out.println("2. Creating box with all parameters:");
        Box box2 = new Box(5.0, 3.0, 2.0);
        box2.displayDimensions();
        
        // 3. Using Parameterized Constructor (cube)
        System.out.println("3. Creating cube with single parameter:");
        Box box3 = new Box(4.0);
        box3.displayDimensions();
        
        // 4. Using Parameterized Constructor (two parameters)
        System.out.println("4. Creating box with length and width:");
        Box box4 = new Box(6.0, 4.0);
        box4.displayDimensions();
        
        // 5. Using Copy Constructor
        System.out.println("5. Creating box using copy constructor:");
        Box box5 = new Box(box2);
        box5.displayDimensions();
        
        // 6. Using Constructor with chaining
        System.out.println("6. Creating box with constructor chaining:");
        Box box6 = new Box(3.0, 3.0, 3.0, "Special cube");
        box6.displayDimensions();
        
        // 7. Demonstrating constructor overloading
        System.out.println("7. Demonstrating constructor overloading:");
        System.out.println("We can create boxes in multiple ways:");
        
        Box[] boxes = {
            new Box(),                    // Default
            new Box(2.0),                // Cube
            new Box(3.0, 4.0),          // Rectangle with default height
            new Box(1.0, 2.0, 3.0),     // All parameters
            new Box(box2)                // Copy constructor
        };
        
        System.out.println("\nAll created boxes:");
        for (int i = 0; i < boxes.length; i++) {
            System.out.println("Box " + (i + 1) + ":");
            boxes[i].displayDimensions();
        }
        
        System.out.println("=== Constructor Demonstration Complete ===");
    }
}





