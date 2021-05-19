package Task5311;
import java.io.*;
import java.nio.charset.Charset;
/*Реализуйте метод, который зачитает данные из InputStream и преобразует их в строку, используя заданную кодировку.*/
public class Main {
    public static void main(String[] args) throws IOException {
        ByteArrayInputStream inputStream = new ByteArrayInputStream(new byte[]{48, 49, 50, 51});
        //InputStream inputStream = new InputStreamReader(inputStream, charset);
        //ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.out.println(readAsString(inputStream, Charset.defaultCharset()));

    }
    public static String readAsString(InputStream inputStream, Charset charset) throws IOException {
        Reader reader = new InputStreamReader(inputStream, charset);
        StringWriter r = new StringWriter();
        int b;
        while ((b = reader.read()) != -1) {
            r.write(b);
        }
        return r.toString();
    }




}
