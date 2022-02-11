import java.io.*;

public class ReadsTextFile{
    public static void main (String []args) {
        try {
            FileReader tessa = new FileReader("Testimony.txt");
            BufferedReader reader = new BufferedReader(tessa);

            String c;
            while ((c = reader.readLine()) != null) {
                System.out.println(c);
            }
            reader.close();
        }catch (IOException e){
            System.out.println("the file you are looking for is not available...");
        }
    }
}
