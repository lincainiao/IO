package Buffered_;

/**
 * 做成处理流
 */
public class BufferedReader_ extends  Reader_{
    private Reader_ reader_;

    public BufferedReader_(Reader_ reader_){
        this.reader_ = reader_;//reader_ = bufferedReader_
    }

    //扩展reader_功能
    //实现父类的方法，封装一层
    public void readFile(){
        reader_.readFile();
    }

    public void readString(){
        reader_.readString();
    }

    public void read(){
        reader_.read();
    }

    public void readFiles(int num){
        for (int i = 0; i < num; i++) {
            //调用父类Reader_的方法，在FileReader_中实现
            reader_.readFile();
        }
    }

    public void readStrings(int num){
        for (int i = 0; i < num; i++) {
            reader_.readString();
        }
    }

}
