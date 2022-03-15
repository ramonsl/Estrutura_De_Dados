package Aula01;

import java.util.Scanner;

public class Exer04 {
    public static void main(String[] args) {
        int vetor[]= new int[10];
        lerVetor(vetor,10);
        exibirVetor(vetor,10);


    }

    public static void lerVetor(int vetor[], int tam){
        Scanner tc = new Scanner(System.in);
        for (int i=0;i<tam;i++){
            System.out.println("Digite o valor");
            vetor[i]=tc.nextInt();
        }
    }

    public static void exibirVetor(int vetor[], int tam){
        for (int i=0;i<tam;i++){
            if(vetor[i]>50){
                System.out.println("valor:"+ vetor[i]+" posição:"+(i+1));
            }
        }
    }
}
