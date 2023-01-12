import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Hashtable;
import java.util.Scanner;

/*Write a java program to create Hashtable to act as a dictionary for the word collection. The dictionary
meaning of the words, including synonyms, etc., has to be displayed. */
public class question5 {
     public static Hashtable<String, String> wm = new Hashtable<>();
     public static Hashtable<String, String> wo = new Hashtable<>();
     public static void main(String[] args) throws Exception {
          Scanner r=new Scanner(System.in);
          System.out.println("enter word :\b\b");
          String find=r.next();

          dictionary s=new dictionary();
          s.setdata();
          getdata(find);
     }
          static void getdata(String find) throws Exception {
          String mean = wm.get(find);
          String opposite = wo.get(find);
          System.out.println("word : " + find + "\nsynonym : " + mean + "\nantonynm : " + opposite);

     }
}

class dictionary extends question5 {
     String word;
     String synonym;
     String antoymn;
     

     dictionary(String word, String synonym, String antoymn) {
          this.word = word;
          this.synonym = synonym;
          this.antoymn = antoymn;
          wm.put(word, synonym);
          wo.put(word, antoymn);

     }
     dictionary(){}
     void setdata() throws Exception
     {
          FileReader f1=new FileReader("data.txt");
          try{

          BufferedReader r=new BufferedReader(f1);
          String s=r.readLine();
          while(s!=null)
          {
               String [] p=s.split(" ");
               dictionary d=new dictionary(p[0], p[1], p[2]);
               s=r.readLine();
          }
          }
          finally{
               if(f1!=null)
               {
                    f1.close();
               }
          }
     }
}