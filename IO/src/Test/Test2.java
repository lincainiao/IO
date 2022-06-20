package Test;
//使用BufferedReader读取文本文件，并为每行加上行号，在连同内容一同输出到屏幕上

import java.io.*;

public class Test2 {
    public static void main(String[] args) throws IOException {
        //utf8文件
        BufferedReader br = new BufferedReader(new FileReader(new File("D:\\JAVAProgram\\IO\\TestFile","a.txt")));
        //接收读到的内容
        String line;
        int i = 1;
        while ((line = br.readLine()) != null){
            System.out.println(i+"."+line);
            i++;
        }

        //gbk文件
        File file = new File("D:\\JAVAProgram\\IO\\TestFile","b.txt");
        FileInputStream fis = new FileInputStream(file);
        InputStreamReader isr = new InputStreamReader(fis,"gbk");
        br = new BufferedReader(isr);
        i = 1;
        line="";
        while ((line = br.readLine()) != null){
            System.out.println(i+line);
            i++;
        }


        br.close();
    }
}
