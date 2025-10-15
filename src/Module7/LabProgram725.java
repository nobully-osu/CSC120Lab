package Module7;

import java.util.Scanner;
import java.io.FileInputStream;
import java.io.IOException;

public class LabProgram725 {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);

        String inputFileName;
        String fileName;
        FileInputStream fileNameStream = null;
        Scanner fileNameScanner = null;

        inputFileName = in.next();

        fileNameStream = new FileInputStream(inputFileName);
        fileNameScanner = new Scanner(fileNameStream);

        while(fileNameScanner.hasNext()){
            fileName = fileNameScanner.next();

            fileName = fileName.replace("_photo.jpg", "_info.txt");

            System.out.println(fileName);
        }
        fileNameStream.close();
    }
}
