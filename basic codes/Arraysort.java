import java.util.*;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

import javax.print.attribute.IntegerSyntax;

class Arraysort {

    static class agecal implements Comparator<oldman> {
        @Override
        public int compare(oldman arg0, oldman arg1) {
            return Integer.valueOf(arg0.age).compareTo(Integer.valueOf(arg1.age));

        }
    }

    public static void main(String[] args) {
        oldman s[] = new oldman[4];
        char v = 's';
        int g = 19;
        s[0] = new oldman("fasfsd", 4);
        s[1] = new oldman("gfd", 3);
        s[2] = new oldman("1233", 100);
        s[3] = new oldman("lgkh", 1);
        List<oldman> sl = Arrays.asList(s[0], s[1], s[2], s[3]);
        Collections.sort(sl, new agecal());
        for (var x : sl) {
            x.display();
        }
    }

}

class oldman {
    String name;
    Integer age;

    oldman(String a, int b) {
        name = a;
        age = b;
    }

    void display() {
        System.out.println(name + " " + age);
    }

}
