package Lista_04;

import java.util.Scanner;

public class L04EX08 {
    public static void main(String[] args) {
        Scanner escreve = new Scanner(System.in);
        System.out.println("Escreva 5 numeros:");
        int vetor[] = new int[5];
        vetor [0]= escreve.nextInt();
        vetor [1]= escreve.nextInt();
        vetor [2]= escreve.nextInt();
        vetor [3]= escreve.nextInt();
        vetor [4]= escreve.nextInt();
        int soma=0,media=0;
        for(int i=0;i<vetor.length;i++){
            soma=soma+vetor[i];
            media=soma/vetor.length;  
        }
        System.out.println("A soma dos numeros digitados e: " +soma);
        System.out.println("A media dos numeros digitados e: "+media);
        escreve.close();
}
}
