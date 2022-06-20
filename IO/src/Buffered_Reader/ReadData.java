package Buffered_Reader;

import java.io.*;

public class ReadData {
    public static void main(String[] args) throws IOException {
        BufferedReader bufReader = new BufferedReader(new FileReader("D:\\JAVAProgram\\IO\\IO\\src\\mysql.properties"));


        String line;
        while ((line = bufReader.readLine()) != null){
            //将读到的内容用=分开成字符数组
            if (line.contains("=")){
                String[] read = line.split("=");
                System.out.println(read[0]+":"+read[1]);
            }
        }

        bufReader.close();
    }
}
