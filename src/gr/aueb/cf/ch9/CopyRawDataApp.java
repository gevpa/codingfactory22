package gr.aueb.cf.ch9;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyRawDataApp {

    public static void main(String[] args) {

        int b = 0;
        int count = 0;
        byte[] buffer = new byte[4096];
        long start, end;
        double elapsed;

        /**
         * ή αντι για το try που γράφουμε παρακάτω μπορούμε να γράψουμε:
         * try (BufferedInputStream in = new BufferedInputStream (new FileInputStream("C:/tmp/v1.mp4"));
 *              BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream("C:/tmp/v1out.mp4")) {
         * }
         */

        try (FileInputStream in = new FileInputStream("C:/tmp/v1.mp4");
             FileOutputStream out = new FileOutputStream("C:/tmp/v1out.mp4")) {

            start = System.currentTimeMillis();
            while ((b = in.read()) != -1) {
                out.write(buffer, 0, b);
                count += b;
            }

            end = System.currentTimeMillis();
            elapsed = (end - start) / 1000.0;
            System.out.println(elapsed + " secs");
            System.out.printf("%,.2f KB", Math.ceil ((double) count / 1024) );

        } catch (IOException e) {
            throw new RuntimeException();
        }

    }


}
