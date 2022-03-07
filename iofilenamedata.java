import java.io.*;
import java.util.*;

public class iofilenamedata {

    public static void main(String args[]) {

        try {
            FileOutputStream fout = new FileOutputStream("iofilenamedata.txt");

            Scanner sc = new Scanner(System.in);

            String name, age, roll, div;

            System.out.println("enter your name");
            name = sc.nextLine();

            System.out.println("enter your age");
            age = sc.nextLine();

            System.out.println("enter your roll");
            roll = sc.nextLine();

            System.out.println("enter your div");
            div = sc.nextLine();

            String data = "Name : " + name + "\nEmail : " + age + "\nroll no : " + roll + "\ndiv : " + div;

            byte y[] = data.getBytes();
            fout.write(y);

            fout.close();

            System.out.println("success");

        }

        catch (Exception e) {
            System.out.println(e);

        }

    }
}
