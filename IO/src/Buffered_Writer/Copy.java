package Buffered_Writer;

import Buffered_Reader.BufReader;

import java.io.*;

public class Copy {
    //源文件
    static String souFileName = "BufferedWriter.txt";
    //目的文件
    static String desFileName = "copy.txt";
    //源、目的文件路径
    File filePath = new File("D:\\JAVAProgram\\IO\\TestFile\\Buffered");
    public static void main(String[] args) {
      Copy copy = new Copy();
      copy.copyFile();
    }

    public void copyFile(){
        //源文件
        File souFile = new File(filePath,souFileName);
        //目的文件
        File desFile = new File(filePath,desFileName);
        //源文件
        BufferedReader bufReader = null;
        //目的文件
        BufferedWriter bufWriter = null;
        //接收读到的内容
        String line;
        //判断第一行
        boolean firstLine = true;
        try {
            //buf封装节点流
            bufReader = new BufferedReader(new FileReader(souFile));
            bufWriter = new BufferedWriter(new FileWriter(desFile));
            //如果读到的内容不为空
            while ((line = bufReader.readLine()) != null){
                //如果是第一行，则直接写入line；否则先换行再写入line
                if(firstLine){
                    bufWriter.write(line);
                    firstLine = false;
                }else {
                    //将读到的字符串写到目的文件
                    bufWriter.newLine();
                    bufWriter.write(line);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                //关闭流
                bufReader.close();
                bufWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
