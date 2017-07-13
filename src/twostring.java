/**
 * Created by jamesbaloney on 2017/7/10.
 */

import java.util.Scanner;

public class twostring {
    static Scanner sc = new Scanner(System.in);
    static String in;
    static boolean a;
    static boolean b;
    public static void main(String[] args) {
        in = sc.next();
        a = in.matches("^.*AB.*BA.*$");
        b= in.matches("^.*BA.*AB.*$");
        if (a == true || b==true) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
