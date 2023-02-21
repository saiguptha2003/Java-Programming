import java.io.FileWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;
public class bufferwriter {
    public static void main(String[] args)throws Exception {
        try(FileWriter s=new FileWriter("read.txt"))
        {
            s.write("sdfassaf");
        }
    }
}
