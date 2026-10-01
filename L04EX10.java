package Lista_04;

import java.util.Scanner;

public class L04EX10 {
    public static void main(String[] args) {
        Scanner escreve = new Scanner(System.in);

System.out.println("Digite o primeiro número:");
int a = escreve.nextInt();
System.out.println("Digite o segundo número:");
int b = escreve.nextInt();

int menor = Math.min(a, b);
int maior = Math.max(a, b);

for (int i = menor; i <= maior; i++) {
    System.out.println(i);
}
escreve.close();
    }
}

