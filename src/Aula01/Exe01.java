package Aula01;

import java.util.Scanner;

public class Exe01 {
    public static void main(String[] args) {
        double temperaturas[] = new double[7];
        double total=0;
        int cont=0;
        Scanner tc = new Scanner(System.in); ///JOPNI /

        for (int i=0;i<7;i++){
            System.out.println("Digite o valor da primeira temperatura");
            temperaturas[i]= tc.nextDouble();
            total+=temperaturas[i];
            //total=tempereturas[i]+total;
        }
        double media = total/7;
        for (int i=0;i<7;i++){
           if(temperaturas[i]>media){
               cont++;
           }
        }
        System.out.println("Acima da media "+ cont);
    }
}
