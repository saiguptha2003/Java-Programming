import java.util.*;

public class calculator {
     public static void main(String[] args) {
          System.out.println("___________ALL IN ONE CALCULATOR____________");
          System.out.println("1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Modulus\n6.Dec to Bin");
          calutil cal = new calutil();
          cal.additionSubstraction(false);

     }

}
class calutil {
     public void additionSubstraction(boolean d) {
          System.out.println("Enter numbers to add(to stop press 111):");
          int i = 1;
          double sum = 0;
          double difference = 0;
          Scanner s = new Scanner(System.in);
          int t = 0;
          if (d) {
               while (i == 1) {
                    t++;
                    System.out.printf("[%d]:", t);
                    double u = s.nextDouble();
                    if (u == 111) {
                         i = 0;
                         break;
                    }
                    sum = sum + u;
               }
               System.out.printf("total sum =%f", sum);
          } else {
               while (i == 1) {
                    t++;
                    System.out.printf("[%d]:", t);
                    double u = s.nextDouble();
                    if (u == 111) {
                         i = 0;
                         break;
                    }
                    difference = difference - u;
               }
               System.out.printf("total difference =%f", difference);

          }
     }
     public void multiply() {
          System.out.println("Enter numbers to multiply:");
          boolean i = true;
          int d = 0;
          Scanner s = new Scanner(System.in);
          double product = 1;
          while (i == true) {
               d++;
               System.out.printf("[%d]:", i);
               double e = s.nextDouble();
               if (e == 111) {
                    i = false;
                    break;
               } else {
                    product = product * e;
               }

          }
          System.out.printf("total product=%f", product);
     }
     public void divide() {
          Scanner s=new Scanner(System.in);
          System.out.println("Enter Numerator:");
          double n=s.nextDouble();
          System.out.println("Enter Denominator:");
          double d=s.nextDouble();
          double divide=n/d;
          System.out.printf("%f divided by %f =%d",n,d,divide);  
     }
}