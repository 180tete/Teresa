import java.io.*;
import java.net.Socket;

public class AddClient {
    public static void main(String[] args) throws Exception{
        Socket client_socket = new Socket("localhost", 2020);
        try {
            System.out.println("addition of 2 number : ");
            while (true){
                String Str="";
                BufferedReader user_input = new BufferedReader(new InputStreamReader(System.in));
                DataOutputStream client_out= new DataOutputStream(client_socket.getOutputStream());
                BufferedReader server_input = new BufferedReader(new InputStreamReader(client_socket.getInputStream()));
                for(int i=1; i<=2; i++){
                    System.out.println("Enter number: ");
                    Str = Str+user_input.readLine();
                }
                client_out.writeBytes(Str+"println");
                String Str3= server_input.readLine();
                System.out.println("sum is sum: "+ Str3);
                client_socket.close();
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}