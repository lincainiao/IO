package Object_;

import java.io.Serializable;

//实现序列化，类对象要实现Serializable接口
public class Pet implements Serializable {
    //序列化版本号，提高兼容性
    private static final long serialVersionUID = -135161351561361L;
    private String name;
    private int age;

    public Pet(){
        this.age = 3;
        this.name = "name";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
