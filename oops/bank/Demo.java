package oops.bank;
abstract class bank {
    abstract void cal_bal();
    
}
class Account{
    String acc_name;
    public String getAcc_name() {
        return acc_name;
    }
    public void setAcc_name(String acc_name) {
        this.acc_name = acc_name;
    }

    String acc_email;
    public String getAcc_email() {
        return acc_email;
    }
    public void setAcc_email(String acc_email) {
        this.acc_email = acc_email;
    }

}

class SA extends Account{
       private int acc_id;
       public int getAcc_id() {
        return acc_id;
        }
       public void setAcc_id(int acc_id) {
           this.acc_id = acc_id;
       }
       private int acc_bal;
       public int getAcc_bal() {
           return acc_bal;
       }
       public void setAcc_bal(int acc_bal) {
           this.acc_bal = acc_bal;
       }
       
        static double min_bal;

        void cal_bal(){
            

        }
        
    }
    class CA extends Account{
        private int acc_id;
       public int getAcc_id() {
        return acc_id;
        }
       public void setAcc_id(int acc_id) {
           this.acc_id = acc_id;
       }
       private int acc_bal;
       public int getAcc_bal() {
           return acc_bal;
       }
       public void setAcc_bal(int acc_bal) {
           this.acc_bal = acc_bal;
       }
       
        static double min_bal;

        void cal_bal(){

        }
        

    }


public class Demo {
        public static void main(String[] args) {
            SA sa1=new SA();
            CA ca1=new CA();
            sa1.setAcc_bal(5000);
            ca1.setAcc_bal(22000);
            int sa_bal=sa1.getAcc_bal();
            System.out.println(sa_bal);
            int ca_bal=ca1.getAcc_bal();
            System.out.println(ca_bal);

        
    }
}
