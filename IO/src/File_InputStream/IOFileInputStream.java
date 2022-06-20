package File_InputStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * @author 林光亮
 * @version 1.0
 * InputStream->IOFileInputStream
 * */
public class IOFileInputStream {
    public static void main(String[] args) {
        IOFileInputStream iOFileInputStream = new IOFileInputStream();
        File filePath = new File("D:\\JAVAProgram\\IO\\TestFile\\InputStream\\");
        String fileName = "helloworld.txt";
        //iOFileInputStream.ReadFile(filePath,fileName);
        iOFileInputStream.ReadFileNew(filePath,fileName);
    }

    public void ReadFile(File filePath,String fileName){
        File file = new File(filePath,fileName);
        FileInputStream fileInputStream = null;
        //用于接收读到的内容
        int readData = 0;
        try {
            //创建FileInputStream对象，用于读取文件
            fileInputStream = new FileInputStream(file);
            //从该输入流读取一个字节的数据，如果没有输入可用，此方法将被阻止
            //如果返回-1，表示读取完毕
            while((readData = fileInputStream.read()) != -1 ){
                System.out.print((char)readData);//转成char显示
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    public void ReadFileNew(File filePath,String fileName){
        File file = new File(filePath,fileName);
        int readLen = 0;
        byte[] buffer = new byte[8];//一次读取8个字节
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(file);
            //g该方法最多读b.length字节数据到字节数组中
            //如果读取正产，返回的是实际读取的字节数
            while ((readLen = fileInputStream.read(buffer)) != -1){
                System.out.print(new String(buffer,0,readLen));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
