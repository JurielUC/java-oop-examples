# Java in Visual Studio Code  

This guide explains how to set up, write, and run Java programs in **Visual Studio Code (VS Code)**.  

---

## 📌 Prerequisites  
Before running Java in VS Code, make sure you have:  

1. **Java Development Kit (JDK)** installed  
   - Download and install the latest JDK: [Oracle JDK](https://www.oracle.com/java/technologies/javase-downloads.html) or [OpenJDK](https://adoptopenjdk.net/).  
   - Verify installation by running in terminal:  
     ```bash
     java -version
     javac -version
     ```  

2. **Visual Studio Code** installed  
   - Download: [VS Code](https://code.visualstudio.com/).  

3. **Java Extensions for VS Code**  
   - Install the following extension from the VS Code Marketplace:  
     - **Extension Pack for Java** (recommended)  
       - Includes: Language Support for Java™, Debugger for Java, Maven, Test Runner, Project Manager.  

---

## ⚙️ Setup  
1. Open VS Code.  
2. Install the **Java Extension Pack** (if not already installed).  
3. Create a new folder for your Java project and open it in VS Code.  
4. Inside the folder, create a new Java file (e.g., `Main.java`).  

---

## ▶️ Running Your Java Program  

### Example: `Main.java`  
```java
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, Java in VS Code!");
    }
}
