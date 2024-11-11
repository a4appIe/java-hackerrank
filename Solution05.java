// Given an integer, N, print its first 10 multiples. Each multiple N x i (where 1<=i<=10) should be printed on a new line in the form: N x i = result.

import java.io.*;

public class Solution05 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());
        for(int i=1; i<=10; ++i){
            System.out.printf("%1s x %1s = %1s", n, i, n*i);
            System.out.println();
        }

        bufferedReader.close();
    }
}
