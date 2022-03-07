import java.io.*;

public class iobufferoutput {

    public static void main(String args[]) {

        try {

            FileOutputStream fout = new FileOutputStream("iobufferoutput.txt");
            BufferedOutputStream bout = new BufferedOutputStream(fout);

            String data = "welcome to my java bufferfile";

            byte b[] = data.getBytes();
            bout.write(b);
            bout.flush();
            bout.close();
            fout.close();

            System.out.println("success");

        }

        catch (Exception e) {
            System.out.println(e);
        }
    }

}
