package classes;
//classe abstract nao podendo ser instanciada, sendo usada apenas como "pai", e obriga as classes filhas a usar os mesmos métodos abstract
public abstract class Telas {
    private String marca;
    private float tamanho;

    public Telas(String marca, float tamanho) {
        this.marca = marca;
        this.tamanho = tamanho;
    }

    public abstract void ligar();
    public abstract void desligar();
    public abstract void menu();

    /**
     * @return String return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return float return the tamanho
     */
    public float getTamanho() {
        return tamanho;
    }

    /**
     * @param tamanho the tamanho to set
     */
    public void setTamanho(float tamanho) {
        this.tamanho = tamanho;
    }

}