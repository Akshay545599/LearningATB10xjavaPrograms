package ex_24_Exceptions;


    import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

    public class Lab_212_Throws  {
        public static void main(String[] args) throws FileNotFoundException, Exception {
            FileInputStream fileInputStream = new FileInputStream("C://a.log");
        }


}
