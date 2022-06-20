package IO;

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Reader;
import java.lang.reflect.Field;

public class CreateFile {
    public static void main(String[] args) {
        CreateFile createFile = new CreateFile();
        createFile.create();
        createFile.createFile01();
        createFile.createFile02();
        createFile.createFile03();

    }

    //创建目录
    //new File(path).mkdir()
    public void create(){
        String path = "D:\\JAVAProgram\\IO主要方法\\TestFile\\CreateFile\\";
        File dir = new File(path);
        dir.mkdir();
    }

    //方式1
    //new File(String filePath)
    public void createFile01() {
        String filePath = "D:\\JAVAProgram\\IO主要方法\\TestFile\\CreateFile\\newFile01.txt";
        File file = new File(filePath);
        try {
            file.createNewFile();
            System.out.println("create file01 success!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //方式2
    //new File(File parent,String pathChild)//根据父目录文件+子文件路径(文件名)
    public void createFile02(){
        File parentFile = new File("D:\\JAVAProgram\\IO主要方法\\TestFile\\CreateFile\\");
        String fileName = "newFile02.txt";
        File file = new File(parentFile,fileName);
        try {
            file.createNewFile();
            System.out.println("create file02 success!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //方式3
    //new File(String parent,String child)
    public void createFile03(){
        String parentPath = "D:\\JAVAProgram\\IO主要方法\\TestFile\\CreateFile\\";
        String childPath = "newFile03.txt";
        File file = new File(parentPath,childPath);
        try {
            file.createNewFile();
            System.out.println("create file03 success!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
