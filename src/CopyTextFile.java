import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class CopyTextFile {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your path source: ");
            String pathIn = sc.nextLine();
            FileInputStream in = new FileInputStream(pathIn);
            System.out.println("Enter your path source: ");
            String pathOut = sc.nextLine();
            FileOutputStream out = new FileOutputStream(pathOut);
            int flag;
            while ((flag = in.read())!= -1){
                out.write(flag);
            }
            in.close();
            out.close();
        }catch (Exception e){
            e.getStackTrace();
        }
    }
}
