package Interface.Iphone;

import Interface.Funcionalidades.Internet.Internet;
import Interface.Funcionalidades.Ipod.Ipod;
import Interface.Funcionalidades.Telefone.Telefone;

public class Iphone implements Internet, Ipod, Telefone{

    // Internet:
    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página...");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando uma nova aba...");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página...");
    }

    // Ipod: 
    @Override
    public void tocar() {
        System.out.println("Tocando música...");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando música...");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando música...");
    }

    // Telefone: 
    @Override
    public void ligar(String numero) {
        System.out.println("Ligando...");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo...");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correiro de voz");
    }
    
}
