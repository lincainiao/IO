package Buffered_Reader;

import java.io.*;

/**
 * 演示BufferedReader的使用
 */
public class BufReader {
    public static void main(String[] args) {
        BufReader bufRead = new BufReader();

        File filePath = new File("D:\\JAVAProgram\\IO\\TestFile\\Buffered");
        String fileName = "BufferedReader.txt";

        bufRead.readBuffered(filePath,fileName);
    }

    public void readBuffered(File filePath, String fileName){
        File file = new File(filePath,fileName);
        BufferedReader bufferedReader = null;
        String line;
        try {
            //包装节点流
            bufferedReader = new BufferedReader(new FileReader(file));
            //读取(按行读取文件)，返回null时，表示文件读取完毕
            while((line = bufferedReader.readLine()) != null){
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                //只要关闭包装流bufferedReader，会自动关闭其包装的节点流FileReader
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
