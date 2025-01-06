# Practical Demonstrations of Common Exceptions: Basic and Advanced Scenarios 🚀✅

## 📚 Overview
Explore hands-on examples that demonstrate how to identify, understand, and handle various exceptions in Java. From basic to advanced scenarios, these questions provide a reference for mastering exception handling techniques.

---

## 📝 List of Problems

### **Basic Exceptions** ⚠️
This section contains Java programs demonstrating various common exceptions, along with a brief explanation for each. These exceptions are critical to understanding error handling in Java.

**1. Write a program to demonstrate `NullPointerException` in Java with an example?**
   - _This exception occurs when you try to invoke a method or access a field on a null object reference._  
     - **Explanation**: This exception occurs when you attempt to access or modify a null object. Example: Trying to call a method (length()) on a null object.

**2. Write a program to demonstrate `ArithmeticException` in Java with an example of division by zero?**
   - _It happens when an arithmetic operation, such as division by zero, is attempted._  
     - **Explanation**: This exception occurs when a number is divided by zero, which is mathematically undefined.

**3. Write a program to demonstrate `ArrayIndexOutOfBoundsException` in Java? Write an example.**
   - _This exception is thrown when you try to access an invalid index of an array._  
     - **Explanation**: This exception occurs when trying to access an array index that does not exist.
   
**4. Write a program to demonstrate `ClassNotFoundException` in Java? Can you give an example?**
   - _It occurs when a class is referenced but cannot be found during runtime._  
     - **Explanation**: This exception occurs when trying to load a class dynamically that isn't found in the classpath.
   
**5. Write a program to demonstrate `FileNotFoundException` in Java? Can you demonstrate its usage with throw and throws?**
   - _This exception is thrown when an attempt to open a file fails because it does not exist._  
     - **Explaination**: **throws**: Used in the method signature to declare that the method may throw an exception, informing the caller to handle it.
                     **throw**: Used within the method to manually throw an exception.

**6. Write a program to demonstrate `NumberFormatException` in Java? Use try-catch-finally to handle it.**
   - _It happens when you try to convert a string into a numeric type, but the string format is incorrect._  
     - **Explanation**: **finally**: Always executes, whether an exception is caught or not, for cleanup actions.

**7. Write a program to demonstrate `IllegalArgumentException` in Java?**
   - _Thrown when a method receives an argument that is inappropriate or illegal for its operation._  
     - **Explanation**: Illegal arguments passed to a method can result in this exception. It is explicitly thrown using the throw keyword.

**8. Write a program to demonstrate `IOException` in Java? Can you show an example with throws?**
   - _This exception is thrown when an I/O operation (like reading or writing a file) fails._  
     - **Exaplination**: Attempt to write to the read-only file (this will cause an IOException) and IOException is thrown during file operations like reading & writing a file.

**9. Write a program to demonstrate `ConcurrentModificationException` in Java? Write an example.**
   - _It occurs when a collection is modified while it is being iterated over._  
     - **Explanation**: This exception occurs when a collection is modified structurally while iterating over it.

**10. Write a program to demonstrate `TimeoutException` in Java? How can it be handled?**
   - _Thrown when a blocking operation exceeds the time limit._  
     - **Explanation**: TimeoutException is often used in concurrent or asynchronous operations when an expected operation exceeds its time limit.
     
**11. Write a program to demonstrate `SQLException` in Java? How can it be handled?**
   - _This exception occurs when there is an issue related to database connectivity, SQL query syntax, invalid database access, or issues with database resources like a timeout or failure to establish a connection._  
     - **Explanation**: A `SQLException` can be thrown due to various reasons, such as incorrect SQL syntax, issues with the database connection (e.g., network problems, unavailable database server), invalid query parameters, or resource limitations during query execution.

---

