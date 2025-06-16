package ads.poo;

public class Dimensao {
    private double largura;
    private double comprimento;
    private double altura;

    public Dimensao(double largura, double altura, double comprimento) {
        this.largura = largura;
        this.altura = altura;
        this.comprimento = comprimento;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
       return "Largura: " + sb.append(this.largura)
                .append("\n")
                .append("Altura: ")
                .append(this.altura)
                .append("\n")
                .append("Comprimento: ")
                .append(this.comprimento);
    }
}
