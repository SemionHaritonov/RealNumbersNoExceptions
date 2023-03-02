import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Reader reader = new InputStreamReader(System.in);
        Scanner scanner = new Scanner(reader);
        double result = 0;

        while (scanner.hasNext()) {
            if (scanner.hasNextDouble()) result += scanner.nextDouble();
            else scanner.next();
        }

        PrintWriter writer = new PrintWriter(System.out);
        writer.printf("%.6f", result);
        writer.flush();
    }
}