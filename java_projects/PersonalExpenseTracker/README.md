# Personal Expense Tracker

A desktop **Personal Finance Tracker** built in **Java** that allows users to record, manage, and analyze their income and expenses through a graphical user interface (GUI).

This application helps users monitor their financial activity, categorize spending, and maintain better control over their personal finances.

---

## Overview

The Personal Expense Tracker is designed to provide a simple and intuitive way for users to manage their daily financial transactions. Users can add, edit, delete, and view transactions, allowing them to track where their money is going and better understand their spending habits.

The project follows a **Model–View–Controller (MVC)** architecture to ensure clean separation of concerns and maintainable code structure.

---

## Features

- Add income and expense transactions
- Categorize transactions (e.g., Food, Transport, Rent, Entertainment)
- View transaction history
- Edit existing transactions
- Delete transactions
- Automatic balance calculation
- Simple and intuitive graphical user interface
- Input validation to prevent invalid entries

---

## Planned Improvements

Future enhancements planned for the project include:

- Monthly spending analytics
- Graphs and charts for visual financial insights
- Budget management system
- Data export (CSV / Excel)
- Persistent data storage using files or a database
- Dark mode / UI themes
- Search and filtering for transactions

---

## Technologies Used

- **Java**
- **Java Swing / JavaFX**
- **Object-Oriented Programming (OOP)**
- **MVC Architecture**
- **ArrayLists for data management**

---

## Project Architecture

The project is structured using the **MVC (Model–View–Controller)** design pattern.

This separation improves maintainability, readability, and scalability of the code.

### Model

Responsible for managing the application's data and business logic.

Examples:
- Transaction objects
- Financial calculations
- Data structures for storing transactions

### View

Responsible for displaying the graphical user interface and interacting with the user.

Examples:
- Main application window
- Transaction input forms
- Tables displaying transaction history

### Controller

Acts as the intermediary between the View and Model.

Responsibilities:
- Handling user actions
- Validating input
- Updating the model
- Refreshing the user interface

---

## Project Structure

```
PersonalExpenseTracker
│
├── src
│   └── com
│       └── personalexpense
│           ├── app
│           │     App.java
│           │
│           ├── model
│           │     Transaction.java
│           │     FinanceManager.java
│           │
│           ├── controller
│           │     TransactionController.java
│           │
│           ├── view
│           │     MainWindow.java
│           │     AddTransactionView.java
│           │
│           └── storage
│                 FileManager.java
│
├── screenshots
│
└── README.md
```

---

## How to Run the Application

1. Clone the repository

```
git clone https://github.com/yourusername/PersonalExpenseTracker.git
```

2. Open the project in your preferred IDE (VS Code, IntelliJ, Eclipse)

3. Navigate to:

```
src/com/personalexpense/app/App.java
```

4. Run the `main()` method to start the application.

---

## Example Use Case

1. Launch the application
2. Add a new transaction
3. Choose whether it is **Income** or **Expense**
4. Assign a category
5. Enter the amount and description
6. Save the transaction
7. View the updated balance and transaction list

---

## Learning Objectives

This project was developed to practice and demonstrate the following software engineering concepts:

- Object-Oriented Programming principles
- GUI application development in Java
- MVC architecture
- Event-driven programming
- Code organization and modular design
- Git and GitHub version control

---

## Screenshots

Screenshots of the application interface will be added here as the project develops.

Example:

```
screenshots/
    dashboard.png
    add-transaction.png
```

---

## Author

Developed by **Dearborn Chisale** as part of a **DevClub project**.

---

## License

This project is open-source and available for educational and learning purposes.