package classes;
//classe final, nao podendo ser herdada
public final class Tv extends Telas {
    private String Modelo;

    public Tv(String marca, float tamanho, String modelo) {
        super(marca, tamanho);
        Modelo = modelo;
    }

    @Override
    public void ligar() {
        System.out.println("Ligou a TV");

    }

    @Override
    public void desligar() {
        System.out.println("Desligou a TV");
    }

    @Override
    public void menu() {
        System.out.println("-- Menu --");
        System.out.println("Aperte um numero para acessar");
        System.out.println("[Brilho] - 1");
        System.out.println("[Nitidez] - 2");
        System.out.println("[Modo] - 3");
        System.out.format("Marca:%s,Tamanho:%.0f',Modelo:%s\n", getMarca(), getTamanho(), getModelo());
    }
    //sobrecarga de método
    public void menu(int Smart) {
        System.out.println("-- Menu --");
        System.out.println("-- Aperte um numero para acessar --");
        System.out.println("[SmartHUB] - 1");
        System.out.println("[Brilho] - 2");
        System.out.println("[Nitidez] - 3");
        System.out.println("[Modo] - 4");
        System.out.println("[Netflix] - 5");
        System.out.format("Marca:%s Tamanho:%.0f' Modelo:%s\n", getMarca(), getTamanho(), getModelo());
    }
    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String modelo) {
        this.Modelo = modelo;
    }
    
}