package device;
import interfaces.ReprodutorMusical;
import interfaces.AparelhoTelefonico;
import interfaces.NavegadorInternet;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    
    @Override
    public void tocar(){ 
        System.out.println("Tocando a música");
    }
    public void pausar(){
        System.out.println("Pausando a música");
    }
    public void selecionarMusica(String musica){
        System.out.println("Selecionando a música: " + musica);
    }
    @Override
    public void ligar(String numero){
        System.out.println("Ligando " +numero);
    }
    public void atender(){
        System.out.println("Atendendo");
    }
    public void iniciarCorreioVoz(){
        System.out.println("Iniciando Correio de Voz");
    }
    @Override
    public void exibirPagina(String url){
        System.out.println("Exibindo Página: " +url);
    }
    public void adicionarNovaAba(){
        System.out.println("Adicionando Nova Aba");
    }
    public void atualizarPagina(){
        System.out.println("Atualizando Página");
    }
}