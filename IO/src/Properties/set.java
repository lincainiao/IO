package Properties;
/**
 * 使用Properties创建或修改文件
 */

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class set {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        //使用properties创建新文件
        //改文件有key，就是修改；没有该key，就会创建
        //设置内容
        properties.setProperty("charset","utf8");
        properties.setProperty("address","here");

        properties.setProperty("user","林");

        //将key和value保存到新文件
        //comments为注释，为中文字符时写入的是unicode码
        properties.store(new FileWriter(new File("D:\\JAVAProgram\\IO\\IO\\src","mysql.properties")),"这是注释");

    }
}
