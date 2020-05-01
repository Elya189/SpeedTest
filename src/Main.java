import java.io.IOException;

public class Main {

    public static void main (String[] args) throws IOException {
        long startTime = System.currentTimeMillis();
        Work work = new Work();
        work.SpaceDisk();
        work.file();
        long timeSpent = System.currentTimeMillis() - startTime;
        System.out.println("Program process  " + timeSpent + " millis");
    }

}

