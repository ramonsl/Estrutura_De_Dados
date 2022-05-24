package ListaDuplamenteEncadeada;

public class Elemento {
    int dado;//qualquer coisa
    Elemento prox;
    Elemento ant;
    public Elemento(int value){
        dado= value;
    }

    public void show(){
        System.out.println("Valor:"+dado);
    }

}
