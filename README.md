# UML Project with Eclipse

Welcome to the UML project created using Eclipse! This project demonstrates the class diagram and Java implementation for an iPhone, showcasing its roles as a Reprodutor Musical (Music Player), Aparelho Telefônico (Phone Device), and Navegador na Internet (Internet Browser).

## Overview

This project includes:

- UML Class Diagram depicting the structure of the iPhone system.
- Java implementation of the iPhone class that fulfills the roles of a Music Player, Phone Device, and Internet Browser.
- Main class for testing the functionality of the iPhone.

## UML Class Diagram

+-----------------------------------+
|              iPhone               |
+-----------------------------------+
| - modelo: String                  |
| - capacidadeArmazenamento: int    |
|-----------------------------------|
| + tocar(): void                   |
| + pausar(): void                  |
| + selecionarMusica(): void        |
| + ligar(numero: String): void     |
| + atender(): void                 |
| + iniciarCorreioVoz(): void       |
| + exibirPagina(url: String): void |
| + adicionarNovaAba(): void        |
| + atualizarPagina(): void         |
+-----------------------------------+

The class diagram illustrates the relationships and interactions between different components of the iPhone system.

## Project Structure

- `src/`: Contains the Java source code for the iPhone class and the Main class.
- `uml_diagram.png`: Image file containing the UML class diagram.

## Getting Started

1. Clone the repository: `git clone https://github.com/your-username/uml-eclipse-iphone-project.git`
2. Open the project in Eclipse IDE.
3. Run the `Main` class to test the functionality of the iPhone.

## Usage

Feel free to explore and modify the project to suit your needs. The `Main` class demonstrates how to create an iPhone object and use its functionalities as a Music Player, Phone Device, and Internet Browser.

```java
public class Main {
    public static void main(String[] args) {
        iPhone myPhone = new iPhone("iPhone 12", 128);

        // Test the ReprodutorMusical interface
        myPhone.tocar();
        myPhone.pausar();
        myPhone.selecionarMusica();

        // Test the AparelhoTelefonico interface
        myPhone.ligar("123456789");
        myPhone.atender();
        myPhone.iniciarCorreioVoz();

        // Test the NavegadorInternet interface
        myPhone.exibirPagina("https://www.example.com");
        myPhone.adicionarNovaAba();
        myPhone.atualizarPagina();
    }
}
