package File_OutputStream;

import java.io.*;

public class FileCopy {
    String oriFileName = "bigHead.png";
    String desFileName = "bigHead2.png";
    public static void main(String[] args) {
        FileCopy fileCopy = new FileCopy();
        File filePath = new File("D:\\JAVAProgram\\IO\\TestFile");
        fileCopy.copyFile(filePath);
    }

    public void copyFile(File filePath){
        File orifile = new File(filePath,oriFileName);
        File desfile = new File(filePath,desFileName);
        FileInputStream fis = null;
        FileOutputStream fos = null;
        byte[] buf = new byte[1024];
        int readData = 0;
        try {
            fis = new FileInputStream(orifile);
            fos = new FileOutputStream(desfile);
            //读到后就写到文件，即边度边写
            while((readData = fis.read(buf))!=-1){
                fos.write(buf,0,readData);
            }
            System.out.println("Done!");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fis.close();
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


}
