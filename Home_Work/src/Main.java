import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        PrintWriter aa = new PrintWriter("3.txt");

        BufferedReader F1 = new BufferedReader(new FileReader("1.txt"));
        BufferedReader F2 = new BufferedReader(new FileReader("2.txt"));


        String line1 = F1.readLine();
        String line2 = F2.readLine();

        while (line1 != null || line2 !=null) {
            if(line1 != null) {
                aa.println(line1);
                line1 = F1.readLine();
            }

            if(line2 != null) {
                aa.println(line2);
                line2 = F2.readLine();
            }
        }

        aa.flush();
        F1.close();
        F2.close();
        aa.close();

        System.out.println("\u001B[32mWELL");
    }
}