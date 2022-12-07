import java.io.*;
public class FileNameToSize {
    public static void main(String[] args) throws IOException {
        FileNameToSize fileNameToSize = new FileNameToSize();
        fileNameToSize.fileName();
    }

    void fileName() throws IOException {
        try {
            FileReader in = new FileReader("a.txt");
            File in1 = new File("a.txt");
            FileWriter out = new FileWriter(in1.length() + ".txt");

            int c;
            while ((c = in.read()) != -1) {
                out.write(c);
            }
            in.close();
            out.close();
        } catch (FileNotFoundException e) {
            System.err.println("File open error: " + e.getMessage());
        }
        catch (IOException e) {
            System.err.println("File read/write error: " + e.getMessage());
        }
    }
}
