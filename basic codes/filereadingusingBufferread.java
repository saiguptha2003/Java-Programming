import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.CountDownLatch;

class filereadingusingBufferread{
    public static void main(String[] args) throws IOException {
        try(FileReader f=new FileReader("read.txt");
        BufferedReader r=new BufferedReader(f))
        {
            String s;
            while((s=r.readLine())!=null)
            {
                String [] str=s.split("");
                System.out.println(s);
            }
        }
    }
}