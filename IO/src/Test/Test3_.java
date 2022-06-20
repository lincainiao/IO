package Test;

import javax.imageio.IIOException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Test3_ {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(
                                new FileInputStream(
                                new File("D:\\JAVAProgram\\IO\\TestFile","test.dat")));

        //反序列化
        Object pet = ois.readObject();
        Dog dog = (Dog)pet;

        System.out.println(dog.getName());
        System.out.println(dog.getAge());
        System.out.println(dog.getColor());

        ois.close();
    }
}
