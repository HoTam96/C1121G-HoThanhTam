package ss17_string_regex.bai_tap.crawl_news;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class news {
//    htm">Thủ tướng Anh cảnh báo &quot;cuộc chiến chớp nhoáng&quot; ở Ukraine</a> </h3>

    private static final String URLNews = "http://dantri.com.vn/the-gioi.htm";
    private static final String regex = "htm\">(.*?)</a> ";

    public static void main(String[] args) {
        try {
            URL url = new URL(URLNews);
            Scanner sc = new Scanner(new InputStreamReader(url.openStream()));
            sc.useDelimiter("\\Z");
            String content = sc.next();
            sc.close();
            content = content.replaceAll("\\n+", "");
            Pattern pattern = Pattern.compile("^(htm\")>(.+?)</a> </h3>$");
            Matcher matcher = pattern.matcher(content);
            while (matcher.find()){
                System.out.println(matcher.group(1));
            }

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
