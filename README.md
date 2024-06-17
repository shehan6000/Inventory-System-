# InventorySystem

## Introduction

The Inventory System is a simple Java application designed to manage an inventory of products. It allows users to add, remove, and list products in an inventory. The inventory data is saved to and loaded from a CSV file, making it easy to persist and retrieve product information.

## Features

- Add a new product to the inventory
- Remove an existing product from the inventory
- List all products in the inventory in a table format
- Save inventory data to a CSV file
- Load inventory data from a CSV file


## Installation

1. **Clone the repository:**

    ```bash
    git clone https://github.com/YOUR_GITHUB_USERNAME/InventorySystem.git
    cd InventorySystem
    ```

2. **Build the project using Maven:**

    ```bash
    mvn clean package
    ```

## Usage

### Running the Application

1. **Navigate to the project directory:**

    ```bash
    cd path/to/your/InventorySystem
    ```

2. **Run the application:**

    ```bash
    java -jar target/InventorySystem-1.0-SNAPSHOT.jar
    ```

### Batch File (Windows)

You can create a batch file to run the application from the command prompt:

1. **Create a `run.bat` file in the project directory with the following content:**

    ```batch
    @echo off
    java -jar target/InventorySystem-1.0-SNAPSHOT.jar
    pause
    ```

2. **Double-click `run.bat` to run the application.**

### Shell Script (Unix-like systems)

You can create a shell script to run the application from the terminal:

1. **Create a `run.sh` file in the project directory with the following content:**

    ```bash
    #!/bin/bash
    java -jar target/InventorySystem-1.0-SNAPSHOT.jar
    read -p "Press Enter to continue..."
    ```

2. **Make the script executable:**

    ```bash
    chmod +x run.sh
    ```

3. **Run the script:**

    ```bash
    ./run.sh
    ```

## Contributing

If you would like to contribute to this project, please fork the repository and submit a pull request. We welcome all contributions!

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for more details.

## Contact

If you have any questions or suggestions, feel free to open an issue or contact me directly.

---

Thank you for using the Inventory System! We hope it helps you manage your products efficiently.


