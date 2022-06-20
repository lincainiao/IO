package Buffered_OutputStream;

import java.io.*;

public class Copy {
    //路径
    static File filePath = new File("D:\\JAVAProgram\\IO\\TestFile\\Buffered\\BufferedInputStream");
    //源文件
    static String srcFileName = "src.png";
    //目的文件
    static String desFileName = "src.jpg";

    public static void main(String[] args) {
        Copy copy = new Copy();
        copy.copyFile();
    }

    public void copyFile(){
        File srcFile = new File(filePath,srcFileName);
        File desFile = new File(filePath,desFileName);

        //封装节点流
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;

        //读取内容的长度
        int readLen = 0;
        //字节数组保存读到的内容
        byte[] buf = new byte[1024];

        try {
            bis = new BufferedInputStream(new FileInputStream(srcFile));
            bos = new BufferedOutputStream(new FileOutputStream(desFile));

            //循环读取文件
            while ((readLen = bis.read(buf)) != -1){
                //写到目的文件
                bos.write(buf,0,readLen);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                //关闭处理流
                if(bis!=null){
                    bis.close();
                }
                if (bos!=null) {
                    bos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}
