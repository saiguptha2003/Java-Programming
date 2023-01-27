
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Hashtable;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.plaf.metal.MetalBorders.TextFieldBorder;

import org.w3c.dom.events.Event;

public class firstgui {
     public static void main(String[] args) {
          frame s = new frame();

     }
}

class frame extends JFrame {
     JFrame f = new JFrame("GUI Application");
     JButton b = new JButton("submit");
     JLabel l = new JLabel("enter word  :");
     JLabel status = new JLabel("", SwingConstants.CENTER);
     JLabel d = new JLabel("", SwingConstants.CENTER);
     JTextField s = new JTextField(16);
     JLayeredPane t=new JLayeredPane();
     JPanel p = new JPanel();
     JInternalFrame ee=new JInternalFrame();

     frame()
     {
          f.setVisible(true);
          f.setSize(1920,1280);
          createFrame();
          f.add(p);
     }

     void createFrame() {

          p.add(l);
          p.add(s);
          s.setHorizontalAlignment((int) TOP_ALIGNMENT);
          s.setAlignmentX(400);
          p.add(b);
          p.add(ee);
          p.getBackground();
          b.addActionListener((ActionListener) new ActionListener() {
               @Override

               public void actionPerformed(ActionEvent e) {
                    try {

                         question5 n = new question5();
                         String[] fin = n.getdata(s.getText());
                         status.setText("synonym : " + fin[0]);
                         d.setText("antonym : " + fin[1]);

                    } catch (Exception e1) {
                         e1.printStackTrace();
                    }
                    
                    d.setAlignmentX(BOTTOM_ALIGNMENT);
                    status.setAlignmentX(BOTTOM_ALIGNMENT);
                    ee.add(status);
                    d.setAlignmentX(BOTTOM_ALIGNMENT);
                    ee.add(d);
               }
          });
     }
}

class question5 {
     public static Hashtable<String, String> wm = new Hashtable<>();
     public static Hashtable<String, String> wo = new Hashtable<>();

     question5() {
     }

     String[] getdata(String find) throws Exception {
          dictionary s = new dictionary();
          s.setdata();
          String mean = wm.get(find);
          String opposite = wo.get(find);
          System.out.println("word : " + find + "\nsynonym : " + mean + "\nantonynm : " + opposite);
          String[] h = { mean, opposite };
          return h;

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

     dictionary() {
     }

     void setdata() throws Exception {
          FileReader f1 = new FileReader("data.txt");
          try {

               BufferedReader r = new BufferedReader(f1);
               String s = r.readLine();
               while (s != null) {
                    String[] p = s.split(" ");
                    dictionary d = new dictionary(p[0], p[1], p[2]);
                    s = r.readLine();
               }
          } finally {
               if (f1 != null) {
                    f1.close();
               }
          }
     }
}