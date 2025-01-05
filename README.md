# kotlin

# Variables

- Read-only variables with val
- Mutable variables with var

# List

- Lists store items in the order that they are added, and allow for duplicate items.
- Item can be accessed with index

# Set

- sets are unordered and only store unique items.
- As sets are unordered, you can't access an item at a particular index.

# Map

- Maps store items as key-value pairs. Access item with key.
- Key must be unique but duplicate values are allowed.

# Conditional expressions

- Kotlin provides `if` and `when` for checking conditional expressions.
- `when` is preferred. Its easy to read,add another branch and leads to fewer mistake
- There is no ternary operator condition ? then : else in Kotlin

# When

- when can be used either as a statement or as an expression. A statement doesn't return anything but performs actions
  instead.
- An expression returns a value that can be used later in your code.

# Lambda Expressions

Kotlin allows you to write even more concise code for functions by using lambda expressions.
Lambda expressions can be used in a number of ways. You can:

- Pass a lambda expression as a parameter to another function
- Return a lambda expression from a function
- Invoke a lambda expression on its own

# Trailing lambdas

- If a lambda expression is the only function parameter, you can drop the function parentheses ()
- If a lambda expression is passed as the last parameter of a function, then the expression can be written outside the
  function parentheses ().
  In both cases, this syntax is called a `trailing lambda`.

# Class

Kotlin supports object-oriented programming with classes and objects. Objects are useful for storing data in your
program. Classes allow you to declare a set of characteristics for an object. When you create objects from a class, you
can save time and effort because you don't have to declare these characteristics every time.

```
class Contact(val id: Int, var email: String)

fun main() {
    val contact = Contact(1, "rakib@gmail.com")
}

```

In the example:

- Contact is a class.
- contact is an instance of the Contact class.
- id and email are properties.
- id and email are used with the default constructor to create contact.

# Data Classes

Kotlin has data classes which are particularly useful for storing data.
Data classes have the same functionality as classes, but they come automatically with additional member functions. These
member functions allow you to easily print the instance to readable output, compare instances of a class, copy
instances, and more

```
data class User(val name: String, val id: Int)
```