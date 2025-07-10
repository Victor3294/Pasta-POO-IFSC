package ads.poo;

import edu.princeton.cs.algs4.Draw;

public class Bandeira {
    private double[] coordenadas;
    private double largura;
    private double altura;
    private double escala;

    public Bandeira(double[] coordenadas, double escala) {
        this.coordenadas = coordenadas;
        this.escala = escala;
        this.largura = escala*3;
        this.altura = escala*2;
    }

    public void desenhar (Draw d) {
        d.setPenColor(0, 0, 0);
        d.rectangle(this.coordenadas[0], this.coordenadas[1], this.largura, this.altura);
        d.setPenColor(255, 0, 0);
        d.filledCircle(this.coordenadas[0], this.coordenadas[1], this.escala);
    }
}
