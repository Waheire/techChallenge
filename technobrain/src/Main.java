import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {


        Fibonacci();
            WordReverse();
        try {
            ServerLog();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }

    private static void Fibonacci() {
        // Input count T
        int T = 10;
        int count = T, num1=0, num2=1;

        System.out.print("Fibonacci numbers of "+count+" :");

        // loop
        for (int i = 1; i <= count; ++i)
        {
            System.out.print(num1+" ");

            // On each cycle, assign second number = first number
            //and assigning the sum of last two numbers = second number
            int sumOfPrevTwo = num1 + num2;
            num1 = num2;
            num2 = sumOfPrevTwo;
        }
    }

    private static void ServerLog() throws FileNotFoundException {
        File getCSVFiles = new File("/home/waheire/Documents/Projects/Java/technobrain/MOCK_DATA.csv");
        Scanner sc = new Scanner(getCSVFiles);
//        System.out.print("I reached here one");
        sc.useDelimiter(",");
        while (sc.hasNext()) {
            if (sc.hasNext(ip_address)){}

//            System.out.print("I reached here");
            System.out.print(sc.next());
        }
        sc.close();

    }


    private static void WordReverse() {
        //        word reverse function
            String str = "doctor";
            String nstr = "";
//            int lastDigit = str.length() - 1;
        char ch;

        System.out.print("\nOriginal word: " + str + "");

        for (int i=0; i<str.length(); i++)
        {
            ch= str.charAt(i); //extracts each character
            nstr= ch+ " " + nstr; //adds each character in front of the existing string
        }
        System.out.println("\nReversed word with space in between: "+ nstr);
    }


}




