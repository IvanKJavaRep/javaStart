package personal.ivan.leetcode;
import java.io.*;
public class ReadFromFile {
    public static String ReadFile(String path) {
        BufferedReader bf;
        {
            try {
                String[] arr = new String[10];
                bf = new BufferedReader(new FileReader("file.txt"));
                for (int i = 0; i < 10; i++) {
                    arr[i] = bf.readLine();
                }
                return arr[arr.length-1];
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return "";
    }
}
