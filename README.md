<h1 align="center">Working width DB SqLite 🛢️</h1>
## ℹ️ About
This project focuses on working with an SQLite database to manage a list of email addresses. The main class, `Kata5P1`, reads email addresses from a file, `email.txt`, and inserts them into an SQLite database named `mail.db`. The database has a single table named `direcc_email`, which stores email addresses.

# 👥 Development Team (Ctrl + Click to view profiles)

[![GitHub](https://img.shields.io/badge/GitHub-Alejandro%20David%20Arzola%20Saavedra-blue?style=flat-square&logo=github)](https://github.com/AlejandroDavidArzolaSaavedra)


## 🚀 Usage
To use the project, follow these steps:

1. Ensure you have the necessary dependencies and environment set up for Java development.
2. Clone or download the project to your local machine.
3. Open the project in a Java development environment, such as NetBeans.
4. Compile and run the `Kata5P1` class.

## 📂 Project Structure
- **Kata5P1.java**: The main class that reads email addresses from a file and inserts them into the SQLite database.
  - `main`: Entry point of the application.
  - `metodo`: Method to iterate through the list of email addresses and call the `insert` method for each.
  - `insert`: Method to insert an email address into the `direcc_email` table.

- **MailListReader.java**: Utility class for reading email addresses from a file.
  - `read`: Method to read email addresses from a file and return a list of valid email addresses.

- **SelectApp.java**: Class to demonstrate selecting data from an SQLite database (unused in the current project).

## 🛠️ Database Configuration
The SQLite database is configured with the following parameters:
- **Database Name**: mail.db
- **Table Name**: direcc_email
- **Columns**: 
  - id (auto-incremented integer, primary key)
  - direccion (text, not null)

## 🛠️ Dependencies
- Java Standard Library
- SQLite JDBC Driver

## 📝 Notes
- The database connection details and file paths are hard-coded in the `Kata5P1` class. Modify them based on your local setup.
- The `SelectApp` class is included but not currently utilized in the main application.

Feel free to explore, modify, and integrate this project into your own Java applications. If you encounter any issues or have questions, please refer to the code comments or reach out for assistance.
