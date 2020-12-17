package testes;

import classes.Monitor;
import classes.Tv;

public class PolimorfismoTestes {
    public static void main(String[] args) {
        Monitor monitor1 = new Monitor("LG", 24, 1080);
        monitor1.ligar();
        monitor1.menu();
        monitor1.desligar();
        System.out.println("\n");

        Tv tv1 = new Tv("AOC", 32, "LCD FULL HD");
        tv1.ligar();
        tv1.menu();
        tv1.desligar();
        System.out.println("\n");
        
        Tv tv2 = new Tv("Samsung", 55, "Smart TV FULL HD");
        tv2.ligar();
        tv2.menu(2);//puxando o método que foi sobrecarregado
        tv2.desligar();

    }
}