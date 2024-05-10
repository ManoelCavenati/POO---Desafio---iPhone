package sistemaios;

import sistemaios.appsios.AparelhoTelefonico;
import sistemaios.appsios.NavegadorInternet;
import sistemaios.appsios.ReprodutorMusical;

public class IOS implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    @Override
    public void tocar() {
        System.out.println("Tocando música...");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando música...");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando música: " + musica);
    }

    @Override
    public void ligar() {
        System.out.println("Ligando o telefone...");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo chamada...");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz...");
    }

    @Override
    public void exibirPagina(String pagina) {
        System.out.println("Exibindo página: " + pagina);
    }

    @Override
    public void adicionarNovaAba(String pagina) {
        System.out.println("Adicionando nova aba: " + pagina);
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página...");
    }
}