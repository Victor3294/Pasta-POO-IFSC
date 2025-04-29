package ads.poo;

public class Contador {
    private int valorAtual;

    public void definirValorAtual (int valorAtual) {
        if(valorAtual < 0) {
            valorAtual = 1;
        }
        this.valorAtual = valorAtual;
    }

    public int obterValorAtual () {
        return this.valorAtual;
    }

    public void incrementaUm () {
        this.valorAtual = this.valorAtual + 1;
    }
}
