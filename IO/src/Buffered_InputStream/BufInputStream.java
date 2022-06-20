package Buffered_InputStream;

import java.io.*;

public class BufInputStream {
    //路径
    static File filePath = new File("D:\\JAVAProgram\\IO\\TestFile\\Buffered\\BufferedInputStream");
    //源文件
    static String fileName = "Bis.txt";

    public static void main(String[] args) {
        BufInputStream bufInputStream = new BufInputStream();
        bufInputStream.input();
    }

    public void input(){
        File file = new File(filePath,fileName);

        //读到的实际长度，
        int readLen;
        byte[] buf = new byte[1024];
        String content = "";
        BufferedInputStream bufferedInputStream = null;
        try {
            bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
            //readLen不为-1时表示读到的实际长度，-1表示读取完成，
            while ( (readLen = bufferedInputStream.read(buf) ) != -1){
                content += new String(buf,0,readLen);
//                System.out.println(new String(buf,0,readLen));
            }
            System.out.println(content);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
