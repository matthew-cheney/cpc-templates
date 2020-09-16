import java.util.Scanner;
import java.util.Vector;

public class SumOfTheOthers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNextLine()){
            String line = sc.nextLine();

            if (line.strip().equals("")) {
                continue;
            }

            Vector<Integer> ints = new Vector<Integer>();

            for (String s : line.split(" ")) {
                ints.add(Integer.parseInt(s));
            }

            int answer = 0;

            // do your work here, store result in variable 'answer'
            // 'ints' is a list of integers

            System.out.println(answer);
        }
    }

}