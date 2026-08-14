# Java This Keyword

A simple Java program demonstrating how the `this` keyword is used in Java.

## 📌 Topics Covered

* `this` keyword
* Instance variables
* Constructor parameters
* Object reference
* Constructors

## 📂 Project Structure

```text id="3q4p8x"
java-this-keyword/
│
├── ThisKeyword.java
└── README.md
```

## 💻 Program

The `ThisKeyword.java` program demonstrates how the `this` keyword is used to refer to the current object.

## 🔹 What is the `this` Keyword?

The `this` keyword refers to the **current object**.

It is commonly used when instance variables and method or constructor parameters have the same name.

## 🔹 Using `this` in a Constructor

In this example, both the instance variables and constructor parameters have the same names:

```java id="1j7l8e"
String name;
int age;

Student(String name, int age) {
    this.name = name;
    this.age = age;
}
```

Here:

* `this.name` refers to the instance variable.
* `name` refers to the constructor parameter.
* `this.age` refers to the instance variable.
* `age` refers to the constructor parameter.

## 🔹 Using `this` in a Method

The `this` keyword can also be used to access the current object's variables.

```java id="yqknw4"
System.out.println("Name: " + this.name);
System.out.println("Age: " + this.age);
```

## 📊 Common Uses

| Usage           | Purpose                                    |
| --------------- | ------------------------------------------ |
| `this.variable` | Access current object's variable           |
| `this.method()` | Call current object's method               |
| `this()`        | Call another constructor in the same class |

## ▶️ How to Run

### Compile

```bash id="c9klv2"
javac ThisKeyword.java
```

### Run

```bash id="8a7jce"
java ThisKeyword
```

## 🖥️ Sample Output

```text id="f8g4a2"
Name: John
Age: 20
```

## 🎯 Purpose

This project is designed for Java beginners to understand the `this` keyword and how it is used to refer to the current object.

## 👨‍💻 Author

K.Leelasri

## 📄 License

This project is for educational purposes.
# java-this-keyword
