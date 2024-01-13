package iPhoneMain;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	
    	Scanner scanner = new Scanner(System.in);
    	String model = null;
    	String capacity = null;
  
    	try {
    		System.out.println("Informe o modelo do iPhone: ");
    	    model = scanner.nextLine();
    	    System.out.println("Informe a capacidade de armazenamento do iPhone: ");
    	    capacity = scanner.nextLine();
    	} catch (Exception e) {
    	    e.printStackTrace();
    	} finally {
    		scanner.close();
    	}

		iPhone myPhone = new iPhone(model, capacity);
        
		myPhone.getMyIphone(myPhone);
		
		
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