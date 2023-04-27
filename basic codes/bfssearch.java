import java.io.IOException;
import java.io.*;
import java.util.*;

class prac1 {

    public static void main(String[] args) {
        Vector<Vector<Integer>> f = new Vector<Vector<Integer>>();
        for (int i = 0; i < 4; i++) {
            boolean e = true;
            Vector<Integer> g = new Vector<Integer>();
            while (e) {
                int a = new Scanner(System.in).nextInt();
                if (a == 7) {
                    e = false;
                    continue;
                }
                g.add(a);
            }
            f.add(g);
        }
        for (var i : f) {
            System.out.println(i);
        }
        boolean visited[] = new boolean[4];
        visited[0] = true;
        Queue<Integer> queue = new LinkedList<>();
        queue.add(0);
        while (!queue.isEmpty()) {
            int s = queue.peek();
            queue.poll();
            System.out.println(s);
            for (var i : f.get(s)) {
                if (visited[i]) {
                    break;
                } else {
                    visited[i] = true;
                    queue.offer(i);
                }
            }

        }
        System.out.println();

    }
}