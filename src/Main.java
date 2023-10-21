import java.io.*;
import java.util.ArrayList;
public class Main {

    static int[] x;
    static int[] y;
    static int F, G;
    static int[][] dis;
    static int test;
    static int w, h;
    static ArrayList<Integer> v; // Declare 'v' as a static variable


    public static void main(String[] args) throws IOException{
         FileReader fin = new FileReader("C:/Users/aarya/Downloads/input.txt");
         BufferedReader in = new BufferedReader(fin);
         FileWriter fout = new FileWriter("C:/Users/aarya/Downloads/input.txt");
         BufferedWriter bout = new BufferedWriter(fout);
         PrintWriter pout = new PrintWriter(bout);

        int T = Integer.parseInt(in.readLine());
        for (int kad = 1; kad <= T; kad++) {
            System.out.print("Case #" + kad + ": ");
            String st = in.readLine();
            String[] str = st.split(" ");
            int w = Integer.parseInt(str[0]);
            int h = Integer.parseInt(str[1]);
            int F = Integer.parseInt(str[2]);
            int G = Integer.parseInt(str[3]);

            x = new int[G];
            y = new int[G];
            dis = new int[G][G];
            v = new ArrayList<>(); // Initialize the ArrayList 'v'

            for (int i = 0; i < G; i++) {
                st = in.readLine();
                String str1[] = st.split(" ");
                x[i] = Integer.parseInt(str1[0]);
                y[i] = Integer.parseInt(str1[1]);
            }

            for (int i = 0; i < G; i++) {
                for (int j = 0; j < G; j++) {
                    dis[i][j] = Math.abs(x[i] - x[j]) + Math.abs(y[i] - y[j]);
                }
            }

            int mks = w + h - 2;
            test = 0;
            for (int i = 15; i >= 0; i--) {
                if (test + (1 << i) > mks) continue;
                test += (1 << i);
                if (!check(0)) test -= (1 << i);
                v.clear(); // Clear 'v' before next iteration
            }

            System.out.println(test);
        }
    }

    static boolean check(int cur) {
        if (v.size() == F) return true;
        if (cur == G) return false;
        boolean mogu = true;
        for (int y : v) {
            if (dis[cur][y] < test) {
                mogu = false;
                break;
            }
        }
        if (mogu) {
            v.add(cur);
            if (check(cur + 1)) return true;
            v.remove(v.size() - 1);
        }
        return check(cur + 1);
    }
}
