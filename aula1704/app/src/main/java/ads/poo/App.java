/*
 * This source file was generated by the Gradle 'init' task
 */
package ads.poo;

public class App {

    public static void main(String[] args) {

        Caneta bic = new Caneta();

        bic.definirCor("preta");
        bic.definirNivelTinta(100);
        bic.abrirFechar();
        System.out.println(bic.obterNivelTinta());
        System.out.println(bic.desenhar(5));
        System.out.println(bic.obterNivelTinta());
        System.out.println(bic.desenhar(6));
        System.out.println(bic.obterNivelTinta());
        System.out.println(bic.desenhar(2));

    }
}
