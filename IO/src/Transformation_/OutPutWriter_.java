package Transformation_;

import java.io.*;

public class OutPutWriter_ {
    private static File file = new File("D:\\JAVAProgram\\IO\\TestFile\\Transformation","codeProblem.txt");

    public static void main(String[] args) throws IOException {

        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(file),"gbk");

        osw.write("this is osw!");

        osw.close();

    }
}
