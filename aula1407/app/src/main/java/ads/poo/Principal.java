package ads.poo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int[] vetor = new int[10];
        int numero = 0, posicao;
        int a = 0;
        do {
            try{
                System.out.println("Informe um número: ");
                numero = teclado.nextInt();

                a++;
            }catch (InputMismatchException e ){
                System.err.println("Só é permitido números inteiro");
                teclado.nextLine();
            }catch (Exception e){
                System.err.println("Ocorreu o erro: " + e);
            }
        } while (a == 0);
        do {
            try {
                System.out.println("Em qual posição ficará: ");
                posicao = teclado.nextInt();
                vetor[posicao] = numero;
                a++;
            }catch (ArrayIndexOutOfBoundsException e) {
                System.err.println("Estouro de limite de vetor");
                teclado.nextLine();
            }catch (InputMismatchException e ){
                System.err.println("Só é permitido números inteiro");
                teclado.nextLine();
            }
        } while (a == 1);

        System.out.println("Fim do Programa");
        teclado.close();
    }

}

