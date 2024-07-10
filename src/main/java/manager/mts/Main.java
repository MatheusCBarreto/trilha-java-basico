package manager.mts;

import manager.mts.domain.Iphone;

public class Main {
    public static void main(String[] args) {

        Iphone iphone = new Iphone();
        iphone.tocar();

        iphone.pausar();

        iphone.selecionarMusica("doente de amor...");

        iphone.ligar();

        iphone.atender();

        iphone.iniciarCorreioVoz();

        iphone.exibirPagina("dio");

        iphone.atualizarPagina();

        iphone.adicionarNovaPagina();
    }
}