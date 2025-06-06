package arrayyy;

public class array1 {
    public static void main(String[] args) {
        String[] enames={"RG","SG","PG","NM"};
        System.out.println("length of entire array :"+ enames.length);
        System.out.println("1st index value string length :" + enames[0].length());

        for(int i=0;i<enames.length;i++){
            System.out.println(enames[i]);
        }// for-loop

        int i=0;
        while (i<enames.length) {
            System.out.println(enames[i]);
            i++;
        } // while-loop
        
        for (String ename : enames) {
                System.out.println(ename);
            
        }
    }
}
