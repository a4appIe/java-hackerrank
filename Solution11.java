// You are given a date. You just need to write the method, getDay , which returns the day on that date.

import java.io.*;
import java.time.DayOfWeek;
import java.time.LocalDate;

class Result {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

    public static String findDay(int month, int day, int year) {
        String mnth="";
        String dy="";
        if(month<10){
            mnth = "0"+String.valueOf(month);
        }else{
            mnth = String.valueOf(month);
        }
        if(day<10){
            dy = "0"+String.valueOf(day);
        }else{
            dy = String.valueOf(day);
        }
        StringBuilder date = new StringBuilder();
        date.append(year).append("-").append(mnth).append("-").append(dy);
        LocalDate dt = LocalDate.parse(date);
        DayOfWeek d = dt.getDayOfWeek();
        return d.toString();
    }
}

public class Solution11 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int month = Integer.parseInt(firstMultipleInput[0]);

        int day = Integer.parseInt(firstMultipleInput[1]);

        int year = Integer.parseInt(firstMultipleInput[2]);

        String res = Result.findDay(month, day, year);

        bufferedWriter.write(res);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

