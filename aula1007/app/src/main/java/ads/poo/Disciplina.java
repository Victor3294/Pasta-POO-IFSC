package ads.poo;

import java.util.Arrays;

public class Disciplina {
    private String sigla;
    private DiasDaSemana[] diasMaterias;

    public Disciplina(String sigla, DiasDaSemana[] diasMaterias) {
        this.sigla = sigla;
        this.diasMaterias = diasMaterias;
    }

    @Override
    public String toString() {
        return "Disciplina{" +
                "sigla='" + sigla + '\'' +
                ", diasMaterias=" + Arrays.toString(diasMaterias) +
                '}';
    }
}
