package File_Reader;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class IOFileReader {
    public static void main(String[] args) {
        IOFileReader ioFileReader = new IOFileReader();
        File filePath = new File("D:\\JAVAProgram\\IO\\TestFile\\Reader");
        String fileName = "FileReader.txt";
        ioFileReader.readFile(filePath,fileName);
    }

    public void readFile(File filePath,String fileName){
        File file = new File(filePath,fileName);
        //创建字符流读文件对象
        FileReader fileReader = null;
        int readData = 0;
        char[] buf = new char[8];
        try {
            fileReader = new FileReader(file);
            //使用字符数组读取文件，返回实际读到的字符数
            while((readData = fileReader.read(buf))!=-1){
                System.out.print(new String(buf,0,readData));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
