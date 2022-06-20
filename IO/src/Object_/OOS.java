package Object_;

import java.io.*;

public class OOS {
    private static File filePath = new File("D:\\JAVAProgram\\IO\\TestFile");
    private static String fileName = "text.dat";

    public static void main(String[] args) throws Exception{
        File file = new File(filePath,fileName);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file));

        objectOutputStream.writeInt(10);
        objectOutputStream.writeObject(new Pet());

        objectOutputStream.close();
    }

}
