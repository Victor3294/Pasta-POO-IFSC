package ads.poo;

public class Arqueiro extends Personagem implements Guerreiro{
    private static final double VIDA_ARQUEIRO = 35;
    private static final double ATAQUE_ARQUEIRO = 2;
    private static final double VELOCIDADE_ARQUEIRO = 1;

    public Arqueiro() {
        super(VIDA_ARQUEIRO, ATAQUE_ARQUEIRO, VELOCIDADE_ARQUEIRO);
    }

    @Override
    public String mover() {
        return "Arqueiro se movendo na velocidade de " + VELOCIDADE_ARQUEIRO;
    }

    @Override
    public String atacar() {
        return "Arqueiro atacando com a força de " + ATAQUE_ARQUEIRO;
    }
}
