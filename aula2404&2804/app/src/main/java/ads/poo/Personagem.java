package ads.poo;

public class Personagem {

    private String nome;
    private String classe;
    private String raca;
    private double pontosDeVida;

    public void definirNome (String nome) {
        this.nome = nome;
    }
    public void definirClasse (String classe) {
        this.classe = classe;
    }

    public void definirRaca (String raca) {
        this.raca = raca;
    }

    public void definirPontosDeVida (double pontosDeVida) {
        if(pontosDeVida > 100 || pontosDeVida < 0){
            this.pontosDeVida = 100;
        } else {
            this.pontosDeVida = pontosDeVida;
        }
    }


    public double obterPontosDeVida () {
        return this.pontosDeVida;
    }

    public String obterNome () {
        return this.nome;
    }
    public String obterRaca () {
        return this.raca;
    }
    public String obterClasse () {
        return this.classe;
    }

    public String receberDano (double dano) {
        double vidaPosDano = this.pontosDeVida - dano;
        if(vidaPosDano <= 0) {
            this.pontosDeVida = 0;
            return "O personagem " + this.nome + " chegou a 0 pontos de vida, então ele morreu";
        }
        this.pontosDeVida = vidaPosDano;
        return  "Ai, o personagem " + this.nome +
                " tomou " + dano + " de dano, e ficou com " + this.pontosDeVida + " de vida";
    }

    public String curarVida (double cura) {
        double vidaPosCura = this.pontosDeVida + cura;
        if (vidaPosCura > 100) {
            this.pontosDeVida = 100;
            return "O personagem " + this.nome + " se curou completamente e está de vida cheia";
        } else if (this.pontosDeVida == 0) {
            this.pontosDeVida = vidaPosCura;
            return "O personagem " +
                    this.nome + " estava morto, mas recebeu uma cura abençoada e agora tem " +
                    this.pontosDeVida + " de vida";
        }
        this.pontosDeVida = vidaPosCura;
        return "O personagem " + this.nome + " recebeu uma cura de " +
                cura + " pontos de vida, e agora tem " + this.pontosDeVida + " de vida";
    }

    public String toString () {
        return  "Nome: " + this.nome +
                "\nClasse: " + this.classe +
                "\nRaça: " + this.raca +
                "\nHP: " + this.pontosDeVida;
    }

}
