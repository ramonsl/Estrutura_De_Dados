package Aula03;

import java.util.Scanner;

public class Carro {
    String placa;

    public void ler(){
        Scanner tc = new Scanner(System.in);
        System.out.println("Digite a placa:");
        placa= tc.next();
    }
}
