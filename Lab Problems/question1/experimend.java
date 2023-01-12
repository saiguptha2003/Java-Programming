import java.io.FileReader;
import java.io.IOException;

import java.io.BufferedReader;
import java.io.Reader;
import java.nio.Buffer;

/*Declare a class Named Teacher. The class will have all the data members as per your convenient.
The class will have constructors. Write a function to read the values of the class variables. The values
of the variable will be stored in a FILE (text file). The values will be stored in a structured format of
your own choice.
Further, read the content of the FILE and display the content in an ordered form (First Name, Last
Name).
Concept Learning:
1. FILE manipulation
2. Use try catch blocks
3. Use multiple try catch block
4. Finally statement
Try to have your own Exception
 */
public class experimend{
     public static void main(String[] args) throws IOException {
          Teacher s=new Teacher("lisft.txt");
     }
}
     
class Teacher {

     Teacher(String File_name) throws IOException {
          FileReader s=new FileReader(File_name);
          try{
               BufferedReader f=new BufferedReader(s);
               String g=f.readLine();
               while(g!=null)
               {
                    String e[]=g.split(" ");
                    System.out.printf("first name: %s\n",e[0]);
                    System.out.printf("last name: %s\n",e[1]);
                    g=f.readLine();
               }
          }
          finally
          {
               if(s!=null)
               {
                    s.close();
               }
          }
     }
       
}
