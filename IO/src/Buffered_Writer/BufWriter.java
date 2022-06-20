package Buffered_Writer;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufWriter {
    public static void main(String[] args) {
        File filePath = new File("D:\\JAVAProgram\\IO\\TestFile\\Buffered");
        String fileName = "BufferedWriter.txt";
        BufWriter bufWriter = new BufWriter();

        bufWriter.writeBuffered(filePath,fileName);
    }
    public void writeBuffered(File filePath,String fileName){
        File file = new File(filePath,fileName);
        BufferedWriter bufferedWriter = null;
        try {
            //创建BufferedWriter
            bufferedWriter = new BufferedWriter(new FileWriter(file,true));
            bufferedWriter.write("this is lingl!");
            //插入一个和系统相关的换行符
            bufferedWriter.newLine();
            bufferedWriter.write("new line");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
