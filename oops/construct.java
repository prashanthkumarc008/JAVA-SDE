package oops;

public class construct {
    int a;
    construct(int a){
        this.a=a;
        System.out.println("constructor method");
    }
    public static void main(String[] args) {
        construct t1=new construct(10);
        construct t2=new construct(20);
        System.out.println(t1.a);
        System.out.println(t2.a);
    }
    
}
