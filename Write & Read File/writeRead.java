/* program read all lines of test.txt and writes them
  in output.txt inserting number of each line
*/

import java.io.File;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

public class writeRead {
    public static void main(String[] args) {
        try {

            File test = new File("test.txt");
            Scanner readTest = new Scanner(test);
            FileWriter writeFile = new FileWriter("output.txt");
            int sumLine = 0;

            while (readTest.hasNextLine()) {
                String print = "line " + (sumLine++) + " " + readTest.nextLine() + "\n";
                writeFile.write(print);
            }
            readTest.close();
            writeFile.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
