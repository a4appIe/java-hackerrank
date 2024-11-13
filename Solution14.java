import java.util.Scanner;

public class Solution14 {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of l
        smallest = s.substring(0, k);
        largest = s.substring(0, k);
        if(s.length()==k){
            smallest = s;
            largest = s;
        }
        for(int i=0; i<=s.length()-k; i++){
            String sub = s.substring(i, i+k);
            largest = sub.compareTo(largest) > 0 ? sub : largest;
            smallest = sub.compareTo(smallest) < 0 ? sub : smallest;
        }
        
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}