package IO;

import java.io.File;

public class FileInformation {
    public static void main(String[] args) {
        String path = "D:\\JAVAProgram\\IO主要方法\\TestFile\\CreateFile\\newFile01.txt";
        File file = new File(path);
        //获取文件名
        System.out.println("file's name : "+ file.getName());
        //获取文件绝对路径
        System.out.println("file's AbsolutePath : "+ file.getAbsolutePath());
        //获取父级目录
        System.out.println("file's ParentPath : "+ file.getParent());
        //获取文件大小(字节)
        System.out.println("file's Length : "+file.length());
        //判断文件是否存在
        System.out.println("file exit? : "+file.exists());
        //判断文件是否为目录
        System.out.println("file is a dir? : "+file.isDirectory());
    }

}
