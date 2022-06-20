package Object_;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class OIS {
    public static void main(String[] args) throws Exception{
        File filePath = new File("D:\\JAVAProgram\\IO\\TestFile");
        String fileName = "text.dat";
        File file = new File(filePath,fileName);
        ObjectInputStream oIS = new ObjectInputStream(new FileInputStream(file));

        //反序列化时一定要按顺序
        System.out.println(oIS.readInt());

        //cai在编译时为Object类
        Object cat = oIS.readObject();
        System.out.println(cat.getClass());
        System.out.println(cat);

        //希望调用Pet的方法，需要向下转型
        //需要引入Pet类的定义
        Pet pet = (Pet)cat;
        System.out.println(pet.getName());
        System.out.println(pet.getAge());

        oIS.close();
    }
}
