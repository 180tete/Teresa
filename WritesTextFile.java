import java.io.*;


public class WritesTextFile {
    public static void main(String[] args) {
        try{
            FileWriter me = new FileWriter("Testimony.txt");
            PrintWriter tess = new PrintWriter(me);
            tess.println("What was i supposed to do without you? ");
            tess.println("I thank God for giving me a guardian angel and a blessing and a friend who is there whenever am down I LOVE U MY BEST FRIEND");
            tess.println("Who is there whenever am down I LOVE U MY BEST FRIEND");
            tess.println("Continue being of that kind thank you");

            tess.close();
        }catch (IOException e){
            System.out.println("Invalid");
        }

    }
}
