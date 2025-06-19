package oops;

public class employee {
    private int eid;
    public void setEid(int eid){
        this.eid=eid;
    }
    public int getEid(){
        return this.eid;
    }
    private String ename;
    public void setEname(String ename){
        this.ename=ename;
    }
    public String getEname(){
        return this.ename;

    }
    public static void main(String[] args) {
        employee a1=new employee();
        employee a2=new employee();
        System.out.println(a1.eid);
        System.out.println(a1.eid);
        System.out.println(a1.ename);
        System.out.println(a2.ename);
    }
}
