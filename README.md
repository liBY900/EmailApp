## Email Generator Application

## Overview

This Java program simulates a simple email system for a company. It creates an email account for a new employee by generating a company email address, assigning a department, and creating a random password.

---

## Features

* Creates an email account using the employee’s first and last name
* Allows the user to select a department:

    * Sales
    * Development
    * Accounting
    * None
* Automatically generates a random password
* Creates a company email in the format:
  `firstname.lastname@department.abccompany.com`
* Stores mailbox capacity (default: 500MB)
* Allows setting an alternate email
* Allows changing the password
* Displays user account information

---

## How It Works

1. The program starts in the "EmailApp" class
2. A new "Email" object is created with the user’s name
3. The user is prompted to choose a department
4. A random password is generated automatically
5. A company email address is created based on the user’s name and department
6. The program displays the user’s information

---

## Example Output

```
Your password is A1B2C3D4
Display name: Liberty Kamabnje
Department: sales
Company email: liberty.kamabnje@sales.abccompany.com
Mailbox capacity: 500mb
```

---

## Technologies Used

* Java
* Object-Oriented Programming (OOP) concepts
* Scanner for user input

---

## Future Improvements

* Add email validation
* Improve password strength (include lowercase letters)
* Handle invalid department input
* Remove extra dot when no department is selected
* Build a graphical user interface (GUI)

---

