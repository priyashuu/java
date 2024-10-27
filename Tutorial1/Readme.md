 ## First Lecture : ## How to code  what is java?
 ## What is Programming :
 Computer programming is a medium for us to communicate with computers , just like we use "hindi" or "english" to communicate with each other . programming is a way for us to delivery our instructions to the computer . 
 ### Introduction to computer languages : 
 
 ## Machine Language:

Definition: Machine language is the lowest-level programming language, consisting entirely of binary code (0s and 1s). It's the only language that the computer's hardware can directly understand and execute.

Binary Code: In binary, 1 typically represents a high voltage state, and 0 represents a low voltage state. This binary system is the foundation of all computer operations.
Binary System:


Representation: All types of data (numbers, text, images, etc.) are ultimately converted into binary form for processing by the computer.

## High-Level Languages:

Abstraction: To make programming more manageable, high-level languages were developed. These languages are more abstract and human-readable compared to machine language. Examples include Java, Python, and C++.

Translation: Programs written in high-level languages need to be translated into machine language. This is done using compilers or interpreters. A compiler translates the entire program into machine code at once, while an interpreter translates and executes code line by line.

Assembly Language:

Definition: Assembly language is a step above machine language. It uses mnemonics and symbols to represent machine code instructions, making it easier for humans to write and understand.
Translation: Assembly language programs are converted into machine code by an assembler.
## what is java ?

Java is a high-level, object-oriented programming language designed for portability and ease of use. Key features include:

- **Platform Independence**: Java code runs on any device with a Java Virtual Machine (JVM), making it "write once, run anywhere."
- **Object-Oriented**: It organizes code into classes and objects, promoting modularity and reuse.
- **Rich Standard Library**: Offers extensive pre-built functionality for tasks like file I/O, networking, and GUIs.
- **Automatic Memory Management**: Includes garbage collection to manage memory efficiently.
- **Multithreading**: Supports concurrent execution of multiple threads for improved performance.
- **Security**: Provides features to protect against malicious code.

Java is used in web, mobile, and enterprise applications.


**Flow Chart** vs. **Pseudo Code**:

1. **Flow Chart**:
   - **Visual Representation**: Uses shapes and arrows to represent the flow of a program or process.
   - **Structure**: Includes symbols like rectangles (processes), diamonds (decisions), and ovals (start/end).
   - **Purpose**: Useful for visualizing the sequence of steps and decision points in a process.
   <img src="https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEgrzHVLquFgHDWVX6Mc1dJzdJgl20N9zr9pHy2vCc4Z5_njsgFJbBUrnRy3DhEkHB_Haw4Ujk7ssEpPKI__73yc5VpV9S837RPlePvc7kZ-16hYoE_LmBQp8hfpuQmsao32Lg5rdlIlUr6X/s563/sum+and+avg+of+three+numbers.PNG" width="300px" alt ="Flow chart of three avg numbers">

2. **Pseudo Code**:
   - **Textual Representation**: Uses simple, informal language to describe the logic of a program.
   - **Structure**: Written in plain text with structured, human-readable syntax.
   - **Purpose**: Helps in planning the logic and structure of code without worrying about specific programming syntax.
   <img src="https://slideplayer.com/slide/14570513/90/images/6/Algorithm+Example+To+calculate+Average+of+three+numbers%3A+Algorithm%3A.jpg" width="300px" alt="pseudo code of three avg numbers">
### Java installations 
1. **JDK**: Search on the google chrome |[JDK](https://www.oracle.com/in/java/technologies/downloads/)|
2. **Code editor /IDE**
- VISUAL STUDIO CODE :|[VS CODE ](https://visualstudio.microsoft.com/downloads/)|
3.**ALL IN ONE**: Its all in package |[Vs code with java ](https://code.visualstudio.com/docs/languages/java)|

### Code  Explanation:

1. **`class FirstClass {`**  
   - This line defines a class named `FirstClass`. In Java, all code must be contained within a class. The class name should be capitalized according to Java naming conventions.

2. **`public static void main(String[] args) {`**  
   - This line defines the `main` method, which is the entry point of any Java application. When the program is run, the `main` method is the first method that gets called.
   - **`public`**: This is an access modifier that allows the method to be accessible from anywhere.
   - **`static`**: This means the method belongs to the class, not instances of it. It can be called without creating an object of the class.
   - **`void`**: This indicates that the method does not return any value.
   - **`String[] args`**: This is an array of `String` objects. It stores any command-line arguments passed to the program when it is executed.

3. **`System.out.println("Hey");`**  
   - This line prints the string `"Hey"` to the console, followed by a newline. 
   - **`System.out`**: This is an output stream used to print data to the console.
   - **`println`**: This is a method that prints the argument passed to it and then terminates the line (moves to the next line in the console).

### what jdk include :
JDK:Jave Develoment kit
It includes :
1. JRE:Java runtime environment
2. JVN:Java Virtual Machine 
3. Development tools
### How my code Running : 
1. **Compilation**:Converts Java code (.java files) into platform-independent bytecode (.class files) using the javac compiler.
2. **Execution**:The Java Virtual Machine (JVM) runs the bytecode, translating it into machine code so the program can be executed on any platform with a JVM.
