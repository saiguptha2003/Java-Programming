import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class filehand {
    public static void main(String[] args) throws IOException {
        String file1 = "f1.txt";
        Scanner read = new Scanner(new File(file1));
        StringBuffer sb = new StringBuffer();
        while (read.hasNextLine()) {
            sb.append(read.nextLine() + System.lineSeparator());
        }
        String fileContents = sb.toString();
        read.close();
        String dataline = "pandu";
        String userline = "sai";
        fileContents = fileContents.replaceAll(dataline, userline);
        try (
                FileWriter writer = new FileWriter(file1)) {
            writer.append(fileContents);
            writer.flush();
        }
    }
}