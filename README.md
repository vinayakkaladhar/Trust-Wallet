# Automated Functional Tests for Trust Wallet App

### Summary
This repository contains the tests for the TrustWallet Android app, these tests are developed using Appium & Java

### Getting Started
- Install Node:

    > brew install node

- Install Appium:

    > npm install -g appium

- Install below 2 external dependencies on your machine:
  - **[Java 11](https://openjdk.java.net/projects/jdk/11/)** (as the core programming language)
    - **[Maven 3.8.5](https://maven.apache.org/download.cgi)** (for dependency management)
    - Follow this [document](https://www.oracle.com/in/java/technologies/downloads/) to install Java
    - Follow this [document](https://maven.apache.org/install.html) to install Maven
    - Follow this [document](https://www.jetbrains.com/help/idea/installation-guide.html#standalone) to install IntelliJ based on your OS. Community edition is good enough to work with this framework.

- To test if the setup is correct.
  - Open this project from IntelliJ/Eclipse/VSCode.

## Pre setup

- Follow setup steps for:
  - [Common](https://automationhacks.io/slides/2021/appium-conf/hello-appium-writing-your-first-tests/04-common-libraries/)
  - [Android](https://automationhacks.io/slides/2021/appium-conf/hello-appium-writing-your-first-tests/05-setup-for-android/)
  - [iOS](https://automationhacks.io/slides/2021/appium-conf/hello-appium-writing-your-first-tests/09-setup-for-ios/)

Start an android emulator based on these capabilities

    capabilities.setCapability("platformName", "android");
    capabilities.setCapability("platformVersion", "14");
    capabilities.setCapability("deviceName", "Pixel 8");

## Running tests

    > mvn clean test -Dtests=CreateNewWalletTests

## Reports

> To find each test class report

- Navigate to target/surefire-reports/

> To find entire suite report

- Navigate to target/emailable-report.html