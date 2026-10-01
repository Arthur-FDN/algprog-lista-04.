package Lista_04;
import java.util.Scanner;

public class L04EX05 {
       public static void main(String[] args) {
        double a, b, txa,txb;
        int i=0;
        Scanner escreve = new Scanner(System.in);
        System.out.print("Informe a populacao da cidade 'a':");
        a=escreve.nextDouble();
        System.out.print("Informe a taxa de crescimento da cidade 'a' em %:");
        txa=escreve.nextDouble();
        System.out.print("Informe a populacao da cidade 'b':");
        b=escreve.nextDouble();
        System.out.print("Informe a taxa de crescimento da cidade 'b' em %:");
        txb=escreve.nextDouble();

        txa=txa/100;
        txb=txb/100;

        if (b>a){
            while(b>=a){
            a=a+(a*txa);
            b=b+(b*txb);
            i ++;
        }
        System.out.println("A quantidade de anos necessaria e de:"+i);
        }
        else if(a>b){
            while(a>=b){
            a=a+(a*txa);
            b=b+(b*txb);
            i ++;
        }
        System.out.println("A quantidade de anos necessaria e de:"+i);
        }
        escreve.close();
    
    }
}

