import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Question_Sangeetha {
    public static void main(String[] args) {
        File inputFile1 = new File("input1.txt");
        File inputFile2 = new File("input2.txt");
        File outputFile = new File("output.txt");

        try {
            // Open input streams for the two files
            FileInputStream inputStream1 = new FileInputStream(inputFile1);
            FileInputStream inputStream2 = new FileInputStream(inputFile2);
            long length1 = inputFile1.length();
            long length2 = inputFile2.length();

            // Open an output stream for the output file
            FileOutputStream outputStream = new FileOutputStream(outputFile);

            // Write the lengths to the output file
            outputStream.write(("Length of " + inputFile1.getName() + ": " + length1 + " bytes\n").getBytes());
            outputStream.write(("Length of " + inputFile2.getName() + ": " + length2 + " bytes\n").getBytes());

            // Close the input and output streams
            inputStream1.close();
            inputStream2.close();
            outputStream.close();

            System.out.println("File lengths written to " + outputFile.getName());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
