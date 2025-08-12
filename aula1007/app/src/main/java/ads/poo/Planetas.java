package ads.poo;

public enum Planetas {
    MERCURIO("Mercúrio", 1),
    VENUS("Venus", 2),
    TERRA("Terra", 3),
    MARTE("Marte", 4),
    JUPITER("Jupiter", 5),
    SATURNO("Saturno", 6),
    URANO("Urano", 7),
    NETUNO("Netuno", 8);

    private int posicaoAoSol;
    private String nome;

    Planetas(String nome, int posicaoAoSol) {
        this.nome = nome;
        this.posicaoAoSol = posicaoAoSol;
    }

    @Override
    public String toString() {
        return "SistemaSolar{" +
                "posicaoAoSol=" + posicaoAoSol +
                ", nome='" + nome + '\'' +
                '}';
    }
}
