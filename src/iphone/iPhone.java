
package iphone;

import sistemaios.IOS;;

public class iPhone {

    public static void main(String[] args) {

        IOS iphone = new IOS();

        System.out.println("Testando o Reprodutor Musical:");
        iphone.selecionarMusica("Bohemian Rhapsody");
        iphone.tocar();
        iphone.pausar();

        System.out.println("\nTestando o Aparelho Telefônico:");
        iphone.ligar();
        iphone.atender();
        iphone.iniciarCorreioVoz();

        System.out.println("\nTestando o Navegador na Internet:");
        iphone.exibirPagina("www.google.com");
        iphone.adicionarNovaAba("www.openai.com");
        iphone.atualizarPagina();
    }
}
