package Buffered_;

/**
 * 节点流
 */
public abstract class Reader_ {

    //抽象类，靠子类实现
    //在子类FileRead_中实现
    public void readFile(){

    }

    //在子类StringReader_中实现
    public void readString(){

    }

    //用read()方法统一管理
    //后面调用时，利用动态绑定机制绑定到对应的子类实现
    public void read(){

    }

}
