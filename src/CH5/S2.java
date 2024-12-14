package CH5;

import java.io.*;

public class S2 {
    public static void main(String[] args) {
        String filename = "example.txt";
        
        // 寫入檔案
        try (FileWriter writer = new FileWriter(filename)) {
            writer.write("Hello, this is a test file.\n");
            writer.write("Java IO 寫檔示範。\n");
            System.out.println("檔案寫入完成: " + filename);
        } catch (IOException e) {
            System.err.println("寫入檔案時發生錯誤: " + e.getMessage());
        }

        // 讀取檔案
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            System.out.println("讀取檔案內容:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("讀取檔案時發生錯誤: " + e.getMessage());
        }
    }
}
