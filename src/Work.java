import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


public class Work {

    public static void SpaceDisk() throws IOException {
        File file = new File("c:");
        long totalSpace = file.getTotalSpace(); // общее дисковое пространство в байтах.
        long freeSpace = file.getFreeSpace(); // нераспределенное / свободное дисковое пространство в байтах.
        System.out.println("Total size : " + totalSpace / 1024 / 1024 / 1024 + " Gb");
        System.out.println("Space free : " + freeSpace / 1024 / 1024 / 1024 + " Gb");
        try {
            if (freeSpace > 1) System.out.println("Disk is ready");

        } catch (Exception e) {
            System.err.println(e);
        }
        System.out.println("------------------- ");
    }

    public static void file() throws IOException {
        long startTime = System.currentTimeMillis();
        double a = 1073741824; // максимально допустимый размер файла 1 гб
        File test = new File("C:\\Users\\Эльвира\\Desktop\\test.txt");
        // Создать новый файл, если его не существует
        if (test.createNewFile())
            System.out.println("File created");
        else {
            System.out.println("File already exists");
        }

        FileInputStream input = new FileInputStream(test);
        FileOutputStream output = new FileOutputStream(test);
        byte[] buf = new byte[4096]; // размер созданного файла в байтах
        while (test.length() < a) {
            int len = input.read(buf);
            output.write(buf);
        }
        long freeSpace = test.getFreeSpace();
        System.out.println("Space free : " + freeSpace / 1024 / 1024 / 1024 + " Gb");
        long timeSpent = System.currentTimeMillis() - startTime;
        System.out.println("Program process  " + timeSpent / 1000 + " sec");

        if (test.delete()) {
            System.out.println("File deleted successfully");
        } else {
            System.out.println("Failed to delete the file");
        }

    }
}
