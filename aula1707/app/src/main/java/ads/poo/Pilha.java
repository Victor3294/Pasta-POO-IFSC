package ads.poo;

public class Pilha <T>{
    private T[] dados;
    private int posicao;

    public Pilha ( int limite) {
        this.dados = (T[]) new Object[limite];
        this.posicao = 0;

    }

    public void empilhar (T elemento) {
        if(!isCheia()){
            this.dados[posicao] = elemento;
            this.posicao ++;
        } else {
            //retorna exeção
        }
    }

    public T desempilhar () {
        if(!isVazia()){
            T dado = dados[posicao-1];
            dados[posicao] = null;
            this.posicao--;
            return dado;
        } else {
            return null;
        }
    }

    public boolean isCheia () {
        if(this.posicao == dados.length - 1){
            return true;
        }
        return false;
    }

    public boolean isVazia () {
        if(this.posicao == 0){
            return true;
        }
        return false;
    }
}
