import java.util.*;

public class Solution06{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            
            int term = a;
            StringBuilder res = new StringBuilder();
            for(int j=0; j<n; ++j){
                term += Math.pow(2, j) * b;
                res.append(term).append(" ");
            }
            System.out.println(res.toString());
        }
        in.close();
    }
}