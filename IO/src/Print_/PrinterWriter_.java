package Print_;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrinterWriter_ {
    public static void main(String[] args) throws IOException {
        PrintWriter pw = new PrintWriter(System.out);

        //修改打印位置
        PrintWriter pw_ = new PrintWriter(new FileWriter("D:\\JAVAProgram\\IO\\TestFile\\Print\\print.txt"));

        pw_.print("hello");

        pw.print("string!");

        pw.close();
        pw_.close();
    }
}
