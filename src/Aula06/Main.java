package Aula06;

public class Main {
    public static void main(String[] args) {
        Pilha p= new Pilha(7);
        p.push(8);
        p.push(9);
        p.push(2);
        p.push(4);
        p.push(5);
        p.push(6);
        System.out.println(p.push(7));
        System.out.println(p.push(33));
        System.out.println(p.top());
        p.pop();
        System.out.println(p.top());

    }
}
