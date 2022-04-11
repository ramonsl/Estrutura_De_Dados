package Aula06;

public class Pilha {//Pilha? //FILA
    //atributos
    private int top;
    private int[] vetor;
    //construtor //metodos especiais
    public Pilha(int t){
        vetor= new int[t];
        top= -1;
    }
  //    |--|--|--|--|--|  //tam 5
    //-1

    //métodos //LIFO
    //public void init(){} // subs pelo construtor

    public boolean push(int qualquerCoisa){
        if(isFull()){
            return false;
        }else{
            top++;
            vetor[top]=qualquerCoisa;
            return true;
        }
    }

    private boolean isFull() {
        if (size()==top+1){
            return true;
        }
        return false;
    }

    public boolean pop(){
        if(isEmpty()){
            return false;
        }else{
            top--;
            return true;
        }
    }
    public int size(){
        return vetor.length;
    }

    public int top(){
        if (!isEmpty()){
            return vetor[top];
        }else{
            return -1;
        }

    }

    private boolean isEmpty() {
        if(top==-1){
            return true;
        }
        return false;
    }


}


