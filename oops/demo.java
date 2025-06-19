package oops;
 class parent{
        parent(){
            System.out.println("parent class");
        }
    }
    class child extends parent{
        child(){
            System.out.println("child class");
        }
    }

public class demo {
   
    public static void main(String[] args) {
        child t1=new child();
        System.out.println(t1);
    }
}
