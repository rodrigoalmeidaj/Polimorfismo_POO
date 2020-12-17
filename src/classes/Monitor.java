package classes;
//classe final, nao podendo ser herdada
public final class Monitor extends Telas {
    private float resolucao;
    
    public Monitor(String marca, float tamanho, float resolucao) {
        super(marca, tamanho);
        this.resolucao = resolucao;
    }

    @Override // sobreposição de método
    public void ligar() {
        System.out.println("Ligou o Monitor");
    }

    @Override
    public void desligar() {
        System.out.println("Desligou o Monitor");

    }

    @Override
    public void menu() {
        System.out.println("-- Menu --");
        System.out.println("Aperte as setas para controlar");
        System.out.println("[Brilho] - 50%");
        System.out.println("[Nitidez] - 80%");
        System.out.println("[Modo] - Esportes");
        System.out.format("Marca:%s,Tamanho:%.0f',Resolução:%.0fp\n", getMarca(), getTamanho(), getResolucao());
    }
    

    /**
     * @return float return the resolucao
     */
    public float getResolucao() {
        return resolucao;
    }

    /**
     * @param resolucao the resolucao to set
     */
    public void setResolucao(float resolucao) {
        this.resolucao = resolucao;
    }

}