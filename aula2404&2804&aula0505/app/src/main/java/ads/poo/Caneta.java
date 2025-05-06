package ads.poo;

public class Caneta {

    private String cor;
    private double nivelTinta;
    private boolean aberta;

    private static final double NIVEL_PADRAO = 100;
    private static final String PONTA_PADRAO = "-";

    public Caneta(String cor, double nivelTinta, boolean aberta) {
        this.cor = cor;
        this.nivelTinta = nivelTinta;
        this.aberta = aberta;
    }

    public Caneta(String cor) {
        this(cor, NIVEL_PADRAO, false);
    }
    
    public Caneta(String cor, double nivelTinta) {
        this(cor, nivelTinta, false);
    }

    public Caneta() {
        this.cor = "preto";
        this.nivelTinta = NIVEL_PADRAO;
        this.aberta = false;
    }


    public String desenhar (int quantidade, String caractere) {
        return caractere.repeat(quantidade);
    }

    public String desenhar (int quantidade) {
        return desenhar(quantidade, PONTA_PADRAO);
    }

    @Override
    public String toString() {
        return "Caneta [cor=" + cor + ", nivelTinta=" + nivelTinta + ", aberta=" + aberta + "]";
    }
    
}
