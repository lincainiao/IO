package Test;
//编写Dog.properties
//name=tom
//age=5
//color=red
//编写Dog类（name,age,color）创建一个dog对象，读取Dog.properties用相应的内容完成初始化并输出
import java.io.*;
import java.util.Properties;

public class Test3 {

    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        properties.load(new FileReader(new File("D:\\JAVAProgram\\IO\\IO\\src","Dog.properties")));

        Dog dog = new Dog();
        //对dog对象值赋值
        dog.setName(properties.getProperty("name"));
        //str转换为int型
        dog.setAge(Integer.parseInt(properties.getProperty("age")));
        dog.setColor(properties.getProperty("color"));
        System.out.println(dog.getName());
        System.out.println(dog.getAge());
        System.out.println(dog.getColor());

        //将dog内容序列化到文件
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("D:\\JAVAProgram\\IO\\TestFile","test.dat")));
        oos.writeObject(dog);

        oos.close();
    }
}
