package lamda;
interface Innerlamda1 {
    int add(int a,int b);
}

public class lamda1 {
    public static void main(String[] args) {
        Innerlamda1 lamda=(a,b)->a+b;
        System.out.println(lamda.add(10, 20));
        
    }
}
