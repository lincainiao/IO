package File_Writer;

import java.io.*;

public class IOFileWriter {
    //回车
    static String crlf = System.getProperty("line.separator");
    public static void main(String[] args) {
        IOFileWriter ioFileWriter = new IOFileWriter();
        File filePath = new File("D:\\JAVAProgram\\IO\\TestFile\\Writer");
        String fileName = "writeFile.txt";
        ioFileWriter.writeFile(filePath,fileName);

    }
    public void writeFile(File filePath,String fileName){
        File file = new File(filePath,fileName);
        FileWriter fileWriter = null;
        char[] bufC = {'L','G','L'};
        String bufS = "lingl";
        try {
            //append = true,表示以追加的方式写入
            fileWriter = new FileWriter(file,false);
            //写入单个字符
            //fileWriter.write('L');
            //写入字符数组
            //fileWriter.write(bufC);
            //写入字符数组的一部分
            //fileWriter.write("lingl",0,3);
            //写入字符串
            //fileWriter.write(bufS+crlf+bufS);
            //写入字符串的一部分
            fileWriter.write(bufS,0,3);

            //在数据量大的时候，使用循环写入

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                //一定要close()或flush()才能成功的写入文件
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
