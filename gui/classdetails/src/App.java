import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.module.ResolutionException;
import java.util.Arrays;
import javax.swing.*;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;
public class App {
    public static void main(String[] args) throws Exception {
        interfacegui d = new interfacegui();
    }
}
class teacher {
    String name;
    String section;
    String Roll;
    String Father_name;
    int Fee_balance;
    teacher() {
    }
    teacher(String name, String section, String Roll, String Father_name, int Fee) throws IOException {
        this.name = name;
        this.section = section;
        this.Father_name = Father_name;
        this.Roll = Roll;
        this.Fee_balance = Fee;
        setdata();
    }
    void setdata() throws IOException {
        try (FileWriter f = new FileWriter("data.txt", true);
                BufferedWriter g = new BufferedWriter(f);
                PrintWriter p = new PrintWriter(g);) {
            g.write(name + " " + section + " " + Roll + " " + Father_name + " " + Fee_balance + "\n");
        }
    }
    String[] getdata(String name) throws IOException {
        String[] resut = null;
        try (FileReader f = new FileReader("data.txt");
                BufferedReader g = new BufferedReader(f);) {
            String s = g.readLine();
            while (s != null) {
                String[] d = s.split(" ");
                if (d[0].equals(name)) {
                    resut = d;
                }
                s = g.readLine();
            }
        }
        return resut;
    }
}
class interfacegui extends JFrame {
    JFrame frame = new JFrame("Teacher Portal");
    interfacegui() {
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        panel();
        frame.setSize(1650, 1080);
        frame.setVisible(true);
    }
    void panel() {
        JCheckBox d = new JCheckBox("Enter Details", false);
        JCheckBox s = new JCheckBox("Search Student", false);
        JButton sub = new JButton("Submit");
        sub.setSize(30, 10);
        JPanel p = new JPanel();
        p.add(d);
        p.add(s);
        p.add(sub);
        frame.getContentPane().add(p);
        sub.addActionListener((ActionListener) new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                if (d.isSelected()) {
                    JLabel s = new JLabel("entered data ");
                    p.add(s);
                    System.out.println("entered details");
                    new details();
                }
                if (s.isSelected()) {
                    search frame3 = new search();
                }
            }
        });
    }
}
class details extends teacher {
    JTextField name = new JTextField(16);
    JTextField section = new JTextField(16);
    JTextField roll = new JTextField(16);
    JTextField father_name = new JTextField(16);
    JTextField fee = new JTextField(16);
    JLabel n = new JLabel("Name        ");
    JLabel se = new JLabel("section     ");
    JLabel r = new JLabel("Roll        ");
    JLabel f = new JLabel("FatherName  ");
    JLabel fe = new JLabel("Fee Bal    ");
    JButton submiButton = new JButton("submit");
    JFrame frame = new JFrame("Detials portal");
    details() {
        JPanel p = new JPanel();
        p.setLayout(null);
        n.setBounds(500, 58, 150, 30);
        name.setBounds(580, 58, 300, 30);
        se.setBounds(500, 110, 150, 30);
        section.setBounds(580, 110, 300, 30);
        r.setBounds(500, 55 + 47 + 50, 150, 30);
        roll.setBounds(580, 55 + 47 + 50, 300, 30);
        f.setBounds(500, 55 + 47 * 2 + 50, 150, 30);
        father_name.setBounds(580, 55 + 47 * 2 + 50, 300, 30);
        fe.setBounds(500, 55 + 47 * 3 + 50, 300, 30);
        fee.setBounds(580, 55 + 47 * 3 + 50, 300, 30);
        submiButton.setBounds(650, 55 + 47 * 4 + 50, 100, 30);
        JPanel s = new JPanel();
        s.getLayout();
        JLabel d = new JLabel(name.getText() + " details added to database.....");
        JButton submitbutton = new JButton("next");
        submitbutton.setBounds(600, 55 + 47 * 5 + 50 + 50, 100, 30);
        JButton exitbutton = new JButton("Exit");
        d.setBounds(600, 55 + 47 * 4 + 50, 150, 150);
        exitbutton.setBounds(500, 55 + 47 * 5 + 50 + 50, 100, 30);
        submiButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    teacher t = new teacher(name.getText(), section.getText(), roll.getText(), father_name.getText(),
                            Integer.parseInt(fee.getText()));
                } catch (NumberFormatException | IOException e1) {
                    e1.printStackTrace();
                }
                frame.dispose();
                JFrame g = new JFrame();
                s.add(d);
                s.add(exitbutton);
                s.add(submitbutton);
                g.add(s);
                g.setVisible(true);
                g.setSize(1650, 1080);
                submitbutton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        // frame.dispose();
                        g.dispose();
                        interfacegui i = new interfacegui();
                    }

                });
                exitbutton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        frame.dispose();
                        System.exit(0);

                    }
                });
            }
        });
        frame.add(n);
        frame.add(name);
        p.add(se);
        p.add(section);
        p.add(r);
        p.add(roll);
        p.add(f);
        p.add(father_name);
        p.add(fe);
        p.add(fee);
        p.add(submiButton);
        frame.getContentPane().add(p);
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        frame.setSize(1650, 1080);
        p.getLayout();
        frame.setVisible(true);

    }

}

class search extends teacher {
    JFrame frame = new JFrame();
    JTextField nameOrRoll = new JTextField(20);
    JLabel name = new JLabel("Search By Name Or Roll  :");
    String[] result;
    JButton searchButton = new JButton("search");

    search() {

        name.setBounds(600, 55 + 47 * 4, 300, 30);
        nameOrRoll.setBounds(600, 55 + 47 * 5 + 50, 300, 30);
        searchButton.setBounds(650, 55 + 47 * 6 + 50 + 50 + 50, 100, 30);
        JPanel pe = new JPanel();
        pe.getLayout();
        pe.add(name);
        pe.add(nameOrRoll);
        pe.add(searchButton);
        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                teacher t = new teacher();
                try {
                    result = t.getdata(nameOrRoll.getText());
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
                frame.dispose();
                JLabel head = new JLabel("Search Results :");
                JLabel name = new JLabel("Name  :" + result[0]);
                JButton nexButton = new JButton("back");
                JLabel section = new JLabel("Section :" + result[1]);
                 JLabel Roll = new JLabel("Roll :" + result[2]);
                 JLabel Father = new JLabel("Father Name :" + result[3]);
                  JLabel fee = new JLabel("Fee  :" + result[4]);
                
                
                head.setBounds(600, 58, 300, 30);
                name.setBounds(600, 58+45, 150, 30);
                 section.setBounds(600,58+45*2, 300, 30);
                Roll.setBounds(600, 58+45*3, 300, 30);
                Father.setBounds(600, 58+45*4, 300, 30);
                fee.setBounds(600, 58+45*5, 300, 30);
                nexButton.setBounds(600,58+45*6, 300, 30);
                JFrame f = new JFrame("Search Box");
                JPanel pis = new JPanel();
                pis.setLayout(null);
                pis.add(head);
                pis.add(name);
                pis.add(section);
                pis.add(Roll);
                pis.add(Father);
                pis.add(fee);
                pis.add(nexButton);
                f.getContentPane().add(pis);
                f.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
                f.setSize(1650, 1080);
                pis.getLayout();
                f.setVisible(true);
                nexButton.addActionListener(new ActionListener() {

                    @Override
                    public void actionPerformed(ActionEvent e) {
                        f.dispose();
                        interfacegui i = new interfacegui();

                    }
                });
            }

        });
        frame.add(pe);
        frame.setSize(1650, 1080);
        frame.setVisible(true);
    }
}