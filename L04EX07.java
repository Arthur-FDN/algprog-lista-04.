package Lista_04;
import java.util.Scanner;

public class L04EX07 {
    public static void main(String[] args) {
        Scanner escreve = new Scanner(System.in);
        System.out.println("Escreva 5 numeros:");
        int vetor[] = new int[5];
        vetor [0]= escreve.nextInt();
        vetor [1]= escreve.nextInt();
        vetor [2]= escreve.nextInt();
        vetor [3]= escreve.nextInt();
        vetor [4]= escreve.nextInt();
        int maior = vetor[0];
        for (int i=0;i<vetor.length;i++){
            if (vetor[i]>maior){
                maior=vetor[i];
            }
        }
        System.out.println("O maior valor é: " + maior);
        escreve.close();
    }
}
