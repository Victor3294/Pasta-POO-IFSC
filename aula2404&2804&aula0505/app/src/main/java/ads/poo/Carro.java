package ads.poo;

public class Carro {
      private int velocidadeAtual;
      private String modelo;
      private static final int VELOCIDADE_MAXIMA_PADRAO = 200;
      private static final int VELOCIDADE_INICIAL_PADRAO = 0;
      private static final String MODELO_PADRAO = "Fusca";

      // Construtor velocidade inicial = 0; sem modelo = fusca;


    public Carro(int velocidadeAtual, String modelo) {
        this.velocidadeAtual = velocidadeAtual;
        this.modelo = modelo;
    }

    public Carro (String modelo) {
        this(VELOCIDADE_INICIAL_PADRAO, modelo);
    }

    public Carro () {
        this(VELOCIDADE_INICIAL_PADRAO, MODELO_PADRAO);
    }
}
