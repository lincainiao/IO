import java.io.*;
import java.util.Random;

public class Test {
    public static void main(String[] args) throws Exception{
        Random random = new Random();
        for (int i = 0; i < 1000; i++) {

            String string = random.nextInt(999)+"";
            StringBuffer stringBuffer = new StringBuffer();
            for (int j = 0; j < 3 - string.length(); j++) {
                stringBuffer.append("0");
            }
            string = string+stringBuffer;
            System.out.println(string);
        }
    }
}
