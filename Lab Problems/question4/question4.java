import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Writer;

/*Watch any of the favorite movie of your choice (any language is fine, preferably English). Create a
Text file to store at least 10 meaningful dialogs from the movie and store it in a text file. Process the
file to remove the stop words (eg. the, is, was, …….) and create another file to have clean text (word). */
public class question4 {
     public static void main(String[] args) throws Exception {
          writeInFile();

     }

     static void writeInFile() throws Exception {
          FileReader read = new FileReader("raw.txt");
          FileWriter wwrite = new FileWriter("edit.txt");
          try {
               BufferedReader r = new BufferedReader(read);
               String s = r.readLine();

               while (s != null) {
                    String[] str = s.split(" ");
                    for (String find : str) {
                         if (find.equals("The") || find.equals("is") || find.equals("the") || find.equals("was")
                                   || find.equals("Was")) {
                         } else {
                              wwrite.write(find + " ");
                         }
                    }
                    wwrite.write("\n");
                    s = r.readLine();
               }

          } catch (Exception e) {
          } finally {
               if (read != null) {
                    read.close();
                    wwrite.close();

               }
          }

     }
}