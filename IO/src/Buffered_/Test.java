package Buffered_;

public class Test {
    public static void main(String[] args) {
        BufferedReader_ bufferedReaderS = new BufferedReader_(new StringReader_());
        //String
        bufferedReaderS.read();
        bufferedReaderS.readString();
        bufferedReaderS.readFile();
        //File
        BufferedReader_ bufferedReaderF = new BufferedReader_(new FileReader_());
        bufferedReaderF.read();
    }
}
