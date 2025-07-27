import java.util.ArrayList;
import java.util.Arrays;

public class sum111 {
    public static void main(String[] args) {
        ArrayList<Integer> Arr1 = new ArrayList<>(Arrays.asList(2, 4, 6, 8));
        System.out.println(Arr1);
        for(int i=0;i<Arr1.size();i++)
        {
            int sum = Arr1.getFirst()+Arr1.getLast();
            System.out.println(sum);

        }
              
    }
}
