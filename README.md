#  AutomationFrame

A powerful automation testing framework built to simplify writing and executing automated tests for web applications.  
This framework provides reusable utilities, test data handling, and reporting features to make test automation structured and scalable.

---

##  Project Overview

AutomationFrame is designed to:
- Facilitate browser automation for web testing
- Maintain clean and reusable test components
- Generate reports and logs for test execution
- Enable easy integration with CI/CD pipelines

---

##  Project Structure

```
AutomationFrame/
│
├── src/
│   ├── main/
│   │   ├── java/
│   │   ├── resources/
│   │
│   └── test/
│       ├── java/
│       ├── resources/
│
├── drivers/
├── reports/
├── testdata/
├── pom.xml (or package.json)
└── README.md
```

---

## 🛠 Core Features

✔ Cross-browser support  
✔ Page Object Model (POM) design  
✔ Reusable test utilities  
✔ Configuration management  
✔ Logging and reporting  
✔ Test data driven execution  

---

##  Installation & Setup

1. **Clone the repository:**

```bash
git clone https://github.com/Karthik2n/AutomationFrame.git
```

2. **Open the project** in your preferred IDE (e.g., IntelliJ IDEA / VS Code / Eclipse).

3. **Install dependencies:**
   - For Java/Maven:
     ```bash
     mvn clean install
     ```
   - For JavaScript/npm:
     ```bash
     npm install
     ```

4. **Configure test settings**  
   Update configuration file under `src/test/resources/config.properties` (or equivalent).

---

##  How to Run Tests

### For Maven (Java):

```bash
mvn test
```

### For npm (JavaScript):

```bash
npm test
```

---

##  Supported Browsers

- Chrome
- Firefox
- Edge

*(Update in config file)*

---

##  Reporting

Reports are generated in the `reports/` directory after test execution.  
They include:
- Passed/failed test details
- Screenshots on failure
- Logs for debugging

---

##  Usage

1. Add test cases under `src/test/java/tests`.
2. Add reusable utilities under `src/main/java/utils`.
3. Update locators and page models under `src/main/java/pages`.
4. Run tests through the test suite configuration.

---

##  Benefits

- Modular and scalable test code
- Easy to integrate with CI/CD tools
- Improves test coverage
- Generates clear and actionable reports

---

## 📜 License

This project is open-source and free to use for automation testing learning and implementation.
