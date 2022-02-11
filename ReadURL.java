import java.net.*;
import java.io.*;

public class ReadURL {

    public static void main (String[] args) throws Exception{
        URL url = new URL( "http://mirrors.xmission.com/gutenbergesite/main.css");
        BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
        String inputLine;

        while((inputLine =in.readLine()) != null)
            System.out.println(inputLine);
            in.close();

    }
}
