package ads.poo;

public class App {
    public static void main(String[] args) {
        Arqueiro jorge = new Arqueiro();
        Aldeao gerson = new Aldeao();
        Cavaleiro roger = new Cavaleiro();
//      Personagem adelaido = new Personagem(0, 10, 10);

        System.out.println(jorge.mover());
        System.out.println(jorge.atacar());
        System.out.println(gerson.mover());
        System.out.println(gerson.atacar());
        System.out.println(roger.mover());
        System.out.println(roger.atacar());
    }
}
