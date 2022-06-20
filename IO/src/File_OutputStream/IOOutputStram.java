package File_OutputStream;
/**
 * @author 林光亮
 * @version 1.0
 * 将数据写入文件，如果文件不存在，就自动创建文件
* */
import java.io.*;

public class IOOutputStram {
    public static void main(String[] args) {
        IOOutputStram ioOutputStram = new IOOutputStram();
        File filePath = new File("D:\\JAVAProgram\\IO\\TestFile\\OutputStream");
        String fileName = "OutputStream.txt";
        ioOutputStram.WriteFile(filePath,fileName);
    }
    public void WriteFile(File filePath,String fileName){
        File file = new File(filePath,fileName);
        FileOutputStream fileOutputStream = null;
        try {
            //new FileOutputStream(file)创建方式是覆盖的，当写入内容时会覆盖原来的内容
            //当后面加上true之后（append=true），就会以追加的方式写入
            fileOutputStream = new FileOutputStream(file,true);
            //写入一个字节
            fileOutputStream.write('a');
            //写入字符串
            String outputString = "this is string!";
            //getBytes()把字符串转换为字节流
            fileOutputStream.write(outputString.getBytes());
            //将字符串的某一部分写进去
            fileOutputStream.write(outputString.getBytes(),5,2);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
