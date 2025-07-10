package ads.poo;

public class Aldeao extends Personagem implements Guerreiro, Coletador{
    private static final double VIDA_ALDEAO = 25;
    private static final double ATAQUE_ALDEAO = 1;
    private static final double VELOCIDADE_ALDEAO = 0.8;

    public Aldeao() {
        super(VIDA_ALDEAO, ATAQUE_ALDEAO, VELOCIDADE_ALDEAO);
    }

    @Override
    public String mover() {
        return "Aldeão se movendo na velocidade de " + VELOCIDADE_ALDEAO;
    }

    @Override
    public String atacar() {
        return "Aldeão atacando com a força de " + ATAQUE_ALDEAO;
    }

    @Override
    public String coletarMadeira() {
        return "Aldeão coletando madeira";
    }

    @Override
    public String coletarOuro() {
        return "Aldeão coletando ouro";
    }

//    @Override
//    public String mover() {
//        return "Aldeão " + super.mover() + VELOCIDADE_ALDEAO;
//    }
//
//    @Override
//    public String atacar() {
//        return "Aldeão " + super.atacar() + ATAQUE_ALDEAO;
//    }
}
