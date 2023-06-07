import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import javax.swing.*;

public class JComboBoxExample implements Serializable  {
    int a;
    int b;
    int c;
    public JComboBoxExample(int a[]){
        this.a = a[0];
        this.b = a[1];
        this.c = a[2];
    }
    public static void main(String [] args){
        JComboBoxExample jcb = new JComboBoxExample(new int[]{1,2,3});
        try(
        FileOutputStream stream = new FileOutputStream("ateafdgfadsddasdst.txt");
        ObjectOutputStream oos = new ObjectOutputStream(stream);){
        oos.writeObject(jcb);
        oos.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
        try(FileInputStream s=new FileInputStream("ateafdgfadsddasdst.txt");ObjectInputStream str=new ObjectInputStream(s);){
            JComboBoxExample jcb1 = (JComboBoxExample)str.readObject();
            System.out.println(jcb1.a);
            System.out.println(jcb1.b);
            System.out.println(jcb1.c);

        }
         catch (Exception e) {
            e.printStackTrace();
            // TODO: handle exception
        }

    }
}