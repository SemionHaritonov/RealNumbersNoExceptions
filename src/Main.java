import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Reader reader = new InputStreamReader(System.in);
        String stringLine;
        String regex = "[a-df-zA-Z]";
        Pattern pattern = Pattern.compile(regex);
        double result = 0;

        try (BufferedReader bufferedReader = new BufferedReader(reader)) {
            while ((stringLine = bufferedReader.readLine()) != null) {
                String[] lineAsArray = stringLine.split(" ");
                for (int counter = 0; counter < lineAsArray.length; counter++) {
                    Matcher matcher = pattern.matcher(lineAsArray[counter]);
                    if (!matcher.find() && !lineAsArray[counter].isEmpty()) {
                        result += Double.parseDouble(lineAsArray[counter]);
                    }
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.format("%.6f", result);
    }
}