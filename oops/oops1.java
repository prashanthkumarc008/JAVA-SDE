package oops;
class person{
    private int acc_id;
    public int getAcc_id() {
        return acc_id;
    }
    public void setAcc_id(int acc_id) {
        this.acc_id = acc_id;
    }
    String name="rajini";
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
public class oops1 {
    public static void main(String[] args) {
        person a=new person();
        person b=new person();
        person c=new person();
        System.out.println(a.name);
        System.out.println(b.name);
        System.out.println(c.name);
        
    }
}
