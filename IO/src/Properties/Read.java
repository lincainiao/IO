package Properties;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

/**
 * Properties父类是Hashtable，底层是Hashtable，核心方法就是table
 * 使用Properties读取mysql.properties文件
 */
public class Read {
    public static void main(String[] args) throws IOException {

        //创建properties对象
        Properties properties = new Properties();

        //加载指定配置文件
        properties.load(new FileReader(new File("D:\\JAVAProgram\\IO\\IO\\src","mysql.properties")));

        //输出到控制台
//        properties.list(System.out);
        //获取对应的值
        System.out.println("the old charset is "+properties.get("charset"));

        //修改charset
        if (properties.getProperty("charset").equals("utf8")){
            properties.setProperty("charset","gbk");
        }else {
            properties.setProperty("charset","utf8");
        }
        //将修改的内容写进文件
        properties.store(new FileWriter(new File("D:\\JAVAProgram\\IO\\IO\\src","mysql.properties")),null);
        System.out.println("the new charset is "+properties.getProperty("charset"));

    }
}
