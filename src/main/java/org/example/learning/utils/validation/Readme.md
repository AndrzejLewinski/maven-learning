# ValidationUtils - Java Learning Project 🍃✅

`ValidationUtils` is a helper Java class for input validation in console applications.  
The project was created as part of learning exception handling, working with the `Scanner` class, and writing clear validation methods.

---

## What does the class contain?

- Methods for safely reading various data types from user input.
- Validations for integers, positive integers, ranged integers, floating-point numbers, booleans, and non-empty strings.
- A colorful terminal menu with emojis and ANSI formatting.

---

## Available Methods

| Method                             | Description                                |
|----------------------------------|--------------------------------------------|
| 🔢 `readInteger(Scanner)`           | Reads any integer                           |
| 🔼 `readPositiveInt(Scanner)`       | Reads a positive integer (>0)               |
| 🚫 `readDivisor(Scanner)`            | Reads an integer different from zero       |
| ✅ `readBoolean(Scanner)`            | Reads a boolean value (`true`/`false`)     |
| ➗ `readDouble(Scanner)`              | Reads a floating-point number               |
| 🎯 `readIntInRange(Scanner, min, max)` | Reads an integer within a specified range |
| 📝 `readNonEmptyString(Scanner)`     | Reads a non-empty string                     |

---

## How to Use?

1. Create a `Scanner` object to read data from the console.
2. Call the methods from `ValidationUtils`, passing the scanner as an argument.
3. The methods automatically validate input and prompt for re-entry in case of errors.

---

## License

This project is licensed under the [MIT License](LICENSE). You are free to use, modify, and distribute the code, provided that proper credit is given.

---
