import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.plaf.metal.MetalIconFactory.FileIcon16;

/*3. Create two classes Named Student and Teacher with required data members. Assume that the
information about the Student and Teacher is stored in a text file. Read n and m number of Student
and Teacher information from the File. Store the information in Array list of type Student and Teacher
Array List<Student> and Array List<Teacher>. Print the information of Teacher who taught OOPS
and Maths. Use Iterator and other functions of util in your program. */
class teacher {
     String name;
     String subject;
     int age;
     int salary;

     void setdata(String name, String subject, int age, int salary) {
          this.name = name;
          this.subject = subject;
          this.age = age;
          this.salary = salary;
     }

     void getdata() {
          System.out.println("name :" + this.name);
          System.out.println("subj :" + this.subject);
          System.out.println("age  :" + this.age);
          System.out.println("sala :" + this.salary);

     }
}

class student {
     String name;
     int std;
     String sec;

     void setdata(String name, int std, String or) {
          this.name = name;
          this.sec = or;
          this.std = std;
     }

     void getdata() {
          System.out.println("name :" + this.name);
          System.out.println("stdi :" + this.std);
          System.out.println("sect :" + this.sec);
     }
}

public class question3 {

     public static void main(String[] args) throws Exception {
          Scanner s = new Scanner(System.in);
          System.out.println("1.student data\n2.teacher data\npress choice :");
          int f = s.nextInt();
          switch (f) {
               case 1:
                    getstudentdata();
                    break;
               case 2:
                    getteacherdata();
                    break;
               default:
                    System.out.println("enter correct choice");
          }

     }

     static void getteacherdata() throws Exception {
          ArrayList<teacher> l = new ArrayList<>();
          FileReader f1 = new FileReader("teacher.txt");

          int count = 0;
          try {
               BufferedReader s = new BufferedReader(f1);

               String g = s.readLine();

               while (g != null) {
                    teacher test = new teacher();
                    String[] or = g.split(" ");
                    test.setdata(or[0], or[1], Integer.parseInt(or[2]), Integer.parseInt(or[3]));
                    l.add(test);
                    g = s.readLine();
                    count++;

               }
          } finally {
               if (f1 != null)
                    f1.close();
          }
          for (int i = 0; i < count; i++) {
               teacher w = new teacher();
               w = l.get(i);
               w.getdata();
               System.out.println("\n");
          }

     }

     static void getstudentdata() throws Exception {
          int count = 0;
          ArrayList<student> l = new ArrayList<>();
          FileReader f2 = new FileReader("student.txt");
          try {
               BufferedReader t = new BufferedReader(f2);
               String b = t.readLine();
               while (b != null) {

                    String[] or = b.split(" ");
                    student test = new student();
                    test.setdata(or[0], Integer.parseInt(or[1]), or[2]);
                    l.add(test);
                    b = t.readLine();
                    count++;
               }

          } finally {
               if (f2 != null) {
                    f2.close();
               }
          }
          for (int i = 0; i < count; i++) {
               student text = new student();
               text = l.get(i);
               text.getdata();
               System.out.println("\n");
          }
     }
}