package oops;

public class Parent {
    public void m1(){
        System.out.println("m1 method bro");
    }
    public void m2(){
        System.out.println("m2 method bro");
    }
    class Child extends Parent{
        public void m3(){
            System.out.println("m3 method. you are inside child class");
        }
    }
    public static void main(String[] args) {
        Child a1=new Parent();
        
    }
}
