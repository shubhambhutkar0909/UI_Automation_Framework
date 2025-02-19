
# UI Test Automation Framework

This repository contains a Java-based Test Automation Framework designed for demonstrating my automation skills. 

The framework supports data-driven testing, logging, cloud execution with LambdaTest platform, headless mode, and CI/CD integration with GitHub Actions.



## 🚀 About Me
Hi My Name is Shubham Bhutkar and I am Testing professional with over 8.5+ years of experience in Software Quality Assurance testing, proficient in testing Web-based applications and Client/Server applications, and good knowledge of Core Java, OOPs concepts, and Hand-on experience on Selenium, GIT, Jenkins, Manual, And Automation testing.


## Author
- Shubham Bhutkar
- [@Linkedin](www.linkedin.com/in/shubham-bhutkar-sdet)

🚀 Getting Started

📌 Prerequisites

    Before setting up the project, ensure the following tools are installed:

    ☕ Java 11

    🛠 Maven 

    🖥 Git

    🌍 Chrome or Firefox Browser (for local execution)

    ☁ LambdaTest Account (for cloud execution)

✨ Features

    ✅ Supports Local & Cloud Execution (LambdaTest)
    ✅ Data-driven Testing with CSV, JSON, and Excel files
    ✅ Headless Browser Execution for faster tests
    ✅ Configurable Test Execution using Maven CLI
    ✅ Detailed Logging with Log4j
    ✅ CI/CD Integration via GitHub Actions

🔧 Technology Stack

    🚀 Java 11

    🧪 TestNG (Test Framework & Runner)

    📊 OpenCSV, JSON, Apache POI (Data-driven Testing)

    ☁ LambdaTest (Cloud-based Execution)

    ⚙ Maven Surefire Plugin (CLI Test Execution)

    📜 Log4j (Logging)

    🔄 GitHub Actions (CI/CD Integration)

📂 Project Structure

|-- src/test/java         # Fraamwork and Test Scripts

|-- testdata/             # CSV, JSON, Excel test data

|-- logs/                 # Log4j logs

|-- pom.xml               # Maven dependencies

|-- .github/workflows/    # GitHub Actions workflows

|-- README.md             # Project Documentation📥 Installation

    1️⃣ Clone the repository:
    git clone https://github.com/shubhambhutkar0909/UI_Automation_Framework.git

    2️⃣ Running Test on LamdaTest:
    
    mvn test -Dbrowser=chrome -DisLambdaTest=true -DisHeadless=false -X

🖥 Running Tests Locally

    mvn test -Dbrowser=chrome -DisLambdaTest=false -DisHeadless=true -X

📜 Logging

    📝 Logs are generated using Log4j and stored in the logs/ directory.⚙ Log levels and configurations can be modified in log4j.properties.

🚀 Integrated - GitHub Actions

    This framework includes GitHub Actions for automated test execution.

    📂 Workflow File: .github/workflows/maven.yml

    ✅ Runs tests on every push & PR

    ✅ Runs tests also gets executed at 11:30 PM IST everyday with help of Cron Job setup

    ✅ Supports execution on multiple browsers

    ✅ Reports test results in GitHub Actions

🚀 To manually trigger a GitHub Actions workflow:

    1️⃣ Navigate to the Actions tab in your repository.

    2️⃣ Select the workflow and click Run workflow


## 🔗 Links
[![portfolio](https://img.shields.io/badge/my_portfolio-000?style=for-the-badge&logo=ko-fi&logoColor=white)](https://github.com/shubhambhutkar0909)

[![linkedin](https://img.shields.io/badge/linkedin-0A66C2?style=for-the-badge&logo=linkedin&logoColor=white)](www.linkedin.com/in/shubham-bhutkar-sdet)

