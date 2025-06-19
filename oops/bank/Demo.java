package oops.bank;
class Account{
    String acc_name;
    String acc_email;
    Account(String name,String email){
        this.acc_name=name;
        this.acc_email=email;
    }

}

    class SA extends Account{
        int acc_id;
        double acc_bal;
        static double min_bal;
        SA(int id,String name,String email,double bal){
            super(name,email);
            this.acc_id=id;
            this.acc_bal=bal;
        }
    }


public class Demo {
        public static void main(String[] args) {
        SA sa1=new SA(101, "ananda", "pacchu@gmail.com", 5000.00);
        System.out.println(sa1.acc_id);
    }
}
