import java.util.*;
import java.io.*;

public class iofilemultimultiplication {

    public static void main(String args[]) {

        try {
            FileOutputStream fout = new FileOutputStream("iofilemultimultiplication.txt");

            Scanner sc = new Scanner(System.in);

            int i, a, n, j;

            System.out.println("from where would you start table ");
            a = sc.nextInt();

            System.out.println("from where would you end table ");
            n = sc.nextInt();

            for (i = a; i <= n; i++) {

                for (j = 1; j <= 10; j++) {

                    String data = "\n" + i + "x" + j + "=" + i * j;

                    byte x[] = data.getBytes();
                    fout.write(x);
                }

                String data1 = "\n\n";

                byte x1[] = data1.getBytes();
                fout.write(x1);

            }
            fout.close();
            System.out.println("Success");

        }

        catch (Exception e) {
            System.out.println(e);
        }

    }

}
