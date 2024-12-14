package CH5;

import java.net.*;
import java.io.*;

public class S3 {
    public static void main(String[] args) {
        String urlString = "https://www.example.com";

        try {
            URL url = new URL(urlString);
            BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));

            System.out.println("從 URL 讀取內容:");
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (MalformedURLException e) {
            System.err.println("URL 格式錯誤: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("讀取 URL 時發生錯誤: " + e.getMessage());
        }
    }
}
