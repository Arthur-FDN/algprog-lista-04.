package Lista_04;

public class L04EX04 {
    public static void main(String[] args) {
        double a=80000, b=200000;
        int i=0;
        while(b>=a){
            a=a+(a*0.03);
            b=b+(b*0.015);
            i ++;
        }
        System.out.println("A quantidade de anos necessaria e de:"+i);
    }
}
