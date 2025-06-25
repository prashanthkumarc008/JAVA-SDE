public class wrapper {
    public static void main(String[] args) {
        int a=100;
        Integer b=200;
        String c="A";

        //Converting premetive DT to Object.
        Integer d=a;  // Integer d=Integer.ValueOf(a);
        System.out.println(d);

        //Converting object to Premetive DT.
        int e=d;  // int e=d.intValue(); 
        System.out.println(e);



    }
}
