
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Work {

    public static void SpaceDisk()  throws IOException {
        File file = new File("c:");
        long totalSpace = file.getTotalSpace(); // общее дисковое пространство в байтах.
        long freeSpace = file.getFreeSpace(); // нераспределенное / свободное дисковое пространство в байтах.
        System.out.println("Total size : " + totalSpace /1024 /1024 /1024 + " Gb");
        System.out.println("Space free : " + freeSpace /1024 /1024 /1024 + " Gb");
        if (freeSpace < 1 ) System.out.println("IOException");
        System.out.println("------------------- " );
    }
    public static void file() throws IOException {
        double a = 1073741824; // 1 гб
        long time = System.nanoTime();
        File test = new File("C:\\Users\\Эльвира\\Desktop\\test.txt");
        FileInputStream input = new FileInputStream(test);
        FileOutputStream output = new FileOutputStream(test);
        byte[] buf = new byte[4096]; //  максимальный размер файла
        while (test.length() < a) {
            int len = input.read(buf);
            output.write(buf);
        }
    }
}
