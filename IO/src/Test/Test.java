package Test;
//判断D:\JAVAProgram\IO\TestFile下是否有文件a.txt，没有就创建
//在D:\JAVAProgram\IO\TestFile\Test目录下创建文件hello.txt，如果hello.txt存在，就提示文件存在，不需要重复创建

import com.sun.source.tree.NewArrayTree;

import java.io.*;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws IOException{

//        File file1 = new File("D:\\JAVAProgram\\IO\\TestFile","a.txt");
//        if (!file1.exists()){
//            file1.createNewFile();
//            System.out.println("文件已创建");
//        }

        File file2 = new File("D:\\JAVAProgram\\IO\\TestFile\\Test","hello.txt");
        File path = new File("D:\\JAVAProgram\\IO\\TestFile\\Test");
        //创建D:\JAVAProgram\IO\TestFile\Test文件夹
        path.mkdir();
        if (file2.exists()){
            System.out.println("hello.txt已存在");
        }else {
            file2.createNewFile();
            System.out.println("file2已创建");
        }

        BufferedWriter bw = new BufferedWriter(new FileWriter(file2));
        bw.write("Hello World!");
        bw.close();
    }
}
