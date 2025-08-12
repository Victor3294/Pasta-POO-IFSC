package ads.poo;

public class Carta {
    private Naipes naipe;
    private Valores valor;

    public Carta(Naipes naipe, Valores valor) {
        this.naipe = naipe;
        this.valor = valor;
    }

    @Override
    public String toString() {
        return this.naipe + "" + this.valor + this.naipe;
    }
}
