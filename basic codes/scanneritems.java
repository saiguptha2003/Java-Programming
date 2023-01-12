import java.util.Scanner;

public class help {

     public int inputNum() {
          try (Scanner mynum = new Scanner(System.in)) {
               int s = mynum.nextInt();
               return s;
          }
     }

     public void outputint(int s) {
          System.out.println(s);
     }

     public String inputstring() {
          try (Scanner mynum = new Scanner(System.in)) {
               String s = mynum.nextLine();
               return s;
          }
     }

     public void outputstring(String s) {
          System.out.println(s);
     }
}
