/*
 * This source file was generated by the Gradle 'init' task
 */
package ads.poo;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {
        Telefone t = new Telefone(1, "1a2b", "ultraMaster2000",
                2, new Dimensao(20, 40, 10) );
        System.out.println(t.toString());
        Semfio st = new Semfio(2, "3c4d", "ultraMaster2001", 3,
                new Dimensao(10, 50, 15), 2, 90, 200);
        System.out.println(st.toString());
        List<Telefone> produtos = new ArrayList<>();
        produtos.add(t);
        produtos.add(st);
        System.out.println("Lista: ");
        for (Telefone elemento : produtos) {
            if(elemento instanceof  Semfio b){
                System.out.println(b);
            }
        }
    }
}
