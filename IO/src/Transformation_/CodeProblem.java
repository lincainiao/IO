package Transformation_;

/**
 * 解决乱码问题，InputStreamReader转换字节流为字符流
 * 将FileInputStream字节流装换为字符流InputStreamReader字符流，指定编码为utf-8
 */

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.text.Bidi;

public class CodeProblem {

    //源文件：为GBK码
    private static File file = new File("D:\\JAVAProgram\\IO\\TestFile\\Transformation","codeProblem.txt");

    public static void main(String[] args) throws Exception{
        CodeProblem cP = new CodeProblem();

        //读取文件，默认按照UTF_8编码
        BufferedReader br = new BufferedReader(new FileReader(file));
        //接收读取的文件，输出会出现乱码
        String line;
        while ((line = br.readLine()) != null){
            System.out.println(line);
        }

        //转换流，把字节流FileInputStream转换为字符流InputStreamReader
        //InputStreamReader isr = new InputStreamReader(new FileInputStream(file),"gbk");
        //包装字符流
        br = new BufferedReader(new InputStreamReader(
                                new FileInputStream(file),"gbk"));
        System.out.println(br.readLine());

        br.close();
        //isr.close();
    }
}
