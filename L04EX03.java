package Lista_04;
import java.util.Scanner;

public class L04EX03 {
    public static void main(String[] args) {
        Scanner escreve = new Scanner(System.in);
        String nome, sexo, est_civil;
        int idade, salario;

        System.out.print("Digite seu nome:");
        nome = escreve.nextLine();
        if (nome.length()>3){
            System.out.print("Digite sua idade:");
        idade = escreve.nextInt();

        if (idade > 0 && idade< 150){
            System.out.print("Digite o seu salario:");
        salario = escreve.nextInt();
        escreve.nextLine();
        if (salario>0){
            System.out.print("Digite o seu sexo, 'm' ou 'f':");
        sexo = escreve.nextLine();

        if (sexo.equals("M")|| sexo.equals("F")){
            System.out.print("Digite o seu estado civil, 's', 'c', 'v', 'd':");
        est_civil = escreve.nextLine();

        if (est_civil.equals("s")||est_civil.equals("c")||est_civil.equals("v")||est_civil.equals("d")){
            System.out.println("Dados recolhidos com sucesso!!");
        }
        else{
            System.out.println("ESTADO CIVIL INVALIDO.");
        }
        }
        else{
            System.out.println("SEXO INVALIDO.");
        }
        }
        else {
            System.out.println("SALARIO INVALIDO.");
        }
        
        }
        else{
            System.out.println("IDADE INVALIDA.");
        }
        
        }
        else {
            System.out.println("NOME INVALIDO.");
        }
        escreve.close();
    }
}
