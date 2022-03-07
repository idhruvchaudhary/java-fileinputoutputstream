import java.util.*;
import java.io.*;

public class iofilemultiplication {

    public static void main(String args[]) {
        try {

            FileOutputStream fout = new FileOutputStream("iofilemultiplication.txt");

            Scanner sc = new Scanner(System.in);

            int i, a;

            System.out.println("which multiplication would you want");
            a = sc.nextInt();

            for (i = 1; i <= 10; i++) {
                String data = "\n" + a + "x" + i + "=" + a * i;

                byte c[] = data.getBytes();
                fout.write(c);
            }

            fout.close();

            System.out.println("Success");

        }

        catch (Exception e) {
            System.out.println(e);
        }
    }

}
