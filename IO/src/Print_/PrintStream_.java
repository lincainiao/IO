package Print_;

import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;

public class PrintStream_ {
    public static void main(String[] args) throws IOException {
        PrintStream_ ps_ = new PrintStream_();

        PrintStream out = System.out;
//        PrintStream newOut = new PrintStream("D:\\JAVAProgram\\IO\\TestFile\\Print\\print.txt");
        //默认情况下，printStream输出的位置标准输出，也就是显示器
        out.print("string");
        out.println();

        //print用的是底层的write方法，write是字节打印流
        out.write("string".getBytes());

        //修改打印的位置
        System.setOut(new PrintStream("D:\\JAVAProgram\\IO\\TestFile\\Print\\print.txt"));
        System.out.println("this is printStream!");

        //恢复打印位置
        System.setOut(out);
        System.out.println("here");
        out.close();
    }
}
