package exceptionss;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class test1 {
    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter pw=new PrintWriter("abc.txt");
    }
}
