import java.util.*;
import java.io.*;

public class iofilenumberoddeven {

    public static void main(String args[]) {

        try {
            FileOutputStream fout = new FileOutputStream("iofilenumberoddeven.txt");

            Scanner sc = new Scanner(System.in);

            int a;
            int i, j;

            System.out.println("how many you want to number enter and evalute");
            a = sc.nextInt();

            String xxx = "even number\n";
            byte b[] = xxx.getBytes();
            fout.write(b);
            for (i = 0; i <= a; i++) {

                if (i % 2 == 0) {

                    String data = "\n" + i;

                    byte y[] = data.getBytes();

                    fout.write(y);
                }
            }

            String xx = "\n\n\nodd number\n";
            byte c[] = xx.getBytes();

            fout.write(c);

            for (i = 0; i <= a; i++) {

                if (i % 2 == 1) {
                    String data1 = "\n" + i;
                    byte d[] = data1.getBytes();

                    fout.write(d);
                }
            }

            fout.close();

            System.out.println("success");

        }

        catch (Exception e) {
            System.out.println(e);
        }
    }

}
