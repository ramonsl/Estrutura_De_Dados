package Aula03;

import java.util.Random;
import java.util.Scanner;

public class Matriz {

    /*2-Faça um programa, que uma matriz seja criada de 4 por 4 contento valor 0 em todos os campos.O programa deve apresentar o seguinte menu:
Adicionar elemento
 Remover elemento(coloca o valor 0)
Limpar Matriz
Mostrar Matriz
Sair
Ao pressionar A no menu, o usuário irá informar a linha e coluna e o elemento que deseja adicionar. Se já existir um valor na posição o mesmo deve informar ao usuário para aí sim sobrescrever o valor.
Ao pressionar R, o usuário deve informar a linha e coluna e o valor deve ser apagado “0”;
Ao pressionar L, a matriz deve ser “limpa” adicionando o valor 0 em todos os campos
Ao pressionar M, o programa deve mostrar a matriz e os valores;
Ao pressionar S, o programa deve para a execução;
IMPORTANTE o programa deve validar os índices da matriz e as opções do menu;

*/
    public static void main(String[] args) {
        int tam=4;
        String op;

        int[][] matriz= new int[tam][tam];
        Scanner tc = new Scanner(System.in);
        limpar(tam,matriz,0);
        do{
            System.out.println("A - Adicionar");
            System.out.println("R - Remover");
            System.out.println("L - Limpar");
            System.out.println("M - Mostrar");
            System.out.println("S - Sair");
            op =tc.next();
            switch (op.toLowerCase()){
                case "a":{
                    add(tam,matriz);
                    break;
                }
                case "r":{
                    remover(tam,matriz);
                    break;
                }
                case "l":{
                    limpar(tam,matriz,0);
                    break;
                }
                case "m":{
                    mostrar(tam,matriz);
                    break;
                }
                case "s":{
                    System.out.println("Bye Bye");
                    break;
                }
            }
        }while (!op.equals("s".toLowerCase()));

    }

    public static void mostrar(int tam, int[][]matriz){
        for (int l=0;l<tam;l++){
            for(int c=0;c<tam;c++){
                System.out.print(matriz[l][c]);
                System.out.print(" - ");
            }
            System.out.println();
        }
    }
    public static void limpar(int tam, int[][]matriz, int v){
        for (int l=0;l<tam;l++){
            for(int c=0;c<tam;c++){
                //  Random r = new Random();
                // System.out.println( matriz[l][c]=  r.nextInt(2));
                matriz[l][c]=v;
            }
        }
    }
    public static void add(int tam, int[][]matriz){
        Scanner tc = new Scanner(System.in);
        System.out.println("Digite a Linha:");
        int linha=tc.nextInt();
        System.out.println("Digite a coluna:");
        int coluna= tc.nextInt();
        System.out.println("Digite o valor:");
        int value = tc.nextInt();

        if(linha >=tam || coluna >=tam){
            System.out.println("Intervalo não permitido");
        }else{
            if(matriz[linha][coluna]==0){
                matriz[linha][coluna]=value;
            }else {
                System.out.println("deseja subistituir??S ou N");
                String subs= tc.next();
                if (subs.equals("s")){
                    matriz[linha][coluna]=value;
                }else{
                    System.out.println("valor não alterado "+  matriz[linha][coluna]);
                }
            }
        }


        }

    public static void remover(int tam, int[][]matriz){
        Scanner tc = new Scanner(System.in);
        System.out.println("Digite a Linha:");
        int linha=tc.nextInt();
        System.out.println("Digite a coluna:");
        int coluna= tc.nextInt();
        if(linha >=tam || coluna >=tam){
            System.out.println("Intervalo não permitido");
        }else {
            if (matriz[linha][coluna] != 0) {
                matriz[linha][coluna] = 0;
            }else{
                System.out.println("Valor já é zero");

            }
        }
    }
}
