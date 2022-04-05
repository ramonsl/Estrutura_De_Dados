package Aula02;

import java.util.Scanner;


public class Exe01 {
    /*
    Escreva uma classe que Leia 5 nomes e
     notas de uma turma, calcula e exibe a
      média das notas da turma e em seguida
       exibe a relação de nomes cuja nota
       é superior a esta média. Utilize vetores
        para armazenar as notas.
     */
    static class Aluno{
        public double nota;
        public String nome;
    }


    public static void main(String[] args) {
        Aluno alunos[]= new Aluno[5];
        double media =  leitura(alunos,5);

        for(int i=0;i<5;i++){
            if(alunos[i].nota> media){
                System.out.println(alunos[i].nome);
            }
        }
    }
 /*
 ___0______1_______2______N__
 |   RAMOn |  Teste  |       |
 |   5.0   |   6.0   |       |
 _____________________________
*/
    public static double leitura(Aluno vetor[], int tam){
        Scanner tc = new Scanner(System.in); ///JOPNI /
        double total=0;
        for (int i=0;i<tam;i++){
            Aluno a= new Aluno();
            System.out.println("Digite a nota:");
            a.nota= tc.nextDouble();
            System.out.println("Digite o nome:");
            a.nome= tc.next();
            vetor[i]=a;
            total += vetor[i].nota;
        }
        return total/tam;
    }
}
