package ads.poo;

public enum DiasDaSemana {
    DOMINGO("Domingo"),
    SEGUNDA("Segunda"),
    TERCA("Terça"),
    QUARTA("Quarta"),
    QUINTA("Quinta"),
    SEXTA("Sexta"),
    SABADO("Sabado");

    private String nome;

    DiasDaSemana(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return nome;
    }
}
