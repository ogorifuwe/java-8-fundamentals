
### Benefits of Lambda Expressions in Java

1. To enable functional programming in Java.
2. To write more readable, maintainable and concise code.
3. To use APIs very easily and effectively.
4. To enable parallel processing.

#### What is Lambda Expresion?

A lambda expression is an anonymous function.
- It does not have a name
- It does not have any modifiers
- It does not have any return type

#### Functional Interface

A Functional Interface is an interface that contains a Single Absract Method (SAM).
Examples include;

- Runnable - Contains only run() method
- Callable - Contains only call() method
- ActionListener - Contains only actionPerformed() method
- Comparable - Contains only compareTo() method

Functional Interface is used/required to invoke a method that is written
with Lambda expression

@FunctionalInterface annotation is used by the compiler to enforce that the
declared interface complies with the rules of a Functional Interface.

Functional Interface can act as a type of Lambda Expression
