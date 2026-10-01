package Lista_04;

public class L04EX09 {
    public static void main(String[] args) {

        int vetor[] = new int[50];
        for (int i = 0; i < vetor.length; i++) {
        vetor[i] = i + 1; 
    }
        for (int i=0;i<vetor.length;i++){
            if(vetor[i]%2!=0){
                System.out.println(vetor[i]);
            }
        }
}
}
