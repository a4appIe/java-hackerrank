import java.util.Scanner;

public class Solution08 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = 0;
        while(scan.hasNext()){
            String str = scan.nextLine();
            count++;
            System.out.println(count+" " + str);
        }
        scan.close();  
    }
}