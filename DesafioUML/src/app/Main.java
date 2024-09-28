package app;
import device.Iphone;

public class Main {
    
    public static void main(String[] args) {
        Iphone iphone = new Iphone();
        
        //Reprodutor musical
        iphone.selecionarMusica("The long and winding road - The beatles");
        iphone.tocar();
        iphone.pausar();
        System.out.println();
        //Telefone
        iphone.ligar("123-4567");
        iphone.atender();
        iphone.iniciarCorreioVoz();
        System.out.println();
        //Navegador Internet
        iphone.exibirPagina("www.google.com");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
    }
    
}