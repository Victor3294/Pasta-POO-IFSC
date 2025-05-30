package ads.poo;

public class Motor {
    private String tipo;
    private int consumoCombustivel;
    private boolean taLigado;

    public Motor(String tipo) {
        this.tipo = tipo;
        this.taLigado = false;
        if(tipo.equals("Helice")){
            this.consumoCombustivel = 10;
        } else if (tipo.equals("Turbina")){
            this.consumoCombustivel = 5;
        }
    }

    public String getTipo() {
        return tipo;
    }

    public int getConsumoCombustivel() {
        return consumoCombustivel;
    }

    public void ligaDesligaMotor () {
        this.taLigado = !taLigado;
    }

}
