package ads.poo;

public class Celular extends Semfio{
    public String sistemaOperacional;

    public Celular(int codigo, String numSerie, String modelo,
                   double peso, Dimensao dim, double frequencia,
                   int canais, double distancia, String sistemaOperacional) {
        super(codigo, numSerie, modelo, peso, dim, frequencia, canais, distancia);
        this.sistemaOperacional = sistemaOperacional;
    }
}
