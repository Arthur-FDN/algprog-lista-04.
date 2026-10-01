package Lista_04;
import java.util.Scanner;

public class L04EX02 {
    public static void main(String[] args) {
        Scanner escreve = new Scanner(System.in);
        String nome, senha;
        boolean v= true;
        while(v){
        System.out.print("Escreva Seu nome de usuario:");
        nome= escreve.nextLine();
        System.out.print("Digite sua senha:");
        senha= escreve.nextLine();
        System.out.print("\n");
        if (senha.equals(nome)){
            System.out.println("[ERRO]"+"\n"+"SENHA INVALIDA!"+"\n");
        }
        else {
            v=false;
        }
    }  
    escreve.close();
}
}
