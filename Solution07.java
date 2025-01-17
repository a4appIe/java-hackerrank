import java.util.*;

public class Solution07 {
    public static void main(String[] argh) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < t; i++) {
            try {
                long x = sc.nextLong();
                System.out.println(x + " can be fitted in:");
                if (x >= -128 && x <= 127)
                    System.out.println("* byte\n* short\n* int\n* long");
                else if (x >= -32768 && x <= 32767)
                    System.out.println("* short\n* int\n* long");
                else if (x >= -2147483648 && x <= 2147483647)
                    System.out.println("* int\n* long");
                else 
                    System.out.println("* long");
            } catch (Exception e) {
                System.out.println(sc.next() + " can't be fitted anywhere.");
            }

        }
        sc.close();
    }
}
