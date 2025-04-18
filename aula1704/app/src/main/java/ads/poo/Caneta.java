package ads.poo;

public class Caneta {
    private String cor;
    private double nivelTinta;
    private boolean aberta;

    public void definirCor(String cor) {
        this.cor = cor;
    }

    public String obterCor () {
        return cor;
    }

    public void definirNivelTinta(double nivelTinta) {
        if(nivelTinta > 100 || nivelTinta < 0) {
            this.nivelTinta = 100;
        } else {
            this.nivelTinta = nivelTinta;
        }

    }

    public double obterNivelTinta () {
        return nivelTinta;
    }

    public void abrirFechar () {
        aberta = !aberta ;
    }

    public boolean isAberta () {
        return aberta;
    }

    public String desenhar (int quantidadeCaracteres) {
        String resultado = "-";
        int quantidadeConsigoDesenhar = (int) nivelTinta / 10;
        if(!aberta) {
            return "";
        }
        if(quantidadeConsigoDesenhar >= quantidadeCaracteres) {
            this.nivelTinta -= quantidadeCaracteres * 10;
            return resultado.repeat(quantidadeCaracteres);
        } else if (quantidadeConsigoDesenhar != 0) {
            this.nivelTinta = 0;
            return resultado.repeat(quantidadeConsigoDesenhar);
        } else {
            return "";
        }



    }




}