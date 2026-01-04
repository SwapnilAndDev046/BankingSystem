# 🏦 Banking System – Core Java Project

A **console-based Banking System** built using **Core Java** to demonstrate strong understanding of **OOP principles, Collections, and Exception Handling**.  
This project simulates real-world banking operations such as account creation, deposits, withdrawals, money transfer, and transaction tracking.

---

## 📌 Features

- Create a new bank account
- Deposit money
- Withdraw money with balance validation
- View current account balance
- View transaction history
- Transfer money between accounts
- Proper error handling using **custom exceptions**

---

## 🛠️ Technologies Used

- Java (Core Java)
- OOP Concepts
- Java Collections Framework
- Custom Exception Handling

---

## 🧠 OOP Concepts Implemented

### 🔹 Encapsulation
- Account data (balance, account number, etc.) is kept private
- Accessed and modified using public methods

### 🔹 Polymorphism
- Different account behaviors handled through method overriding
- Same operation behaves differently based on account logic

### 🔹 Abstraction
- Common account structure defined using base classes
- Specific logic implemented in child classes

### 🔹 Exception Handling
- Used `try-catch` blocks for runtime safety
- Created **custom exceptions** for business rules

---

## 🚫 Custom Exceptions Used

- `AccountNumberNotFoundException` – when account does not exist
- `LowBalanceException` – when balance is insufficient
- `InvalidInputException` – when input is invalid

---

## 📂 Project Structure
src/
├── Account.java
├── BankSystem.java
├── Transaction.java
├── AccountNumberNotFoundException.java
├── LowBalanceException.java
└── InvalidInputException.java


▶️ How to Run

Clone the repository

Open the project in any Java IDE (IntelliJ / Eclipse / VS Code)

Run BankSystem.java

Use the console menu to interact with the system

🎯 Learning Outcomes

Hands-on experience with real-world Java design

Strong understanding of collections and data handling

Clear usage of OOP principles

Foundation ready for Spring Boot & backend development
