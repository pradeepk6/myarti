package fragment.submissions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class PradeepK {


    public static void main(String[] args) throws IOException {

        //System.out.println( PradeepK.class.getResource("/reassemble-text-fragments-example.txt").getPath() );
        try (BufferedReader in = new BufferedReader(new FileReader(args[0]))) {
            in.lines() .map(MyClass::reassemble) .forEach(System.out::println);
        }
    }

    static class MyClass {
         static String reassemble(String s) {
            return  s;
        }
    }


}
