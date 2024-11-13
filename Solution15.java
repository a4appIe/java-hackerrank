import java.util.*;

public class Solution15 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String s = "";
        /* Enter your code here. Print output to STDOUT. */
        for (int i = A.length() - 1; i >= 0; i--) {
            s += A.charAt(i);
        }
        System.out.println(A.equals(s) ? "Yes" : "No");
    }
}
