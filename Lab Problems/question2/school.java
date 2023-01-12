/*2. Create three classes Named Student, Teacher, Parents. Student and Teacher class inherits Thread
class and Parent class implements Runnable interface. These three classes have run methods with
statements. The task of the teacher class of the first assignment has to be synchronized. Similarly, the
other two classes should have run methods with few valid statements under synchronized */
class student extends Thread {
     public void run() {
          for (int i = 0; i < 5; i++) {
               this.message();
               try {
                    Thread.sleep(5000);
               } catch (Exception e) {
               }

          }

     }

     public synchronized void message() {
          System.out.println("hai iam student      1");
     }

}

class teacher extends Thread {
     public void run() {
          for (int i = 0; i < 5; i++) {
               this.message();
               try {
                    Thread.sleep(5000);
               } catch (Exception e) {
               }

          }
     }

     public synchronized void message() {
          System.out.println("hai iam teacher    3");
     }

}

class parents implements Runnable {

     @Override
     public void run() {
          for (int i = 0; i < 5; i++) {
               this.message();
               try {
                    Thread.sleep(5000);
               } catch (Exception e) {
               }

          }
     }

     public synchronized void message() {
          System.out.println("hai iam parent     2");

     }

}

public class school {
     public static void main(String[] args) throws IllegalThreadStateException, InterruptedException {
          student a = new student();
          parents b = new parents();
          teacher c = new teacher();
          Thread t1 = new Thread(a, "student");
          Thread t2 = new Thread(b, "parents");
          Thread t3 = new Thread(c, "teacher");
          t1.start();
          try{
               Thread.sleep(1000);
          }
          catch(Exception e)
          {

          }
          t2.start();
          try {
               Thread.sleep(1000);
          } catch (Exception e) {
          }

          t3.start();
          try {
               Thread.sleep(5000);
          } catch (Exception e) {
          }

          t1.join();
          t2.join();
          t3.join();

     }
}