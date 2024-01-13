package iPhoneMain;

import Interfaces.AparelhoTelefonico;
import Interfaces.NavegadorInternet;
import Interfaces.ReprodutorMusical;


/*
* +-----------------------------------+
* |              iPhone               |
* +-----------------------------------+
* | - modelo: String                  |
* | - capacidadeArmazenamento: int    |
* |-----------------------------------|
* | + tocar(): void                   |
* | + pausar(): void                  |
* | + selecionarMusica(): void        |
* | + ligar(numero: String): void     |
* | + atender(): void                 |
* | + iniciarCorreioVoz(): void       |
* | + exibirPagina(url: String): void |
* | + adicionarNovaAba(): void        |
* | + atualizarPagina(): void         |
* +-----------------------------------+
*/
public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    private String modelo;
    private String capacidadeArmazenamento;
    
    public iPhone(String modelo, String capacidadeArmazenamento) {
        this.modelo = modelo;
        this.capacidadeArmazenamento = capacidadeArmazenamento;
    }
    
    public void getMyIphone(iPhone myIphone) {
    	
    	System.out.println("Modelo: " 
    					  + myIphone.modelo 
    					  + "\nCapacidade de Armazenamento: "
    					  + myIphone.capacidadeArmazenamento);
    	
    }
    
    @Override
    public void tocar() {
    	System.out.println("Tocando...");
    }

    @Override
    public void pausar() {
    	System.out.println("Pausando...");
    }

    @Override
    public void selecionarMusica() {
    	System.out.println("Selecionando Música...");
    }

    @Override
    public void ligar(String numero) {
    	System.out.println("Ligando para o número " + numero);
    }

    @Override
    public void atender() {
    	System.out.println("Atender...");
    }

    @Override
    public void iniciarCorreioVoz() {
    	System.out.println("Correio de voz...");
    }

    @Override
    public void exibirPagina(String url) {
    	System.out.println("Exibindo a página " + url);
    }

    @Override
    public void adicionarNovaAba() {
    	System.out.println("Adicionando nova aba...");
    }

    @Override
    public void atualizarPagina() {
    	System.out.println("Atualizando Página...");
    }
}
