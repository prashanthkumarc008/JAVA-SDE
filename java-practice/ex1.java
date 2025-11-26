class A{
    int a = 7;
    
    public void Hi(){
         System.out.println("Hi from A class");
    }
   
}

class B extends A{
    int a = 9;
    public void Hi(String sa){
         System.out.println("Hi from B class");
    }
}


public class ex1 {
    public static void main(String[] args) {
        A obj = new B();
        // B obj2 = (B) obj;
        // System.out.println(obj2.a);
        obj.Hi("hloo");
        System.out.println(obj.a);
    }
}
