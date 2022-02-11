import java.io.*;
import java.net.*;

public class AddServer {

    public static void main(String[] args) throws Exception {
        ServerSocket server_socket = new ServerSocket(2020);
        while (true) {
            Socket Listen_socket = server_socket.accept();
            System.out.println("server start.......");
            String Str1 = "";
            String[] temp;
            String del = "#";
            BufferedReader user_input = new BufferedReader(new InputStreamReader(Listen_socket.getInputStream()));
            DataOutputStream server_output= new DataOutputStream(Listen_socket.getOutputStream());
            Str1 = user_input.readLine();
            temp = Str1.split(del);
            double sum = 0.0;
            for (int i = 0; i < temp.length; i++) {
                float num = Float.parseFloat(temp[i]);
                sum = sum + num;
            }
            String Str2 = sum + "println";
            server_output.writeBytes(Str2);
            System.out.println("output send......");
        }
    }
}

