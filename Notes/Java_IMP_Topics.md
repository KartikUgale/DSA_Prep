# Java Important Topics (Android included)
---

## 1. Core Java (Fundamentals)
>✅ **Must-Know for Every Java Developer**  
>- Variables, Data Types, Operators  
>- Control Statements (if-else, loops)  
>- Arrays & Strings  
>- Methods and Function Overloading  
>- Static vs. Non-Static Members  
>- Exception Handling (`try-catch-finally`, `throws`, `throw`)  
> 
>---

## 2. Object-Oriented Programming (OOPs)
>✅ **Important for Java & Android Development**  
>- **Classes & Objects**  
>- **Encapsulation** (private fields, getters/setters)  
>- **Inheritance** (super, this, method overriding)  
>- **Polymorphism** (overloading vs. overriding)  
>- **Abstraction** (`abstract` classes, interfaces)  
>- **Encapsulation vs. Abstraction**  
>- **Interfaces & Multiple Inheritance**  
>- **Final Keyword (`final` class, method, variable)**  
>---

## 3. Data Structures & Algorithms (DSA)
>✅ **Important for Interviews & Competitive Programming**  
>- **Recursion** (factorial, Fibonacci, backtracking)  
>- **Sorting Algorithms** (Bubble, Selection, Insertion, Merge, Quick)  
>- **Searching Algorithms** (Linear, Binary Search)  
>- **Stack & Queue** (using Array and LinkedList)  
>- **Linked List** (Single, Double, Circular)  
>- **Trees** (Binary Tree, BST, Traversals, AVL Tree)  
>- **Graphs** (BFS, DFS, Dijkstra’s Algorithm)  
>- **Dynamic Programming (DP)** (Fibonacci, Knapsack, LCS)  
>---

## 4. Java Collections Framework (JCF)
>✅ **Essential for Real-World Projects**  
>- **List Interface** (`ArrayList`, `LinkedList`)  
>- **Set Interface** (`HashSet`, `TreeSet`)  
>- **Map Interface** (`HashMap`, `TreeMap`, `LinkedHashMap`)  
>- **Queue & Deque** (`PriorityQueue`, `ArrayDeque`)  
>- **Comparator vs Comparable**  
>- **Thread-Safe Collections (`ConcurrentHashMap`, `CopyOnWriteArrayList`)**  
>---

## 5. Multithreading & Concurrency
>✅ **Useful for High-Performance Applications**  
>- **Thread Creation** (`Thread` class, `Runnable` interface)  
>- **Thread Lifecycle** (`start()`, `sleep()`, `join()`)  
>- **Synchronized Methods & Blocks**  
>- **Thread Pooling (`ExecutorService`, `ScheduledExecutor`)**  
>- **Deadlock, Race Condition & Locks (`ReentrantLock`)**  
>---

## 6. File Handling & I/O Streams
>✅ **Important for Reading/Writing Data in Java**  
>- **File Handling** (`File`, `FileReader`, `FileWriter`)  
>- **Buffered Streams** (`BufferedReader`, `BufferedWriter`)  
>- **Object Serialization (`ObjectOutputStream`, `ObjectInputStream`)**  
>- **NIO (New Input/Output) Package**  
>---

## 7. Java 8+ Features (Modern Java)
>✅ **Helps in Writing Clean & Efficient Code**  
>- **Lambda Expressions** (`(a, b) -> a + b`)  
>- **Functional Interfaces** (`Predicate`, `Consumer`, `Supplier`)  
>- **Streams API** (filter, map, reduce)  
>- **Optional Class** (Handling Null Values)  
>- **Method References (`Class::methodName`)**  
>---

## 8. JDBC (Java Database Connectivity)
>✅ **Used for Database Operations (SQL + Java)**  
>- **JDBC Drivers** (Types 1-4)  
>- **Connection, Statement, PreparedStatement**  
>- **Executing Queries (`SELECT`, `INSERT`, `UPDATE`, `DELETE`)**  
>- **Transactions & Batch Processing**  
>---

## 9. Design Patterns
>✅ **Important for Writing Scalable Java Code**  
>- **Singleton Pattern**  
>- **Factory Pattern**  
>- **Observer Pattern**  
>- **Adapter Pattern**  
>- **Builder Pattern**  
>---

## 10. Android Development Topics (For Kotlin Migration)
>✅ **Moving from Java to Kotlin for Android**  
>- **Android Activity & Lifecycle**  
>- **RecyclerView & Adapters**  
>- **Fragments & Navigation Components**  
>- **ViewModel & LiveData (MVVM Architecture)**  
>- **Room Database (SQLite Alternative)**  
>- **Coroutines (Instead of Java Threads)**  
>- **Jetpack Compose (New UI Framework)**  
>---
---
---

# OOPS :
# 📂Java: Classes and Objects

## 1. What is a Class in Java?
A **class** is a blueprint for creating objects. It defines properties (fields) and behaviors (methods) that the objects will have.

### Characteristics of a Class:
- Defines **state** (variables) and **behavior** (methods).
- Does not allocate memory until an object is created.
- Acts as a **template** for multiple objects.

### Example of a Class:
```java
class Car {
    String brand;
    int speed;
    
    void accelerate() {
        speed += 10;
        System.out.println(brand + " is now going at " + speed + " km/h.");
    }
}
```

---

## 2. What is an Object in Java?
An **object** is an instance of a class. It is created using the `new` keyword.

### Characteristics of an Object:
- Has its own **unique state** (values for instance variables).
- Can **call methods** of its class.
- Multiple objects can exist from the same class.

### Example of an Object:
```java
public class Main {
    public static void main(String[] args) {
        Car myCar = new Car(); // Creating an object
        myCar.brand = "Toyota";
        myCar.speed = 0;
        myCar.accelerate(); // Output: Toyota is now going at 10 km/h.
    }
}
```

---

## 3. Class vs. Object
| Feature | Class | Object |
|---------|--------|-----------|
| Definition | Blueprint/Template | Instance of a class |
| Memory Allocation | No memory allocated until an object is created | Gets memory when instantiated |
| Contains | Variables & Methods | Values for variables & can call methods |

---

## 4. Types of Classes in Java
1. **Concrete Class** (Regular class used to create objects)
2. **Abstract Class** (Contains abstract methods, cannot be instantiated)
3. **Final Class** (Cannot be extended)
4. **Inner Class** (Defined within another class)
5. **Static Nested Class** (Static class inside another class)

---

## 5. Constructor in Java
A **constructor** is a special method used to initialize objects.

### Characteristics of a Constructor:
- Has the **same name** as the class.
- **No return type** (not even `void`).
- Automatically called when an object is created.

### Example of a Constructor:
```java
class Person {
    String name;
    
    // Constructor
    Person(String newName) {
        name = newName;
    }
    
    void display() {
        System.out.println("Hello, my name is " + name);
    }
}

public class Main{
    public static void main(String[] args) {
        Person p = new Person("Alice");
        p.display(); // Output: Hello, my name is Alice
    }
}
```

---

## 6. `this` Keyword in Java
The `this` keyword refers to the **current instance** of a class.

### Example of `this`:
```java
class Student {
    String name;
    
    Student(String name){
        this.name = name; // Refers to instance variable
    }
}
```

---

## 7. Encapsulation in Java
Encapsulation is one of the core principles of Object-Oriented Programming (OOP). It is the technique of **binding data (variables) and methods** that manipulate the data together and restricting direct access to some details of an object.

### Characteristics of Encapsulation:
- Data is **hidden** using `private` access modifier.
- Can be accessed using **getter and setter** methods.
- Increases **security** by preventing direct modifications.
- Helps in **maintaining code modularity**.

### Example of Encapsulation:
```java
class Employee {
    private String name;
    private int salary;
    
    // Getter method
    public String getName() {
        return name;
    }
    
    // Setter method
    public void setName(String name) {
        this.name = name;
    }
    
    // Getter method
    public int getSalary() {
        return salary;
    }
    
    // Setter method
    public void setSalary(int salary) {
        if (salary > 0) {
            this.salary = salary;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setName("John");
        emp.setSalary(5000);
        System.out.println("Employee Name: " + emp.getName());
        System.out.println("Employee Salary: " + emp.getSalary());
    }
}
```

---

## 8. Abstraction in Java
Abstraction is the process of **hiding the implementation details** while exposing only the necessary functionalities.

### Characteristics of Abstraction:
- Implemented using **abstract classes** and **interfaces**.
- Abstract classes **can** have both abstract and concrete methods.
- Interfaces contain only abstract methods (before Java 8).

### Example of Abstraction:
```java
abstract class Animal {
    abstract void makeSound();
    
    void sleep() {
        System.out.println("Sleeping...");
    }
}

class Dog extends Animal {
    void makeSound() {
        System.out.println("Bark");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        myDog.makeSound(); // Output: Bark
        myDog.sleep(); // Output: Sleeping...
    }
}
```

---

## 9. Difference Between Abstraction and Encapsulation

| Feature | Abstraction | Encapsulation |
|---------|------------|--------------|
| Definition | Hides implementation details and shows only functionality | Hides data using access modifiers |
| How? | Implemented using abstract classes and interfaces | Implemented using private fields and public getters/setters |
| Purpose | Focuses on **what** an object does | Focuses on **how** an object's data is protected |
| Example | Abstract class `Animal` with `makeSound()` method | `Employee` class with private `salary` variable and public `getSalary()` method |



