public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    
    @Override
    public void tocarMusica() {
        System.out.println("Tocando música");
    }
    
    @Override
    public void pausarMusica() {
        System.out.println("Música pausada");
    }
    
    @Override
    public void pararMusica() {
        System.out.println("Música parada");
    }

    @Override
    public void fazerChamada() {
        System.out.println("Fazendo chamada");
    }

    @Override
    public void receberChamada() {
        System.out.println("Recebendo chamada");
    }

    @Override
    public void encerrarChamada() {
        System.out.println("Chamada encerrada");
    }

    @Override
    public void abrirPaginaWeb() {
        System.out.println("Abrindo página web");
    }

    @Override
    public void fazerPesquisa() {
        System.out.println("Realizando pesquisa");
    }

    @Override
    public void navegarPara() {
        System.out.println("Navegando para página");
    }
}
