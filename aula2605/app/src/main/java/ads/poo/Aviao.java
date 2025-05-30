package ads.poo;

import java.util.ArrayList;

public class Aviao {
    private int tripulantes;
    private int passageiros;
    private double peso;
    private double combustivel;
    private ArrayList<Motor> motores;

    public Aviao(int tripulantes, int passageiros, double peso, double combustivel,
                 int numeroMotores, String tipoMotor) {
        this.tripulantes = tripulantes;
        this.passageiros = passageiros;
        this.peso = peso;
        this.combustivel = combustivel;
        this.motores = new ArrayList<>();
        for (int i = 0; i < numeroMotores; i++) {
            this.motores.add(new Motor(tipoMotor));
        }

    }

    public void ligaDesligaAviao () {
        this.motores.forEach(Motor::ligaDesligaMotor);
    }

    @Override
    public String toString() {
        StringBuilder textoMotores = new StringBuilder();
        motores.forEach(motor -> {
            textoMotores.append("Motor: ")    
                    .append(motor.getTipo())
                    .append("\nConsumo de combustivel: ")
                    .append(motor.getConsumoCombustivel())
                    .append(" litros\n");});
        return "Aviao" +
                "\ntripulantes: " + tripulantes +
                "\npassageiros: " + passageiros +
                "\npeso: " + peso +
                "\ncombustivel: " + combustivel +
                "\nmotores: " + textoMotores;
    }}

