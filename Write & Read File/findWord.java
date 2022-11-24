import java.io.File;
import java.util.Scanner;
import java.io.IOException;
import java.util.Arrays;

/* function return true/false if inputed word exists in file*/
public class findWord {
    public static void main(String[] args) {
        boolean result = getWord("giunge");
        System.out.println(result);
    }

    public static boolean getWord(String str) {

        File test = new File("test.txt");
        try {
            Scanner readTest = new Scanner(test);

            int countLine = 0;
            while (readTest.hasNextLine()) {
                countLine++;
                String[] line = readTest.nextLine().split(" ");
                for (int i = 0; i < line.length; i++) {
                    if (line[i].equals(str)) {
                        System.out.println(str + " found on line: " + countLine);
                        return true;
                    }
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }
}
