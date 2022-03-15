package Aula01;

import java.util.Scanner;

public class Exe01OO {
   public double total;
   public int cont;
   public double media;
   public static int DIAS=7;

        public void leitura(double temp[]){
            Scanner tc = new Scanner(System.in); ///JOPNI /
            for (int i=0;i<DIAS;i++){
                System.out.println("Digite o valor da primeira temperatura");
                temp[i]= tc.nextDouble();
                total+=temp[i];
            }
        }
        public double calcularMedia(){
           return media=total/DIAS;
        }
        public int contarDias(double temp[]){
            for (int i=0;i<7;i++){
                if(temp[i]>media){
                    cont++;
                }
            }
            return cont;
        }

        public static void main(String[] args) {
            double temperaturas[] = new double[7];
            Exe01OO atividade = new Exe01OO();
            atividade.leitura(temperaturas);
            atividade.calcularMedia();
            atividade.contarDias(temperaturas);
            System.out.println("Acima da media "+ atividade.cont);
        }


}

