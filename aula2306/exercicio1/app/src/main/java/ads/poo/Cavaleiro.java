package ads.poo;

public class Cavaleiro extends Personagem implements Guerreiro{
    private static final double VIDA_CAVALEIRO = 50;
    private static final double ATAQUE_CAVALEIRO = 3;
    private static final double VELOCIDADE_CAVALEIRO = 2;

    public Cavaleiro() {
        super(VIDA_CAVALEIRO, ATAQUE_CAVALEIRO, VELOCIDADE_CAVALEIRO);
    }

    @Override
    public String mover() {
        return "Cavaleiro se movendo na velocidade de " + VELOCIDADE_CAVALEIRO;
    }

    @Override
    public String atacar() {
        return "Cavaleiro atacando com a força de " + ATAQUE_CAVALEIRO;
    }
}
