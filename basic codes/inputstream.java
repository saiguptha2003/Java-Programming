import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.io.Serializable;

class inputstream implements Serializable {
    int data;
    String name;

    public inputstream(int a, String b) {
        data = a;
        name = b;
    }

    public String toString() {
        return name + " " + data;
    }

    public static void main(String[] args) {
        try {
            FileOutputStream s = new FileOutputStream("next.txt");
            ObjectOutputStream f = new ObjectOutputStream(s);
            inputstream fs = new inputstream(34, "nsddsfsf");
            f.writeObject(fs);
            f.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            FileInputStream f = new FileInputStream("next.txt");
            ObjectInputStream s = new ObjectInputStream(f);
            inputstream sf = (inputstream) s.readObject();
            System.out.println(sf.data);
            s.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
