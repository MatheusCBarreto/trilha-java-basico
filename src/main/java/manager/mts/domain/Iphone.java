package manager.mts.domain;

import manager.mts.utils.AparelhoTelefonico;
import manager.mts.utils.NavegadorInternet;
import manager.mts.utils.ReprodutorMusical;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    @Override
    public void tocar() {
        System.out.println("TOCANDO MÚSICA.");
    }

    @Override
    public void pausar() {
        System.out.println("PAUSANDO MÚSICA.");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("SELECIONANDO MÚSICA." + musica);
    }

    @Override
    public void ligar() {
        System.out.println("LIGANDO IPHONE.");
    }

    @Override
    public void atender() {
        System.out.println("ATENDENDO...");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("INICIANDO CORREIO VOZ.");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("EXIBINDO PAGINA: " + url);
    }

    @Override
    public void adicionarNovaPagina() {
        System.out.println("ADICIONADO NOVA PAGINA.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("ATUALIZADO PAGINA.");
    }
}
