import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class file_handleing
{
  public static void main(String[] args) throws IOException {
   FileReader s=null;
   FileWriter f=null;
   try{
   s=new FileReader("pandurangasai.txt");
   f=new FileWriter("output.txt");
   while(s.read()!=-1)
   {
      f.write(s.read());
   }
}
   finally
   {
      if(s!=null)
      {
         s.close();
         f.close();
      }
   }
  }
}