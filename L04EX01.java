package Lista_04;

import java.util.Scanner;

public class L04EX01 {

    public static void main(String[] args) {
        Scanner escreve = new Scanner(System.in); 
        boolean n=true;
        while(n){
            System.out.print("Digite uma nota entre zero e dez:");
            int n1 = escreve.nextInt();
            if (n1<0 || n1>10){
            System.out.println("Valor invalido");
            }
            else if (n1>=0 || n1<=10){
                n=false;
            }
        }
        escreve.close();
    }
}


